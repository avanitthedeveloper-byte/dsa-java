// 2. Convert BST to Balanced BST

import java.util.ArrayList;

public class B {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void putInArray(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        putInArray(root.left, arr);
        arr.add(root.data);
        putInArray(root.right, arr);
    }

    public static Node bstToBalBST(ArrayList<Integer> arr, int si, int ei) {
        if (si > ei) {
            return null;
        }
        int mid = si + (ei - si) / 2;
        Node root = new Node(arr.get(mid));
        root.left = bstToBalBST(arr, si, mid - 1);
        root.right = bstToBalBST(arr, mid + 1, ei);

        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        preorder(root);
        System.out.println();
        ArrayList<Integer> arr = new ArrayList<>();
        putInArray(root, arr);
        root = bstToBalBST(arr, 0, (arr.size() - 1));
        preorder(root);
    }
}