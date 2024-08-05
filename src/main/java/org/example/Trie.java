package org.example;

public class Trie {
    private Trie[] letters = new Trie[26];
    private boolean isWord;

    public void insert(String word) {
        Trie node = this;
        for(char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.letters[index] == null) {
                node.letters[index] = new Trie();
            }
            node = node.letters[index];
        }
        node.isWord = true;
    }
    public boolean search(String word) {
        Trie node = this;
        for(char c : word.toCharArray()) {
            node = node.letters[c - 'a'];
            if (node == null) {
                return false;
            }
        }
        return node.isWord;
    }
    public boolean startsWith(String prefix) {
        Trie node = this;
        for(char c : prefix.toCharArray()) {
            node = node.letters[c - 'a'];
            if (node == null) {
                return false;
            }
        }
        return true;
    }
}
