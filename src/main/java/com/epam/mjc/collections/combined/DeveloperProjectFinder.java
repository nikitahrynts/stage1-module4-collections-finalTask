package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> devProjects = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) devProjects.add(entry.getKey());
        }
        devProjects.sort((o1, o2) -> {
            int lengthDiff = Integer.compare(o2.length(), o1.length());
            if (lengthDiff == 0) {
                return o1.compareTo(o2) * -1;
            }
            return lengthDiff;
        });
        return devProjects;
    }
}
