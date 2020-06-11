package GhostDB;

/**
 * Node
 */
public class Node {

    private String key;
    private VirtualPoint vp;
    private Node left;
    private Node right;

    public Node(String key, VirtualPoint vp, Node left, Node right){
        this.key = key;
        this.vp = vp;
        this.left = left;
        this.right = right;
    }
}