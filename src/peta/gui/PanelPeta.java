/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package peta.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import peta.Initialize;
import peta.entity.Node;

/**
 *
 * @author badak
 */
public class PanelPeta extends JPanel{

    Image img=new ImageIcon(getClass().getResource("/peta/img/peta-mgl.jpg")).getImage();
    Initialize i;
    Node jalur=new Node();
    
    public static final int SEMUA_JALUR=1;
    public static final int JALUR_PRIM=2;
    public static final int MST_PRIM=3;
    private int type;
    
    public PanelPeta() {
        i=new Initialize();
        jalur=i.getJalur();
        setSize(800, 792);
        remove(jalur, "");
        showTree(SEMUA_JALUR);
    }

    public final void showTree(int type) {
        this.type = type;
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gd=(Graphics2D) g.create();  
        gd.drawImage(img, 0, 0, 800, 714, null);
        if(type==SEMUA_JALUR) drawGrapAll(gd, jalur);
        else if(type==JALUR_PRIM) drawGrapMinim(gd, jalur);
        gd.dispose();
    }
    
    public static Double getDistance(Point p1, Point p2) {
        Double result = (Double) Math.floor(Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2)));
        return result;
    }
    
    private void drawGrapAll(Graphics2D gd, Node n){
        if(n==null) return;
        Point p=n.getP();
        gd.setColor(Color.red);
        gd.fillOval(p.x-3, p.y-3, 6, 6);
        gd.setColor(Color.black);
        gd.drawString(n.getNama(), p.x+4, p.y-3);
        if(n.getLurus()!=null){
            Point p1=n.getLurus().getP();
            gd.setColor(Color.black);
            gd.drawLine(p1.x, p1.y, p.x, p.y);
            int x = p.x + ((p1.x - p.x)/2);
            int y = p.y + ((p1.y - p1.y)/2);
            gd.setColor(Color.blue);
            gd.drawString("" + getDistance(p, p1), x, y);
        }
        if(n.getKiri()!=null){
            Point p1=n.getKiri().getP();
            gd.setColor(Color.black);
            gd.drawLine(p1.x, p1.y, p.x, p.y);
            int x = p.x + ((p1.x - p.x)/2);
            int y = p.y + ((p1.y - p1.y)/2);
            gd.setColor(Color.blue);
            gd.drawString("" + getDistance(p, p1), x, y);
        }
        if(n.getKanan()!=null){
            Point p1=n.getKanan().getP();
            gd.setColor(Color.black);
            gd.drawLine(p1.x, p1.y, p.x, p.y);
            int x = p.x + ((p1.x - p.x)/2);
            int y = p.y + ((p1.y - p1.y)/2);
            gd.setColor(Color.blue);
            gd.drawString("" + getDistance(p, p1), x, y);
        }
        drawGrapAll(gd, n.getLurus());
        drawGrapAll(gd, n.getKiri());
        drawGrapAll(gd, n.getKanan());
    }
    
    private void drawGrapMinim(Graphics2D gd, Node n){
        if(n==null) return;
        Point p=n.getP();
        gd.setColor(Color.red);
        gd.fillOval(p.x-3, p.y-3, 6, 6);
        gd.setColor(Color.black);
        gd.drawString(n.getNama(), p.x+4, p.y-3);
        double lurus=800;
        double kiri=800;
        double kanan=800;
        if(n.getLurus()!=null){
            Point p1=n.getLurus().getP();
            lurus=getDistance(p, p1);
        }
        if(n.getKiri()!=null){
            Point p1=n.getKiri().getP();
            kiri=getDistance(p, p1);
        }
        if(n.getKanan()!=null){
            Point p1=n.getKanan().getP();
            kanan=getDistance(p, p1);
        }
        if(lurus<kanan&&lurus<kiri){
            Point p1=n.getLurus().getP();
            gd.setColor(Color.black);
            gd.drawLine(p1.x, p1.y, p.x, p.y);
            int x = p.x + ((p1.x - p.x)/2);
            int y = p.y + ((p1.y - p1.y)/2);
            gd.setColor(Color.blue);
            gd.drawString("" + getDistance(p, p1), x, y);
            drawGrapMinim(gd, n.getLurus());
        }
        if(kiri<kanan&&kiri<lurus){
            Point p1=n.getKiri().getP();
            gd.setColor(Color.black);
            gd.drawLine(p1.x, p1.y, p.x, p.y);
            int x = p.x + ((p1.x - p.x)/2);
            int y = p.y + ((p1.y - p1.y)/2);
            gd.setColor(Color.blue);
            gd.drawString("" + getDistance(p, p1), x, y);
            drawGrapMinim(gd, n.getKiri());
        }
        if(kanan<kiri&&kanan<lurus){
            Point p1=n.getKanan().getP();
            gd.setColor(Color.black);
            gd.drawLine(p1.x, p1.y, p.x, p.y);
            int x = p.x + ((p1.x - p.x)/2);
            int y = p.y + ((p1.y - p1.y)/2);
            gd.setColor(Color.blue);
            gd.drawString("" + getDistance(p, p1), x, y);
            drawGrapMinim(gd, n.getKanan());
        }
    }
    
    private void remove(Node jalur, String nama){
        if(jalur==null) return;
        if(jalur.getLurus()!=null){
            if(jalur.getLurus().getNama().equals(nama)) {
                jalur.setLurus(null);
                return;
            }
        }
        if(jalur.getKanan()!=null) {
            if(jalur.getKanan().getNama().equals(nama)){
                jalur.setKanan(null);
                return;
            }
        }
        if(jalur.getKiri()!=null){
            if(jalur.getKiri().getNama().equals(nama)) {
                jalur.setKiri(null);
                return;
            }
        }
        remove(jalur.getLurus(), nama);
        remove(jalur.getKanan(), nama);
        remove(jalur.getKiri(), nama);
    }
    
    public void hapusJalurbyNama(String nama){
        remove(jalur, nama);
        repaint();
    }
    
    public void resetJalur(){
        i=new Initialize();
        this.jalur=i.getJalur();
        repaint();
    }
}
