// [] add elements
// [] remove elemeents
// [] tranverse elements
// [] output data in strucuture
public class BinaryTree
{
    // variables
    private Node root = null;
    // constructor
    public BinaryTree()
    {
//        root = new Node();
//        root =
    }
    public void addNode(int data)
    {
        if(root != null)
        {
            if(root.getLeft() == null)
            {
                root.setLeft(data);
            }
            else if(root.getRight() == null)
            {
                root.setRight(data);
            }
        }
        else {
            root = new Node(data);
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
