package GhostDB;

import java.util.zip.CRC32;

import org.graalvm.compiler.graph.Node;

public class AVLTree {
    private Node node;
    private int height;
    private int balance;

    public AVLTree() {
        this.node = null;
        this.height = -1;
        this.balance = 0;
    }

    public void Insert(CRC32 key, VirtualPoint vp) {
        Node node = new Node(key, vp);

        if (this.node == null) {
            this.node = node;
            this.node.left = new AVLTree();
            this.node.right = new AVLTree();
        } else if (key.getValue() < this.node.key.getValue()) {
            this.node.left.Insert(key, vp);
        } else if (key.getValue() > this.node.key.getValue()) {
            this.node.right.Insert(key, vp);
        }
    }

    public void Remove() {
    }

    public void MinimumPair() {
    }

    public void NextGTEPair() {
    }

    public void IsBalanced() {
    }

    public void GetNodes() {
    }

    public void InorderTraverse() {
    }

    public void PreorderTraverse() {
    }

    public void PostorderTraverse() {
    }

    public void MinPair() {
    }

    public void NextPair(CRC32 key) {
    }

    private void _NextPair(){
    }

    private void Rebalance() {
        this.UpdateHeights();
        this.UpdateBalances();

        while (this.balance < -1 
            || this.balance > 1) {
            if (this.balance > 1) {
                if (this.node.left.balance < 0) {
                    this.node.left.rotateLeft();
                    this.UpdateHeights();
                    this.UpdateBalances();
                }
                this.RotateRight();
                this.UpdateHeights();
                this.UpdateBalances();
            }
            if (this.balance < -1) {
                if (this.node.right.balance > 0) {
                    this.node.right.RotateRight();
                    this.UpdateHeights();
                    this.UpdateBalances();
                }
                this.RotateLeft();
                this.UpdateHeights();
                this.UpdateBalances();
            }
        }
    }

    private void UpdateHeights() {
        if (this.node != null) {
            if (this.node.left) {
                this.node.left.UpdateHeights();
            }
            if (this.node.right) {
                this.node.right.UpdateHeights();
            }
            this.height = Math.max(this.node.left.height, this.node.right.height);
        } else {
            this.height = -1;
        }
    }

    private void UpdateBalances() {
        if (this.node != null) {
            if (this.node.left) {
                this.node.left.UpdateBalances();
            }
            if (this.node.right) {
                this.node.right.UpdateBalances();
            }
            this.balance = this.node.left.height - this.node.right.height;
        } else {
            this.balance = 0;
        }
    }

    private void RotateRight() {
        AVLTree newRoot = this.node.left.node;
        AVLTree newLeftSub = newRoot.right.node;
        AVLTree oldRoot = this.node;

        this.node = newRoot;
        oldRoot.right.node = newLeftSub;
        newRoot.left.node = oldRoot;
    }

    private void RotateLeft() {
        AVLTree newRoot = this.node.right.node;
        AVLTree newLeftSub = newRoot.left.node;
        AVLTree oldRoot = this.node;

        this.node = newRoot;
        oldRoot.right.node = newLeftSub;
        newRoot.left.node = oldRoot;
    }

}