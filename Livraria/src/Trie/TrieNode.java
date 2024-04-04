package Trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
	
	Map<Character, TrieNode> children;
    boolean isEndOfWord;

    // Construtor
    public TrieNode() {
        children = new HashMap<>();
        isEndOfWord = false;
    }
}
