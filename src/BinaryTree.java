public class BinaryTree
{
    // variables
    private Node root;

    // constructor
    public BinaryTree(int data)
    {
        root = new Node(data);
    }
    public BinaryTree(int[] data)
    {
        root = new Node();
        for(int val: data)
        {
            this.addData(val);
        }
    }
    public BinaryTree()
    {
        root = new Node();
    }

    //getter
    public Node getRoot()
    {
        return root;
    }

    //brain methods
    public int treeLeaf() {
        return root.leafCount();
    }
    public void addData(int data)
    {
       if(root.getData() == null) {
           root.setData(data);
       }
       else {
            root.addNew(data);
       }
    }
    public String toString()
    {
        String out = root.printBranches();
        return out.equals("")? "Tree yet to be filled.": "[" + out.replaceAll(" ", ", ") + "]";
    }
}
