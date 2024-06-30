package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> resultMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            if (!resultMap.containsKey(entry.getKey().length())) {
                resultMap.put(entry.getKey().length(), new HashSet<>());
                resultMap.get(entry.getKey().length()).add(entry.getKey());
            } else {
                resultMap.get(entry.getKey().length()).add(entry.getKey());
            }
        }
        return resultMap;
    }
}
