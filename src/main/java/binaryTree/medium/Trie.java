package binaryTree.medium;

/**
 * 实现 Trie (前缀树)
 *
 * @link {https://leetcode.cn/problems/implement-trie-prefix-tree/}
 */
public class Trie {

    public Trie[] children;
    public boolean isEnd;

    public Trie() {
        children = new Trie[26];
        isEnd = false;
    }

    public void insert(String word) {

        Trie trie = this;
        for (int i = 0; i < word.length(); i++) {
            char charAt = word.charAt(i);
            int code = charAt - 'a';
            if (trie.children[code] == null) {
                trie.children[code] = new Trie();
            }
            trie = trie.children[code];
        }
        trie.isEnd = true;

    }

    public boolean search(String word) {

        Trie trie = this;
        for (int i = 0; i < word.length(); i++) {
            char charAt = word.charAt(i);
            int code = charAt - 'a';
            if (trie.children[code] == null){
                return false;
            }
            trie = trie.children[code];
        }
        return trie.isEnd;
    }

    public boolean startsWith(String prefix) {
        Trie trie = this;
        for (int i = 0; i < prefix.length(); i++) {
            char charAt = prefix.charAt(i);
            int code = charAt - 'a';
            if (trie.children[code] == null){
                return false;
            }
            trie = trie.children[code];
        }
        return true;
    }
}
