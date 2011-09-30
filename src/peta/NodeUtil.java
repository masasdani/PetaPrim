/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package peta;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import peta.entity.Node;

/**
 *
 * @author badak
 */
public class NodeUtil {
    
    List<Node> jalur = new ArrayList<Node>();

    Node a=new Node("a");
    Node b=new Node("b");
    Node c=new Node("c");
    Node d=new Node("d");
    Node e=new Node("e");
    Node f=new Node("f");
    Node g=new Node("g");
    Node h=new Node("h");
    Node i=new Node("i");
    Node j=new Node("j");
    Node k=new Node("k");
    Node l=new Node("l");
    Node m=new Node("m");
    Node n=new Node("n");
    Node o=new Node("o");
    Node p=new Node("p");
    Node q=new Node("q");
    Node r=new Node("r");
    Node s=new Node("s");
    Node t=new Node("t");
    Node u=new Node("u");
    Node v=new Node("v");
    Node a1=new Node("a1");
    Node a2=new Node("a2");
    Node a3=new Node("a3");
    Node a4=new Node("a4");
    Node a5=new Node("a5");
    Node a6=new Node("a6");
    Node a7=new Node("a7");
    Node a8=new Node("a8");
    Node a9=new Node("a9");
    Node a10=new Node("a10");
    Node a11=new Node("a11");
    Node a12=new Node("a12");
    Node a13=new Node("a13");
    Node a14=new Node("a14");
    Node b1=new Node("b1");
    Node b2=new Node("b2");
    Node b3=new Node("b3");
    Node b4=new Node("b4");
    Node c1=new Node("c1");
    Node c2=new Node("c2");
    Node c21=new Node("c21");
    Node c22=new Node("c22");
    Node c23=new Node("c23");
    Node c24=new Node("c24");
    Node d1=new Node("d1");
    Node d2=new Node("d2");
    Node d3=new Node("d3");
    Node e1=new Node("e1");
    Node e2=new Node("e2");
    Node h1=new Node("h1");
    Node i1=new Node("i1");
    Node n1=new Node("n1");
    Node n2=new Node("n2");
    Node n3=new Node("n3");
    Node o1=new Node("o1");
    Node o2=new Node("o2");
    Node o3=new Node("o3");
    Node p1=new Node("p1");
    Node p2=new Node("p2");
    Node p3=new Node("p3");
    
    public NodeUtil() {
        a.setP(new Point(320,19));
        b.setP(new Point(327,52));
        c.setP(new Point(338,84));
        d.setP(new Point(356,120));
        e.setP(new Point(411,157));
        f.setP(new Point(435,208));
        g.setP(new Point(486,224));
        h.setP(new Point(510,233));
        i.setP(new Point(526,249));
        j.setP(new Point(536,265));
        k.setP(new Point(546,280));
        l.setP(new Point(571,312));
        m.setP(new Point(606,358));
        n.setP(new Point(644,442));
        o.setP(new Point(686,527));
        p.setP(new Point(702,553));
        q.setP(new Point(715,576));
        r.setP(new Point(752,629));
        s.setP(new Point(760,650));
        t.setP(new Point(758,679));
        u.setP(new Point(758,690));
        v.setP(new Point(755,712));
        a1.setP(new Point(306,22));
	a2.setP(new Point(216,72));
	a3.setP(new Point(234,168));
	a4.setP(new Point(258,200));
	a5.setP(new Point(312,280));
        a6.setP(new Point(390,334));
        a7.setP(new Point(452,355));
        a8.setP(new Point(470,380));
        a9.setP(new Point(515,440));
        a10.setP(new Point(497,596));
        a11.setP(new Point(530,632));
        a12.setP(new Point(658,660));
        a13.setP(new Point(717,680));
        a14.setP(new Point(737,670));
        b1.setP(new Point(316,52));
        b2.setP(new Point(307,85));
        b3.setP(new Point(288,115));
        b4.setP(new Point(277,116));
        c1.setP(new Point(321,90));
        c2.setP(new Point(314,115));
        c21.setP(new Point(332,115));
        c22.setP(new Point(325,133));
        c23.setP(new Point(295,163));
        c24.setP(new Point(284,181));
        d1.setP(new Point(347,128));
        d2.setP(new Point(330,173));
        d3.setP(new Point(327,186));
        e1.setP(new Point(375,259));
        e2.setP(new Point(362,274));
        h1.setP(new Point(479,260));
        i1.setP(new Point(487,274));
        n1.setP(new Point(576,514));
        n2.setP(new Point(552,551));
        n3.setP(new Point(524,591));
        o1.setP(new Point(645,547));
        o2.setP(new Point(579,615));
        o3.setP(new Point(551,602));
        p1.setP(new Point(680,585));
	p2.setP(new Point(696,600));
	p3.setP(new Point(724,644));
        generate();
    }
    
    private void generate(){
        jalur.add(a);
        jalur.add(b);
        jalur.add(c);
        jalur.add(d);
        jalur.add(e);
        jalur.add(f);
        jalur.add(g);
        jalur.add(h);
        jalur.add(i);
        jalur.add(j);
        jalur.add(k);
        jalur.add(l);
        jalur.add(m);
        jalur.add(n);
        jalur.add(o);
        jalur.add(p);
        jalur.add(q);
        jalur.add(r);
        jalur.add(s);
        jalur.add(t);
        jalur.add(u);
        jalur.add(v);
        jalur.add(a1);
        jalur.add(a2);
        jalur.add(a3);
        jalur.add(a4);
        jalur.add(a5);
        jalur.add(a6);
        jalur.add(a7);
        jalur.add(a8);
        jalur.add(a9);
        jalur.add(a10);
        jalur.add(a11);
        jalur.add(a12);
        jalur.add(a13);
        jalur.add(a14);
        jalur.add(b1);
        jalur.add(b2);
        jalur.add(b3);
        jalur.add(b4);
        jalur.add(c1);
        jalur.add(c2);
        jalur.add(c21);
        jalur.add(c22);
        jalur.add(c23);
        jalur.add(c24);
        jalur.add(d1);
        jalur.add(d2);
        jalur.add(d3);
        jalur.add(e1);
        jalur.add(e2);
        jalur.add(h1);
        jalur.add(i1);
        jalur.add(n1);
        jalur.add(n2);
        jalur.add(n3);
        jalur.add(o1);
        jalur.add(o2);
        jalur.add(o3);
        jalur.add(p1);
        jalur.add(p2);
        jalur.add(p3);
    }

    public List<Node> getJalur() {
        return jalur;
    }
}
