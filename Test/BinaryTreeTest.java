import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {
    BinaryTree empty = new BinaryTree();
    BinaryTree tree = new BinaryTree(1);
    @Test
    void emptyToStringPass()
    {
        String str = empty.toString();
        assertTrue(str.equals("Tree yet to be filled."));
    }
    @Test
    void emptyToStringFail()
    {
        assertFalse(empty.equals("Tree yet to be filled."));
    }
    @Test
    void emptyAddDataPass()
    {
        empty.addData(0);
        String str = empty.toString();
        assertTrue(str.equals("[0]"));
    }
    @Test
    void emptyGetRootDataPass()
    {
        empty.addData(0);
        Node root = empty.getRoot();
        assertEquals(0, root.getData());
    }
    @Test
    void emptyTreeLeafPass()
    {
        int leafs = empty.treeLeaf();
        assertEquals(1, leafs);
    }
    @Test
    void treeToStringPass()
    {
        assertEquals("[1]", tree.toString());
    }
    @Test
    void treeAddDataPass()
    {
        tree.addData(0);
        assertEquals("[0, 1]" , tree.toString());
    }
    @Test
    void treeAddDataTwicePass()
    {
        tree.addData(0);
        tree.addData(-1);
        assertEquals("[0, 1, -1]" , tree.toString());
    }
    @Test
    void treeRootDataPass()
    {
        Node root = tree.getRoot();
        assertEquals(root.getData(), 1);
    }
    @Test
    void treeDefaultLeafsPass()
    {
        int leaf = tree.treeLeaf();
        assertTrue(leaf == 1);
    }
    @Test
    void treeDefaultLeafsFail()
    {
        int leaf = tree.treeLeaf();
        assertFalse(leaf == 2);
    }
    @Test
    void treeAddedLeafsPass()
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
    void treeAddedToStringPass()
    {
        int n = 5;
        for(int i = 2; i <= n; i++) {
         tree.addData(i);
        }
        String expected = "[4, 2, 5, 1, 3]";
        assertEquals(expected, tree.toString());
    }

    int[] dataFromTree = tree.toArray();
    BinaryTree treeArr = new BinaryTree();
    @Test
    void treeArrAddedViaToArrayPass()
    {
        treeArr.addData(dataFromTree);
        assertTrue(treeArr.toArray().equals(dataFromTree));
    }
}