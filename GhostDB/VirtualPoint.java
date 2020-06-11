package GhostDB;

/**
 * VirtualPoint
 */
public class VirtualPoint {
    private int node;
    private int index;

    public VirtualPoint(int node, int index) {
        this.node = node;
        this.index = index;
    }

    public int getNode() {
        return this.node;
    }

    public int getIndex() {
        return this.index;
    }
}