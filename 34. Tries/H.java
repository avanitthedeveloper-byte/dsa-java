// 8. startsWith Problem

public class H {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;
        int freq;

        Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void findPreFix(Node root, String ans) {
        if (root == null) {
            return;
        }

        if (root.freq == 1) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                findPreFix(root.children[i], ans + (char) (i + 'a'));
            }
        }
    }

    public static boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String arr[] = { "apple", "app", "mango", "man", "woman" };
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        System.out.println(startsWith("app"));
        System.out.println(startsWith("moon"));
    }
}