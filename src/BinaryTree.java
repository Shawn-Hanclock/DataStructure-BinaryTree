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
        for(int n: data) {
            this.addData(n);
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
       if(root.getData() != null) root.addNew(data);
       else root.setData(data);
    }
    public void addData(int[] data)
    {
        for(int n: data) {
            if(root.getData() != null) root.addNew(n);
            else root.setData(n);
        }
    }
    public String toString()
    {
        String out = root.printBranches();
        return out.equals("")? "Tree yet to be filled."
                :"[" + out.replaceAll(" ", ", ") + "]";
    }
}
