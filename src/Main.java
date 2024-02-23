public class Main {
    public static void main(String[] args) {
        /* Notes of what to be added:
        - an alternative traversal for the toString
        - an insert method that inserts at a specific node
        - make a fancy output that prints it in console to look like a tree*/

        //an empty binary tree
        BinaryTree empty = new BinaryTree();
        System.out.println("empty: " + empty);
        empty.addData(0);
        System.out.println("empty: " + empty);
        System.out.println("empty root: " + empty.getRoot());
        System.out.println("empty leafs: " + empty.treeLeaf());

        BinaryTree tree = new BinaryTree(1);
        tree.addData(2);
        tree.addData(3);
        System.out.println("tree: " + tree);
        System.out.println("tree root: " + tree.getRoot());
        System.out.println("tree leafs: " + tree.treeLeaf());
        tree.addData(new int[]{4,5,6,7});
        System.out.println("tree: " + tree);
        System.out.println("tree root: " + tree.getRoot());
        System.out.println("tree leafs: " + tree.treeLeaf());

        int[] data = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        BinaryTree treeArr = new BinaryTree(data);
        System.out.println("treeArr: " + treeArr);
        System.out.println("treeArr root: " + treeArr.getRoot().getData());
        System.out.println("treeArr leafs: " + treeArr.treeLeaf());

        System.out.printf("%n%s %s!%n", "Hello", "World");
    }
}