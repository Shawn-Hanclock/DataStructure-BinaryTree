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
    public void addNew(int data, Node parent)
    {
        if(left == null)
            left = new Node(data, parent);
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
