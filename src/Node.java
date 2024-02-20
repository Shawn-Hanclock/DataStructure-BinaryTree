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
    public void addNew(int addData, Node newParent)
    {
         if(left == null)
            left = new Node(addData, newParent);
         else if(right == null)
            right = new Node(addData, newParent);
         else
            addNew(data, left);
    }
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
    public boolean isLeaf()
    {
        return left == null && right == null;
    }
    public int leafCount() //1 leaf or 2 leaf or 0 leaf
    {
        int count = 0;
        if(left != null && !left.isLeaf())
            count++;
        if(right != null  && !right.isLeaf())
            count++;
        return count;
    }
    public String printBranches()
    {
        if(data == null) {
            return "";
        }
        String output = data.toString() + " ";
        if(left != null)
            output += left.printBranches();
        if(right != null)
            output += right.printBranches();
        return output;
    }
}
