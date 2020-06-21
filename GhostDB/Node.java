package GhostDB;

import java.util.zip.CRC32;

/**
 * Node
 */
public class Node {

    public CRC32 key;
    public VirtualPoint vp;
    public Node left;
    public Node right;

    public Node(CRC32 key, VirtualPoint vp, Node left, Node right) {
        this.key = key;
        this.vp = vp;
        this.left = left;
        this.right = right;
    }
}