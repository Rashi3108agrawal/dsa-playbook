class TrieNode{
    TrieNode child[] = new TrieNode[26];
    boolean end = false;
}
class Trie {

    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node = root;
        for(char c: word.toCharArray()){
            if(node.child[c-'a'] ==null){
                node.child[c-'a'] = new TrieNode();
            }
            node = node.child[c-'a'];
        }
        node.end =true;
    }
    
    public boolean search(String word) {
        TrieNode node = root;
        for(char c: word.toCharArray()){
            if(node.child[c-'a'] ==null){
                return false;
            }
            node = node.child[c-'a'];
        }
        return node.end;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(char c: prefix.toCharArray()){
            if(node.child[c-'a'] ==null){
                return false;
            }
            node = node.child[c-'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */