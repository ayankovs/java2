package Homework3;

import java.util.*;

public class Telephons {

    private Map<String, HashSet<String>> hasharray;

    Telephons() {
        this.hasharray = new HashMap<>();
    }

    void add(String lastName, String phone) {
        HashSet<String> numbers;

        if (hasharray.containsKey(lastName)) {
            numbers = hasharray.get(lastName);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phone);
        hasharray.put(lastName, numbers);

    }

    Set<String> get(String lastName) {
        return hasharray.get(lastName);
    }

}
