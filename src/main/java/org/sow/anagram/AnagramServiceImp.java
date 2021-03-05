package org.sow.anagram;

import java.util.Set;

public class AnagramServiceImp implements AnagramService {

    private AnagramSolverService anagramSolver ;

    public AnagramServiceImp(AnagramSolverService anagramSolver) {
        this.anagramSolver = anagramSolver;
    }

    @Override
    public Set<String> findLongestAnagramSetFrom(Set<String> words) {
        return Set.of();
    }

    @Override
    public Set<String> findLongestAnagramFrom(Set<String> words) {
        return Set.of();
    }
}
