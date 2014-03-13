package edu.macalester.comp124.critters;

import acm.graphics.*;

import java.awt.*;

/**
 * Created by Qinghao on 3/13/14.
 */
public class Bear extends Critter{

    @Override
    protected void buildGraphics() {
        double scale = 40;

        createLeg(-30*2,  10*2, -40*2,  20*2);
        createLeg(-34*2, -10*2, -44*2,   0);
        createLeg(-30*2, -30*2, -40*2, -20*2);
        createLeg( 30*2,  10*2,  40*2,  20*2);
        createLeg( 34*2, -10*2,  44*2,   0);
        createLeg( 30*2, -30*2,  40*2, -20*2);

        addEar(-30,-30,20,20, Color.gray);
        addEar(30,-30,20,20, Color.gray);
        addEar(-30,-30,10,10, Color.pink);
        addEar(30,-30,10,10, Color.pink);

        GOval head = new GOval(-scale, -scale, 2 * scale, 2 * scale);
        head.setFilled(true);
        head.setColor(back);
        head.setFillColor(back);
        getGraphics().add(head);

        addEar(0,12,20,15, Color.lightGray);
        addEar(0,5,5,5, Color.pink);

        GPolygon mouth = new GPolygon();
        mouth.addVertex(-scale*0.06, 0+15);
        mouth.addVertex(scale*0.06, 0+15);
        mouth.addVertex(0, scale*0.1+15);
        mouth.setFilled(true);
        mouth.setFillColor(Color.pink);
        mouth.setColor(Color.pink);
        getGraphics().add(mouth);

        Eye leftEye = new Eye(10, 0.46, 0.18, Color.BLUE);
        Eye rightEye = new Eye(10, 0.46, 0.18, Color.BLUE);
        addEye(leftEye, -13, -10);
        addEye(rightEye, 13, -10);
    }
    public void addEar(double x, double y, double r1,double r2, Color color) {
        GOval ear = new GOval(x-r1, y-r2, 2 * r1, 2 * r2);
        ear.setFilled(true);
        ear.setColor(color);
        ear.setFillColor(color);
        getGraphics().add(ear);
    }

    private void createLeg(double x0, double y0, double x1, double y1) {
        GPolygon legPoly = new GPolygon();
        legPoly.setColor(Color.gray);
        legPoly.setFilled(true);
        legPoly.setFillColor(Color.gray);

        legPoly.addVertex(0, -2+5);
        legPoly.addVertex(x0, y0 - 2+5);
        legPoly.addVertex(x1, y1+5);
        legPoly.addVertex(x0, y0 + 2+5);
        legPoly.addVertex(0, 2+5);

        addLeg(new Leg(legPoly, 4));
    }

    private static final Color
            strokeColor = Color.pink,
            back   = Color.gray;
}
