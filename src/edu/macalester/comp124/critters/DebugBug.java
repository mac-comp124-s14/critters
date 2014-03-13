package edu.macalester.comp124.critters;

import acm.graphics.GArc;
import acm.graphics.GOval;
import acm.graphics.GPolygon;

import java.awt.*;

/**
 * Created by iangoodbar on 3/13/14.
 */
public class DebugBug extends Critter{

    @Override
    protected void buildGraphics() {

        createLeg(-30,  10, -40,  20);
        createLeg(-34, -10, -44,   0);
        createLeg(-30, -30, -40, -20);
        createLeg( 30,  10,  40,  20);
        createLeg( 34, -10,  44,   0);
        createLeg( 30, -30,  40, -20);


        GOval body = new GOval(-25, -25, 50, 55);
        body.setColor(bodyColor);
        body.setFilled(true);
        getGraphics().add(body);

        GArc head = new GArc(-17, 14, 40, 40, 30, 128);
        head.setColor(legColor);
        head.setFilled(true);
        getGraphics().add(head);

        addEye(new Eye(4, 0.26, 0.5, bodyColor), -5, 25);
        addEye(new Eye(4, 0.26, 0.5, bodyColor), 5, 25);
    }

    private void createLeg(double x0, double y0, double x1, double y1) {
        GPolygon legPoly = new GPolygon();
        legPoly.setColor(legColor);
        legPoly.setFilled(true);
        legPoly.setFillColor(legPoly.getColor());

        legPoly.addVertex(0, -2);
        legPoly.addVertex(x0, y0 - 1);
        legPoly.addVertex(x1, y1);
        legPoly.addVertex(x0, y0 + 1);
        legPoly.addVertex(0, 2);

        addLeg(new Leg(legPoly, 4));

    }
    private static final Color
        bodyColor = new Color(45, 204, 94),
        legColor = new Color(108, 108, 108);


}
