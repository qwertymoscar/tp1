package org.sow.palindrome;

public class PalindromeSolver {
    public boolean isPalindrome(String sentence) {
        String sentenceFormat = sentence.replaceAll("\\s", "").toLowerCase();
        int fromRight = sentenceFormat.length()-1;
        int fromLeft = 0;

        while(fromRight > fromLeft) {
            if(sentenceFormat.charAt(fromRight) != sentenceFormat.charAt(fromLeft)) {
                return false;
            }
            fromRight --;
            fromLeft ++;
        }
        return true ;
    }

    /**
    public String reverseString(String sentence) {
        StringBuilder reverse = new StringBuilder();
        String clean = sentence.replaceAll(" ", "").toLowerCase();
        char[] plain = clean.toCharArray();
        for (int i = plain.length - 1; i >= 0; i--) {
            reverse.append(plain[i]);
        }
        return reverse.toString();
    }
    */
}