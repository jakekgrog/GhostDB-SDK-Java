package GhostDB;

import java.util.zip.CRC32;

/**
 * VirtualPoint
 */
public class VirtualPoint {
    private Node node;
    private CRC32 index;

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