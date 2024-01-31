// [] add elements
// [] remove elemeents
// [] tranverse elements
// [] output data in strucuture

public class BinaryTree
{
    // variables
    private Node root;

    // constructor
    public BinaryTree()
    {
        root = null;
    }
    public void addRoot(int data)
    {
        if(root == null) {
            root = new Node(data);
        }
        else {
            root.setData(data);
        }
    }
    public void addNodeFill(int data)
    {
//        root.
    }

    public boolean hasLeft()
    {
        Node pos = root;
        return pos.getLeft() != null;
    }
    public boolean hasRight()
    {
        Node pos = root;
        return pos.getRight() != null;
    }


    // population methods
    // insert element
    // remove element

    // brain methods
    // transverse the tree
    //
}
