
public class TrieRunner {
	
	class TrieNode{
		char ch;
		boolean isWord;
		TrieNode[] nodes = new TrieNode[26];
		TrieNode() {
			this.ch = '\0';
			this.isWord = false;
		}
	}
	
	class Trie{
		TrieNode head;
		Trie(){
			this.head = new TrieNode();
		}
		
		void insert(TrieNode head, String s) {
			if(s == "") return;
			int id = Character.toUpperCase(s.charAt(0)) - 'A';
			if(this.head.nodes[id] != null) {
				insert(head, s.substring(1));
			}else {
				TrieNode cur = new TrieNode();
				cur.ch = s.charAt(0);
				if( s.length() == 1) {
					cur.isWord = true;
				}else {
					cur
				}
			}
		}
	}

	public static void main(String[] args) {
		
	}

}
