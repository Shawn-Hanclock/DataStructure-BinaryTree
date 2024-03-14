import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {
    BinaryTree empty = new BinaryTree();
    BinaryTree tree = new BinaryTree(1);
    @Test
    void emptyToString()
    {
        String str = empty.toString();
        assertTrue(str.equals("Tree yet to be filled."));
    }
    @Test
    void emptyToArray()
    {
        int[] treeData = empty.toArray();
        assertTrue(treeData == null);
    }
    @Test
    void emptyAddData()
    {
        empty.addData(0);
        String str = empty.toString();
        assertTrue(str.equals("[0]"));
    }
    @Test
    void emptyGetRootData()
    {
        Node root = empty.getRoot();
        assertEquals(null, root.getData());
    }
    @Test
    void emptyTreeLeaf()
    {
        int leafs = empty.treeLeaf();
        assertEquals(1, leafs);
    }
    @Test
    void treeToString()
    {
        assertEquals("[1]", tree.toString());
    }
    @Test
    void treeAddData()
    {
        tree.addData(0);
        assertEquals("[0, 1]" , tree.toString());
    }
    @Test
    void treeAddDataTwice()
    {
        tree.addData(0);
        tree.addData(-1);
        assertEquals("[0, 1, -1]" , tree.toString());
    }
    @Test
    void treeRootData()
    {
        Node root = tree.getRoot();
        assertEquals(root.getData(), 1);
    }
    @Test
    void treeAddedLeafs()
    {
        int n = 4;
        for(int i = 0; i <= n; i++) {
         tree.addData(i);
        }
        int N = n+1;
        int expected = (N + 1) / 2;
        assertEquals(expected, tree.treeLeaf());
    }
    @Test
    void treeAddedToString()
    {
        int n = 5;
        for(int i = 2; i <= n; i++) {
         tree.addData(i);
        }
        String expected = "[4, 2, 5, 1, 3]";
        assertEquals(expected, tree.toString());
    }
    int[] dataArray = {1, 2, 3, 4, 5};
    @Test
    void emptyAddViaArray()
    {
        empty.addData(dataArray);
        System.out.println(empty);
        System.out.println(Arrays.toString(dataArray));
        assertEquals("[4, 2, 5, 1, 3]", empty.toString());
    }
}