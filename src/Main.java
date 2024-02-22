// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //For these binary trees the data cannot be negative.
        BinaryTree empty = new BinaryTree();
        System.out.println(empty);
        empty.addData(0);
        System.out.println("empty: " + empty);
        System.out.println("empty leafs: " + empty.treeLeaf());

        BinaryTree tree = new BinaryTree(1);
        tree.addData(2);
        tree.addData(3); 
        tree.addData(4);
        tree.addData(5);
        tree.addData(6);
        tree.addData(7);
        tree.addData(8);
        tree.addData(9);
        tree.addData(10);
        tree.addData(11);
        tree.addData(12);
        tree.addData(13);
        tree.addData(14);
        tree.addData(15);
        tree.addData(16);
        tree.addData(17);
        tree.addData(18);
        tree.addData(19);
        System.out.println("tree: " + tree);
        System.out.println("tree leafs: " + tree.treeLeaf());

        int[] nums = {0,1,2,3,4,5,6,7,8,9,10};
        BinaryTree treeArr = new BinaryTree(nums);
        System.out.println("treeArr: " + treeArr);
        System.out.println("treeArr leafs: " + treeArr.treeLeaf());

        System.out.printf("%n%s %s!%n", "Hello", "World");
    }
}