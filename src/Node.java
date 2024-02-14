public class Node
{
    private Integer data;
    private Node left;
    private Node right;
    //data
    //pointer left and right
    public Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
    public Node()
    {
        data = null;
        left = null;
        right = null;
    }

    public void setData(int data) {
        this.data = data;
    }
    public int getData() {
        return this.data;
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
        String output = data.toString();
        if(left != null)
            output += left.printBranches();
        if(right != null)
            output += right.printBranches();
        return output;
    }
}
