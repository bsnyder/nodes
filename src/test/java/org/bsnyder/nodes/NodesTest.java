package org.bsnyder.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NodesTest {

    @Test
    public void testLocateParent() {
        Node n1 = new Node(100);
        Node n2 = new Node(200);

        Node n10 = new Node(10);
        Node n11 = new Node(11);
        Node n12 = new Node(12);

        Node n20 = new Node(20);
        Node n21 = new Node(21);
        Node n22 = new Node(22);
        Node n23 = new Node(23);
        Node n24 = new Node(24);

        n20.setParent(null);
        n10.setParent(n20);
        n11.setParent(n10);
        n12.setParent(n11);
        n1.setParent(n12);

        n21.setParent(n20);
        n22.setParent(n21);
        n23.setParent(n22);
        n24.setParent(n23);
        n2.setParent(n24);

        Nodes nodes = new Nodes();
        Node parent = nodes.locateParent(n1, n2);
        assertEquals(n20, parent);
    }
}
