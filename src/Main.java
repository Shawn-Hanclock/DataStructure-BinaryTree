// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //For these binary trees the data cannot be negative.
        BinaryTree empty = new BinaryTree();
        System.out.println(empty);
        BinaryTree tree = new BinaryTree(1);
        System.out.println(tree);

        //You can add negative values, but it will turn positive.
        BinaryTree treeNeg = new BinaryTree(-1);
        System.out.println(treeNeg);

        BinaryTree bothTree = new BinaryTree(tree);

//        tree.addNode(1);
//        tree.addNode(2);
//        System.out.println(tree);
        System.out.printf("%s %s!%n", "Hello", "World");
    }
}