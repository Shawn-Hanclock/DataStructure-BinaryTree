public class Node
{
    //instance variables
    private Integer data;
    private Node left;
    private Node right;
    private Node parent;
    
    //constructors
    public Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
        parent = null;
    }
    public Node(int data, Node parent)
    {
        this.data = data;
        left = null;
        right = null;
        this.parent = parent;
    }
    public Node()
    {
        data = null;
        left = null;
        right = null;
        parent = null;
    }

    //getters and setters
    public void setData(int data) {
        this.data = data;
    }
    public Integer getData() {
        try {
            int num = data.intValue();
            return num;
        }
        catch(NullPointerException e) {
            return null;
        }
    }
    public void setLeft(int data) {
        left.setData(data);
    }
    public void setRight(int data) {
        right.setData(data);
    }
    public Node getLeft() {
        return left;
    }
    public Node getRight() {
        return right;
    }
    public Node getParent()
    {
        return parent;
    }
    public void setParent(int data)
    {
        parent.setData(data);
    }

    //brain methods
    //binary tree add data
    //1 initalize if there is no data
    //2 if not empty get the front element
    // - if the front element does not have a left child then set the left child to a new node
    // - if the right child is not present set the right child as new node
    //3 if the node has both the children then pop it from the queue
    //4 enqueue the new data

    //Find first node in the traversal order of node <X>’s subtree (last is symmetric)
    //– If <X> has left child, recursively return the first node in the left subtree
    //– Otherwise, <X> is the first node, so return it
    //– Running time is O(h) where h is the height of the tree
    //– Example: first node in <A>’s subtree is <F>
    //Find successor of node <X> in the traversal order (predecessor is symmetric)
    //– If <X> has right child, return first of right subtree
    //– Otherwise, return lowest ancestor of <X> for which <X> is in its left subtree
    //– Running time is O(h) where h is the height of the tree
    //– Example: Successor of: <B> is <E>, <E> is <A>, and <C> is None
    public int findHeight()
    {
        int count = -1;
        Node check = this;
        while(check != null)
        {
            count++;
            check = check.parent;
        }
        return count;
    }

//    public Node findSuccessor()
//    {
//        return this;
//    }
    public Node findNext()
    {
        if(right != null && left != null)
        {
            return left.findNext().findHeight() >= right.findNext().findHeight()? right.findNext(): left.findNext();
        }
        else if(left != null)
            return left.findNext();
        else if(right != null)
            return right.findNext();
        else {
            return this;
        }
    }
    public void addNew(int addData)
    {
        Node addLeaf = this.findNext();
        if(addLeaf.left != null)
            addLeaf.right = new Node(addData);
        else
            addLeaf.left = new Node(addData);
    }
    public boolean isLeaf()
    {
        return left == null && right == null;
    }
    public int leafCount() //1 leaf or 2 leaf or 0 leaf
    {
        int count = 0;
        if(this.isLeaf())
            return 1;
        if(left != null)
            count += left.leafCount();
        if(right != null)
            count += right.leafCount();
        return count;
    }
    private void add(int data)
    {
        if(left == null)
            left = new Node(data);
        else if(right == null)
            right = new Node(data);
    }
    public String printBranches() //used in binary tree toString
    {
        if(data == null) {
            return "";
        }
        String output = data.toString() + " ";
        if(left != null)
            output = left.printBranches() + output;
        if(right != null)
            output = output + right.printBranches();
        return output;
    }
}
