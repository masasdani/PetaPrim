/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package peta.entity;

/**
 *
 * @author badak
 */
public class Sisi {

    Node from;
    Node to;
    double jarak;

    public Sisi(Node from, Node to, double jarak) {
        this.from = from;
        this.to = to;
        this.jarak = jarak;
    }

    public Node getFrom() {
        return from;
    }

    public void setFrom(Node from) {
        this.from = from;
    }

    public double getJarak() {
        return jarak;
    }

    public void setJarak(double jarak) {
        this.jarak = jarak;
    }

    public Node getTo() {
        return to;
    }

    public void setTo(Node to) {
        this.to = to;
    }
}
