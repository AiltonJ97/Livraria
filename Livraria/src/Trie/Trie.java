package Trie;

public class Trie {
	
	private TrieNode root;

    // Construtor
    public Trie() {
        root = new TrieNode();
    }

    // M�todo para inserir uma palavra na Trie
    public void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            current.children.putIfAbsent(ch, new TrieNode());
            current = current.children.get(ch);
        }
        current.isEndOfWord = true;
    }

    // M�todo para verificar se uma palavra est� presente na Trie
    public boolean search(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            if (!current.children.containsKey(ch)) {
                return false;
            }
            current = current.children.get(ch);
        }
        return current != null && current.isEndOfWord;
    }
	
}
