package org.sow.anagram;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GetMap implements MapProvider {
    List<String> map;
    AnagramSolverService anagramSolver = new AnagramSolver();

    public List<String> getMap(Map<Object, List<String>> sentence) {
        sentence = map.stream().collect(Collectors.groupingBy(e->anagramSolver.sortChars(e)));
        return map;
    }

    @Override
    public List<String> getMap1(String sentence) {

        return null;
    }

    Set<String> words ;
    String sentence ;
    @Override
    public String splitList() {
        for(String a : words) {
            sentence = a +",";
        }
        return sentence;
    }

    @Override
    public String splitList(List<String> sentence) {
        // TODO Auto-generated method stub
        return null;
    }
}
