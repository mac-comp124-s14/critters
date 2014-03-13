package edu.macalester.comp124.critters;

import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;

import java.awt.*;

/**
 * Created by mulmer on 3/13/14.
 */
public class Blob extends Critter {

    //template for code from BoxBot
    private static final Color
            strokeColor = new Color(11, 50, 159),
            fillColor   = new Color(34, 136, 183);

    @Override
    protected void buildGraphics() {

        createLeg(-30*2,  10*2, -40*2,  20*2);
        createLeg(-34*2, -10*2, -44*2,   0);
        createLeg(-30*2, -30*2, -40*2, -20*2);
        createLeg( 30*2,  10*2,  40*2,  20*2);
        createLeg( 34*2, -10*2,  44*2,   0);
        createLeg( 30*2, -30*2,  40*2, -20*2);

        GOval body = new GOval( -40, -40, 80, 80);
        body.setColor(strokeColor);
        body.setFilled(true);
        body.setFillColor(fillColor);
        getGraphics().add(body);

        GOval head = new GOval(-70, -70, 40, 40);
        head.setColor(strokeColor);
        head.setFilled(true);
        head.setFillColor(fillColor);
        getGraphics().add(head);

        GOval head2 = new GOval(-50, -90, 20, 20);
        head2.setColor(strokeColor);
        head2.setFilled(true);
        head2.setFillColor(fillColor);
        getGraphics().add(head2);

        Eye firstEye = new Eye(6, 0.36, 0.28, Color.BLUE);
        addEye(firstEye, -45, -87);

    }


    //code from Bear
    private void createLeg(double x0, double y0, double x1, double y1) {
        GPolygon legPoly = new GPolygon();
        legPoly.setColor(fillColor);
        legPoly.setFilled(true);
        legPoly.setFillColor(fillColor);

        legPoly.addVertex(0, -2+5);
        legPoly.addVertex(x0, y0 - 2+5);
        legPoly.addVertex(x1, y1+5);
        legPoly.addVertex(x0, y0 + 2+5);
        legPoly.addVertex(0, 2+5);

        addLeg(new Leg(legPoly, 4));
    }
}
