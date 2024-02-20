// [] add elements
// [] remove elements
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
        root = new Node();
    }
    public Node getRoot()
    {
        return root;
    }

    //binary tree add data
    //1 initalize if there is no data
    //2 if not empty get the front element
    // - if the front element does not have a left child then set the left child to a new node
    // - if the right child is not present set the right child as new node
    //3 if the node has both the children then pop it from the queue
    //4 enqueue the new data

    public void addData(int data)
    {
       if(root.getData() == null) {
           root.setData(data);
       }
       else {
            //add it left
       }
    }

    public String toString()
    {
        String out = root.printBranches();
        return out.equals("")? "Tree yet to be filled.": out;
    }
}
