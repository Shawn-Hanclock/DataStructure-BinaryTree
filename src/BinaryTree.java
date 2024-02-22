// [] add elements
// [] remove elements
// [] tranverse elements
// [] output data in strucuture

//traversals from MIT
//Find first node in the traversal order of node <X>’s subtree (last is symmetric)
//– If <X> has left child, recursively return the first node in the left subtree
//– Otherwise, <X> is the first node, so return it
//– Running time is O(h) where h is the height of the tree
//– Example: first node in <A>’s subtree is <F>
// the left most
//
//Find successor of node <X> in the traversal order (predecessor is symmetric)
//– If <X> has right child, return first of right subtree
//– Otherwise, return lowest ancestor of <X> for which <X> is in its left subtree
//– Running time is O(h) where h is the height of the tree
//– Example: Successor of: <B> is <E>, <E> is <A>, and <C> is None

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
            root.addNew(data);
       }
    }

    public String toString()
    {
        String out = root.printBranches();
//        System.out.println("successor: " + root.find().getData()+ " height: " + root.findFirst().findHeight());
        return out.equals("")? "Tree yet to be filled.": out;
    }
}
