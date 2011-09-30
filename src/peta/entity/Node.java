/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package peta.entity;

import java.awt.Point;

/**
 *
 * @author badak
 */
public class Node {

    Point p;
    String nama;
    Node lurus;
    Node Kanan;
    Node Kiri;

    public Node() {
    }

    public Node(String nama) {
        this.nama = nama;
    }

    
    public Node getKanan() {
        return Kanan;
    }

    public void setKanan(Node Kanan) {
        this.Kanan = Kanan;
    }

    public Node getKiri() {
        return Kiri;
    }

    public void setKiri(Node Kiri) {
        this.Kiri = Kiri;
    }

    public Node getLurus() {
        return lurus;
    }

    public void setLurus(Node lurus) {
        this.lurus = lurus;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
