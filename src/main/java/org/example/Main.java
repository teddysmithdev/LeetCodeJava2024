package org.example;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Codec codec = new Codec();
        List<String> input = Arrays.asList("hello", "world");
        String encoded = codec.encode(input);
        List<String> decoded = codec.decode(encoded);
    }
}