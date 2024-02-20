public class Node
{
    private Integer data;
    private Node left;
    private Node right;
    private Node parent;
    //data
    //pointer left and right
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
    //binary tree add data
    //1 initalize if there is no data
    //2 if not empty get the front element
    // - if the front element does not have a left child then set the left child to a new node
    // - if the right child is not present set the right child as new node
    //3 if the node has both the children then pop it from the queue
    //4 enqueue the new data
    public void addNew(int data, Node parent)
    {
        if(parent != null)
        {
            //idk yet
        }
        else {
         if(left == null)
            left = new Node(data, parent);
         else if(right == null)
            right = new Node(data, parent);
         else
            addNew(data, left); 
        }
    }
    public void setData(int data) {
        this.data = data;
    }
    public Integer getData() {
        try
        {
            int num = data.intValue();
            return num;
        }
        catch(NullPointerException e)
        {
            return null;
        }
    }
    public void setLeft(int data) {
        left = new Node(data);
    }
    public void setRight(int data) {
        right = new Node(data);
    }
    public Node getLeft() {
        return left;
    }
    public Node getRight() {
        return right;
    }
    public boolean isFull()
    {
        return left == null && right == null;
    }

    public String printBranches()
    {
        if(data == null )
        {
            return "";
        }
        String output = data.toString() + "";
        if(left != null)
            output += left.printBranches() + "";
        if(right != null)
            output += right.printBranches() + "";
        return output;
    }
}
