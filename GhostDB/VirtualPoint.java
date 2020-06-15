package GhostDB;

/**
 * VirtualPoint
 */
public class VirtualPoint {
    private Node node;
    // CRC32 Hash
    private int index;

    public VirtualPoint(Node node, int index) {
        this.node = node;
        this.index = index;
    }

    public Node getNode() {
        return this.node;
    }

    public int getIndex() {
        return this.index;
    }
}