// [] add elements
// [] remove elemeents
// [] tranverse elements
// [] output data in strucuture
public class BinaryTree
{
    // variables
    private Node root;
    private int height;
    // constructor
    public BinaryTree(int data)
    {
        root = new Node(data);
    }
    public BinaryTree()
    {
        root = null;
        height = 0;
    }
    public void addNode(int data)
    {
        root.addNew(data);
    }
    public String toString()
    {
        if(root != null)
        {
            String output = "";
            output += root.getData() ;
            return output;
        }
        return "Empty tree, root is null.";
    }
}
