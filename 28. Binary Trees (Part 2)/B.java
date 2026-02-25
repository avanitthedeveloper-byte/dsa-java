
// 2. Diameter of a Tree (Approach 2)
import java.util.*;

public class B {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // Preorder Traversal
        public static void preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        // Inorder Traversal
        public static void inorder(Node root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        // Postorder Traversal
        public static void postorder(Node root) {
            if (root == null) {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        // Levelorder Traversal
        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);

                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        // height of Tree
        public static int height(Node root) {
            if (root == null) {
                return 0;
            }

            int lh = height(root.left);
            int rh = height(root.right);
            int height = Math.max(lh, rh) + 1;
            return height;
        }

        // count of Node in Tree
        public static int count(Node root) {
            if (root == null) {
                return 0;
            }

            int lh = count(root.left);
            int rh = count(root.right);
            int count = lh + rh + 1;
            return count;
        }

        // sum of all Node in Tree
        public static int sum(Node root) {
            if (root == null) {
                return 0;
            }

            int lh = sum(root.left);
            int rh = sum(root.right);
            int sum = lh + rh + root.data;
            return sum;
        }

        // diameterOfTree (Approach 1)
        public static int findDiameter(Node root) {
            if (root == null) {
                return 0;
            }
            int leftDia = findDiameter(root.left);
            int leftHeight = height(root.left);
            int rightDia = findDiameter(root.right);
            int rightHeight = height(root.right);
            int selfDia = leftHeight + rightHeight + 1;
            return Math.max(Math.max(leftDia, rightDia), selfDia);
        }

        // diameterOfTree (Approach 2)
        public static class Info {
            int dia;
            int ht;

            Info(int dia, int ht) {
                this.dia = dia;
                this.ht = ht;
            }
        }

        public static Info diameter(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }
            Info leftInfo = diameter(root.left);
            Info righInfo = diameter(root.right);

            int selfDia = Math.max(Math.max(leftInfo.dia, righInfo.dia), leftInfo.ht + righInfo.ht + 1);
            int ht = Math.max(leftInfo.ht, righInfo.ht) + 1;

            return new Info(selfDia, ht);
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(tree.diameter(root).dia);
    }
}