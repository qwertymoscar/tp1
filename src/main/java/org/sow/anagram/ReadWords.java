package org.sow.anagram;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadWords implements WordsProvider {

    Set<String> words = null;
    @Override
    public Set<String> getWords() {
        Path path = Path.of("files/wordlist_cleaned.txt");

        try (Stream<String> Lines = Files.lines(path);) {

            words = Lines.map(mot -> mot.toLowerCase()).collect(Collectors.toSet());
            System.out.println("# words Set = " + words.size());

        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }
}
