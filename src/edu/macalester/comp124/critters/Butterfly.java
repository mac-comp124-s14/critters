package edu.macalester.comp124.critters;

import acm.graphics.GOval;
import acm.graphics.GPolygon;

import java.awt.*;

/**
 * Created by Sara on 3/13/14.
 */
public class Butterfly extends Critter{

    @Override
    protected void buildGraphics() {
        double w = 10;
        int e = 10;
        GOval lTWing = new GOval(-4*w, 0, 4*w, 2*w);
        lTWing.setFilled(true);
        lTWing.setFillColor(new Color(225, 0,128));
        addLeg(new Leg(lTWing, 2));

        GOval lBWing = new GOval(-3*w,2*w,3*w,1.5*w);
        lBWing.setFilled(true);
        lBWing.setFillColor(new Color(128,0,128));
        addLeg(new Leg(lBWing,2));

        GOval rTWing = new GOval(0, 0, 4*w, 2*w);
        rTWing.setFilled(true);
        rTWing.setFillColor(new Color(225, 0,128));
        addLeg(new Leg(rTWing, 2));

        GOval rBWing = new GOval(0,2*w,3*w,1.5*w);
        rBWing.setFilled(true);
        rBWing.setFillColor(new Color(128,0,128));
        addLeg(new Leg(rBWing,2));

        Eye wingLEye = new Eye(w, 0.26, 0.18, Color.BLUE);
        Eye wingREye = new Eye(w, 0.26, 0.18, Color.BLUE);
        addEye(wingLEye, -20, 10);
        addEye(wingREye, 20, 10);

        GOval body = new GOval(-.5*w, 0, w, 4*w);
        body.setColor(new Color(0,225,182));
        body.setFilled(true);
        body.setFillColor(new Color(0, 225, 182));
        getGraphics().add(body);

        GOval head = new GOval(-.5*w, -w, w, w);
        head.setColor(new Color(0,225,182));
        head.setFilled(true);
        head.setFillColor(new Color(0,225,182));
        getGraphics().add(head);

        Eye rEye = new Eye(2,0.26,0.18,Color.DARK_GRAY);
        Eye lEye = new Eye(2,0.26,0.18,Color.DARK_GRAY);
        addEye(rEye, e/2,-e/2);
        addEye(lEye,-e/2,-e/2);

        createLeg(0,-w,.125*w,-3*w);
        createLeg(0,-w,-.125*w,-3*w);

    }

    private void createLeg(double x0, double y0, double x1, double y1) {
        GPolygon legPoly = new GPolygon();
        legPoly.setColor(new Color(225, 0,128));
        legPoly.setFilled(true);
        legPoly.setFillColor(legPoly.getColor());

        legPoly.addVertex(x0, y0);
        legPoly.addVertex(x1, y1);
        legPoly.addVertex(x0, y0 - 5);

        addLeg(new Leg(legPoly, 4));

    }
}
