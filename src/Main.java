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

        System.out.printf("%s %s!%n", "Hello", "World");
    }
}