/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liststring;

import javax.swing.JTextArea;

public class QueueString {

    private NodeString head;
    JTextArea area;

    public QueueString(JTextArea area) {
        head = null;
        this.area=area;
    }

    public NodeString add(String data) {

        if (head != null) {
            NodeString tail = findTail();

            tail.setNext(new NodeString(data));
        } else {
            head = new NodeString(data);
        }

        //print();
        return head;
    }

    public String remove() {

        NodeString removed = head;
        NodeString next = head.getNext();

        head = next;
        //print();
        return removed.getData();
    }

    public String getHead() {

        if (head != null) {
            return head.getData();
        } else {
            return "";
        }
    }

    public void print() {
        NodeString q = head;

        if (q != null) {
            area.append("Postfijo: ");
            do {  
                area.append(q.getData() + " ");
                System.out.print(q.getData() + " ");
                q = q.getNext();
            } while (q != null);
        }
        area.append("\n");
        System.out.println();
    }

    public NodeString findTail() {
        NodeString tail = head;

        if (head != null) {
            while (tail.getNext() != null) {
                tail = tail.getNext();
            }
        }

        return tail;
    }
}

