import java.util.*;

public class horizontal_view_binary_tree {
    class Treenode {
        char value;
        Treenode left;
        Treenode right;

        public Treenode(char value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public List<Character> horizontalView(Treenode root) {
        List<Character> l = new ArrayList<>();
        if (root == null) {
            return l;
        }
        Queue<Treenode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                Treenode node = queue.poll();
                l.add(node.value);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return l;
    }

    public static void main(String[] args) {
        horizontal_view_binary_tree tree = new horizontal_view_binary_tree();
        Treenode root = tree.new Treenode('A');
        root.left = tree.new Treenode('B');
        root.right = tree.new Treenode('C');
        root.left.left = tree.new Treenode('D');
        root.left.right = tree.new Treenode('E');
        root.right.left = tree.new Treenode('F');
        root.right.right = tree.new Treenode('G');
        List<Character> horizontalViewResult = tree.horizontalView(root);

        // Printing the Horizontal View
        System.out.print("Horizontal View: ");
        for (char node : horizontalViewResult)
            System.out.print(node + " ");
        System.out.println();
    }
}