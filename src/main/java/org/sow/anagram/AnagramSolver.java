package org.sow.anagram;

import java.util.Arrays;
import java.util.Objects;

public class AnagramSolver implements AnagramSolverService {

    public boolean isAnagram(String sentence1, String sentence2) {
        String sortedSentence1 = sortChars(sentence1);
        String sortedSentence2 = sortChars(sentence2);
        return Objects.equals(sortedSentence1, sortedSentence2) ;
    }

    public String sortChars(String sentence) {
        char[] charArray1 = sentence.toLowerCase().toCharArray();
        Arrays.sort(charArray1);
        String sortedSentence1 = new String(charArray1);
        return sortedSentence1.trim() ;
    }
}
