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
        root = new Node(Math.abs(data));
    }
    public BinaryTree(BinaryTree branch)
    {
        root = new Node(branch);
    }
    public BinaryTree()
    {
        root = new Node();
    }

    public Node getRoot()
    {
        return root;
    }

    public String toString()
    {
        if(root.getData() != -1)
        {
            String output = root.getData() + root.getLeft() + root.getRight().toString() + "";
            return output;
        }
        return "Empty tree, root is empty.";
    }
}
