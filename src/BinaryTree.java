// [] add elements
// [] remove elemeents
// [] tranverse elements
// [] output data in strucuture
public class BinaryTree
{
    // variables
    private Node root;
    // constructor
    public BinaryTree(int data)
    {
        root = new Node(data);
    }
    public BinaryTree()
    {
        root = null;
    }
    public void addNode(int data)
    {
        if(root == null)
        {
            root = new Node(data);
        }
        else
        {
            if(root.getLeft() != null)
            {

            }
        }
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
