package org.bsnyder.nodes;

public class Nodes {

    // Goal: Locate the closest common parent for two nodes
    public Node locateParent (Node n1, Node n2) {
        int node1Counter = 0;
        int node2Counter = 0;

        Node x = n1;
        Node y = n2;

        node1Counter = getCountToRootNode(x);
        node2Counter = getCountToRootNode(y);

        if (node1Counter < node2Counter) {
            // Walk up to the same level as n1
            int numberOfIterations = node2Counter - node1Counter;
            for (int i = 0; i < numberOfIterations; ++i) {
                n2 = n2.getParent();
            }
        } else {
            // Walk up to the same level as n2
            int numberOfIterations = node1Counter - node2Counter;
            for (int i = 0; i < numberOfIterations; ++i) {
                n1 = n1.getParent();
            }

        }

        // Grab the parent Node of each node and compare them
        Node p1 = n1.getParent();
        Node p2 = n2.getParent();

        while (p1.getParent() != p2.getParent()) {
            p1 = p1.getParent();
            p2 = p2.getParent();
        }

        return p1.getParent();
    }

    // Node n, walk all the way up to the root node and count the levels
    public int getCountToRootNode(Node n) {
        int counter = 0;
        while (n != null) {
            ++counter;
            // Go up one more level
            n = n.getParent();
        }
        return counter;
    }
}
