package org.bsnyder.nodes;

public class Node {
    int id;
    Node parent;

    public Node(int id) {
        this.id = id;
    }

    public int getId() { return id; }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node n) {
        this.parent = n;
    }
}
