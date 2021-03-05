package org.sow.anagram;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Anagram {
    public static void main(String[] args) {
        AnagramSolverService anagramSolver = new AnagramSolver();
        AnagramService anagramService = new AnagramServiceImp(anagramSolver) ;
        WordsProvider wordsProvider = new ReadWords();
        Set<String> words = wordsProvider.getWords();
        anagramService.findLongestAnagramFrom(words);

        Map<String, List<String>> map = words.stream()
                .collect(
                        Collectors.groupingBy(e->anagramSolver.sortChars(e))
                );

        Map.Entry<String, List<String>> entry1 =  map.entrySet().stream()
                .filter(e -> e.getValue().size()>=2)
                .max(Map.Entry.comparingByKey(Comparator.comparing(String::length)))
                .orElseThrow();

        System.out.println("# Le plus long Anagram");
        entry1.getValue().forEach(System.out::println);
    }
}
