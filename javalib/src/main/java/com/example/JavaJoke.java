package com.example;

import java.util.ArrayList;
import java.util.Random;

public class JavaJoke {
    private ArrayList<String> jokeList;

    public JavaJoke() {
        jokeList = new ArrayList<>();
        jokeList.add("One");
        jokeList.add("2");
        jokeList.add("3");
        jokeList.add("4");
        jokeList.add("5");
        jokeList.add("6");
        jokeList.add("7");
        jokeList.add("8");
        jokeList.add("9");
        jokeList.add("10");
        jokeList.add("11");
    }

    public String getJoke() {
        Random r = new Random();
        return jokeList.get(r.nextInt(jokeList.size()));
    }
}
