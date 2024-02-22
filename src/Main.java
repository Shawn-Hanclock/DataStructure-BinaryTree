// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //For these binary trees the data cannot be negative.
        BinaryTree empty = new BinaryTree();
        System.out.println(empty);
        empty.addData(0);
        System.out.println("empty: " + empty);

        BinaryTree tree = new BinaryTree(1);
        System.out.println("tree: " + tree);
        tree.addData(2);
        System.out.println("tree: " + tree);
        tree.addData(3);
        System.out.println("tree: " + tree);
        System.out.println("tree leafs: " + tree.getRoot().leafCount());
        tree.addData(4);
        System.out.println("tree: " + tree);
        tree.addData(5);
        System.out.println("tree: " + tree);
        tree.addData(6);
        System.out.println("tree: " + tree);
        tree.addData(7);
        System.out.println("tree: " + tree);
        tree.addData(8);
        System.out.println("tree: " + tree);
        tree.addData(9);
        System.out.println("tree: " + tree);
        tree.addData(10);
        System.out.println("tree: " + tree);
        tree.addData(11);
        System.out.println("tree: " + tree);
        tree.addData(12);
        System.out.println("tree: " + tree);
        tree.addData(13);
        System.out.println("tree: " + tree);
        tree.addData(14);
        System.out.println("tree: " + tree);
        tree.addData(15);
        System.out.println("tree: " + tree);
        tree.addData(16);
        System.out.println("tree: " + tree);
        tree.addData(17);
        System.out.println("tree: " + tree);
        tree.addData(18);
        System.out.println("tree: " + tree);
        tree.addData(19);
        System.out.println("tree: " + tree);
        System.out.println("tree leafs: " + tree.getRoot().leafCount());
        // tree.getLeft().addNew()

        System.out.printf("%s %s!%n", "Hello", "World");
    }
}