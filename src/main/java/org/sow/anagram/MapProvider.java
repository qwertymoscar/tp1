package org.sow.anagram;

import java.util.List;
import java.util.Map;

public interface MapProvider {

    List<String> getMap(Map<Object, List<String>> sentence);

    String  splitList(List<String> sentence);

    List<String> getMap1(String sentence);

    String splitList();
}
