package org.example;


import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public List<Comparable> sort(List<Comparable> input) {
        if (input == null) {
            throw new RuntimeException();
        }

        List<Comparable> result = new ArrayList<>(input);

        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.size() - i - 1; j++) {
                if (result.get(j) != null && result.get(j + 1) != null && result.get(j).compareTo(result.get(j + 1)) > 0) {
                    Comparable temp = result.get(j);
                    result.set(j, result.get(j + 1));
                    result.set(j + 1, temp);
                } else if (result.get(j) == null) {
                    result.remove(j);
                    j--;
                } else if (result.get(j + 1) == null) {
                    result.remove(j + 1);
                    j--;
                }
            }
        }
        return result;
    }
}
