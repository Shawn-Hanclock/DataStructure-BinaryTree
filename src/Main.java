// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //For these binary trees the data cannot be negative.
        BinaryTree empty = new BinaryTree();
        System.out.println(empty);
        empty.addData(0);
        System.out.println("empty: " + empty);

        BinaryTree tree = new BinaryTree(100);
        System.out.println("tree: " + tree);
        tree.addData(200);
        System.out.println("tree: " + tree);
        tree.addData(300);
        System.out.println("tree: " + tree);
        System.out.println("tree leafs: " + tree.getRoot().leafCount());
        tree.addData(400);
        System.out.println("tree: " + tree);
        tree.addData(500);
        System.out.println("tree: " + tree);
        tree.addData(600);
        System.out.println("tree: " + tree);
        tree.addData(700);
        System.out.println("tree: " + tree);
        tree.addData(800);
        System.out.println("tree: " + tree);
        System.out.println("tree leafs: " + tree.getRoot().leafCount());
        // tree.getLeft().addNew()

        System.out.printf("%s %s!%n", "Hello", "World");
    }
}