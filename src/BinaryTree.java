import java.util.ArrayList;

public class BinaryTree
{
    // variables
    private final Node root;

    // constructor
    public BinaryTree(int data)
    {
        root = new Node(data);
    }
    public BinaryTree(int[] data)
    {
        root = new Node();
        for(int n: data) {
            this.addData(n);
        }
    }
    public BinaryTree()
    {
        root = new Node();
    }

    //getter
    public Node getRoot()
    {
        return root;
    }

    //brain methods
    public int treeLeaf() {
        return root.leafCount();
    }
    public void addData(int data)
    {
       if(root.getData() != null) root.addNew(data);
       else root.setData(data);
    }
    public void addData(int[] data)
    {
        for(int n: data) {
            if(root.getData() != null) root.addNew(n);
            else root.setData(n);
        }
    }
    public String toString()
    {
        String out = root.printBranches();
        if(out.equals(""))
            return "Tree yet to be filled.";
        else {
            out = out.substring(0,out.length()-1);
            return "[" + out.replaceAll(" ", ", ") + "]";
        }
    }
    public int[] toArray()
    {
        String out = root.printBranches();
        String[] outArr = out.split(" ");
        int nodes = outArr.length;
        int[] array = new int[nodes];
        for(int i = 0; i < nodes; i++)
        {
            array[i] = Integer.parseInt(outArr[i]);
        }
        return array;
    }
}
