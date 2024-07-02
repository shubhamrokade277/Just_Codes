package Tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(5);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(7);

        System.out.println("preorder:");
        tree.preorderRec(tree.root);

        System.out.println();
        System.out.println("inorder:");
        tree.inorderRec(tree.root);

        System.out.println();
        System.out.println("postorder:");
        tree.postorderRec(tree.root);

        System.out.println();
        System.out.println("BFS:");
        tree.bfs();

        System.out.println();
        System.out.println("DFS:");
        tree.dfs();
    }
}
