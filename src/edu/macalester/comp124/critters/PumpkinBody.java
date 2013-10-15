package edu.macalester.comp124.critters;

import acm.graphics.GCompound;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GPolygon;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: bboatman
 * Date: 10/15/13
 * Time: 10:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class PumpkinBody extends GCompound{
    public PumpkinBody(){
        GOval bigOval = new GOval(50,80);
        GOval bigOval2 = new GOval(50,80);
        GOval littleOval = new GOval(40,85);
        GOval littleOval2 = new GOval(40,85);
        Color color = new Color(223,105,27);

        GOval back1 = new GOval(54,84);
        GOval back2 = new GOval(44, 89);
        GOval back3 = new GOval(44, 89);
        GOval back4 = new GOval(54,84);
        back1.setFilled(true);
        back2.setFilled(true);
        back3.setFilled(true);
        back4.setFilled(true);
        back1.setFillColor(Color.black);
        back2.setFillColor(Color.black);
        back3.setFillColor(Color.black);
        back4.setFillColor(Color.black);
        add(back1, -62, 0);
        add(back2, -30, 1);
        add(back3, -5, 1);
        add(back4, 15, 0);

        GOval shadow1 = new GOval(40,85);
        GOval shadow2 = new GOval(40,85);
        Color shadowColor = new Color(187, 79, 7);
        shadow1.setFilled(true);
        shadow2.setFilled(true);
        shadow1.setFillColor(shadowColor);
        shadow2.setFillColor(shadowColor);
        shadow1.setColor(shadowColor);
        shadow2.setColor(shadowColor);

        bigOval.setFilled(true);
        bigOval2.setFilled(true);
        littleOval.setFilled(true);
        littleOval2.setFilled(true);
        bigOval.setFillColor(color);
        bigOval2.setFillColor(color);
        littleOval.setFillColor(color);
        littleOval2.setFillColor(color);
        bigOval.setColor(color);
        bigOval2.setColor(color);
        littleOval.setColor(color);
        littleOval2.setColor(color);
        add(bigOval, -62, 0);
        add(shadow1, -34, 1);
        add(littleOval, -30, 1);
        add(bigOval2, 15, 0);
        add(shadow2, -1, 1);
        add(littleOval2, -5, 1);
    }

    public void pumpkinFace(){
    }


}
