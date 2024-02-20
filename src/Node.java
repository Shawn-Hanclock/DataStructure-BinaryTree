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
         if(newParent.left == null)
            newParent.left = new Node(addData, newParent);
         else if(newParent.right == null)
            newParent.right = new Node(addData, newParent);
         else
            addNew(addData, left);
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
        if(this.isLeaf())
            return 1;
        if(left != null)
            count += left.leafCount();
        if(right != null)
            count += right.leafCount();
        return count;
    }

    //List nodes in traversal order via a recursive algorithm starting at root:
    //– Recursively list left subtree, list self, then recursively list right subtree
    //– Runs in O(n) time, since O(1) work is done to list each node
    //– Example: Traversal order is (<F>, <D>, <B>, <E>, <A>, <C>)
    public String printBranches()
    {
        if(data == null) {
            return "";
        }
//        String output = data.toString() + " ";
//        String temp = output;
//        if(left != null)
//            output = left.printBranches() + temp;
//        if(right != null)
//            output = temp + right.printBranches();
//        return output;
        String output = data.toString() + " ";
        return output;
    }
}
