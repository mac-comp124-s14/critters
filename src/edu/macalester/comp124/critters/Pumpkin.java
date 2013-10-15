package edu.macalester.comp124.critters;


import acm.graphics.GPolygon;
import acm.graphics.GRect;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: bboatman
 * Date: 10/15/13
 * Time: 9:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class Pumpkin extends Critter {

    @ Override
    protected void buildGraphics(){
        GRect stem = new GRect(20,30);
        stem.setFilled(true);
        stem.setFillColor(new Color(95, 60, 45));
        getGraphics().add(stem, -10, -10);

        PumpkinBody body = new PumpkinBody();
        body.setColor(Color.black);
        getGraphics().add(body);

        Eye leftEye = new Eye(12, .7, .4, Color.YELLOW);
        Eye rightEye = new Eye(12, .7, .4, Color.YELLOW);
        addEye(leftEye, -20, 30);
        addEye(rightEye, 20, 30);


        GPolygon mouth = new GPolygon();
        mouth.setColor(Color.black);
        mouth.setFilled(true);
        mouth.setFillColor(new Color(238, 190, 68));

        mouth.addVertex(-18, 0);
        mouth.addVertex(0, 15);
        mouth.addVertex(18, 0);

        getGraphics().add(mouth, 0, 55);
    }
}
