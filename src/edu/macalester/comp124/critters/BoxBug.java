package edu.macalester.comp124.critters;

import acm.graphics.GPolygon;
import acm.graphics.GRect;

import java.awt.*;

/**
 * @author halosghost
 */
public class BoxBug extends Critter {

    private void createLeg (double x0, double y0, double x1, double y1) {
        GPolygon legPoly = new GPolygon();
        legPoly.setColor(new Color(29, 120, 197));
        legPoly.setFilled(true);
        legPoly.setFillColor(legPoly.getColor());

        legPoly.addVertex(x0, y0);
        legPoly.addVertex(x1, y1);
        legPoly.addVertex(x0, y0 - 5);

        addLeg(new Leg(legPoly, 4));
    }

    @Override
    protected void buildGraphics () {
        createLeg(-15, 10, -50, 20);
        createLeg(-15, -10, -50, -20);
        createLeg(15, 10, 50, 20);
        createLeg(15, -10, 50, -20);

        GRect body = new GRect(-20, -20, 40, 40);
        body.setFilled(true);
        body.setFillColor(new Color(64, 62, 232));
        getGraphics().add(body);

        Eye leftEye = new Eye(10, 0.26, 0.18, Color.BLUE);
        Eye rightEye = new Eye(10, 0.36, 0.18, Color.BLUE);
        addEye(leftEye, -18, -9);
        addEye(rightEye, 18, -9);
    }
}
