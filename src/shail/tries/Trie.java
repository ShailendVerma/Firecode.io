package shail.tries;

import java.util.Map;

class Trie {
    private TrieNode root;

    public static void main(String args[]){
        Trie t = new Trie();
        t.insertWord("FIRES");
        t.insertWord("FIRED");
        System.out.println(t.searchPrefix("FIRE"));
        System.out.println(t.searchWord("FIRE"));
    }

    // Implement these methods : 
    public Trie() {}

    public void insertWord(String word) {

        if(word == null || "".equals(word)) return;

        char[] chars = word.toCharArray();
        if(root == null){ root = new TrieNode(null); }
        TrieNode current = root;

        for(int i=0; i< chars.length;i++)
        {
            Map<Character,TrieNode> children = current.children;
            char c = chars[i];
            if(children.containsKey(c))
            {
                current = children.get(c);
            }else{
                TrieNode child = new TrieNode(c);
                children.put(c,child);
                current = child;
            }
            current.isLeaf = (i == chars.length-1);
        }

    }
    public Boolean searchWord(String word) {

        if(root == null)return false;
            char[] chars = word.toCharArray();
            TrieNode current =root;

            for (char aChar : chars) {

                if (current.children.containsKey(aChar)) {
                    current = current.children.get(aChar);
                } else {
                    return false;
                }

            }
            return (current.isLeaf);
        }

    public Boolean searchPrefix(String word) {
        if(root == null)return false;
        char[] chars = word.toCharArray();
        TrieNode current =root;

        for (char aChar : chars) {

            if (current.children.containsKey(aChar)) {
                current = current.children.get(aChar);
            } else {
                return false;
            }

        }
        return true;
    }
}