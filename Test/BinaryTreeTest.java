import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {
    BinaryTree empty = new BinaryTree();
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
    void emptyAddDataFail()
    {
        empty.addData(0.2);
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
}