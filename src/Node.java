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
    public Node(BinaryTree branch)
    {
        data = branch.getRoot().getData();
        left = branch.getRoot();
        right = null;
    }
    public Node()
    {
        data = -1;
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

    public String printTree()
    {
        if(data == -1)
        {
            return "";
        }
        return data + left.printTree() + right.printTree();
    }
}
