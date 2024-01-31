public class Node
{
    private int data;
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

    public void setData(int data) {
        this.data = data;
    }
}
