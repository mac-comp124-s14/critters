package edu.macalester.comp124.critters;

import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;

import java.awt.*;

/**
 * Created by Monica on 3/13/14.
 */
public class AnUnsureCritter extends Critter {

    @Override
    public void buildGraphics(){

        GRect leftLeg  = new GRect(30, 80, 10, 25);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(Color.RED.brighter());
        addLeg(new Leg(leftLeg, 2));

        GRect rightLeg = new GRect(55, 80, 10, 25);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(Color.RED.brighter());
        addLeg(new Leg(rightLeg, 2));

        GRect leftArm = new GRect(-5,40, 20,5);
        leftArm.setFilled(true);
        leftArm.setFillColor(Color.RED.brighter());
        addLeg(new Leg(leftArm, 2));

        GRect rightArm = new GRect(80,40,20,5);
        rightArm.setFilled(true);
        rightArm.setFillColor(Color.RED.brighter());
        addLeg(new Leg(rightArm,2));

        GOval leaf = new GOval(50, 5, 13, 5);
        leaf.setFilled(true);
        leaf.setFillColor(Color.GREEN.brighter());
        getGraphics().add(leaf);

        GRect stem = new GRect(45, -3, 5, 20);
        stem.setFilled(true);
        stem.setFillColor(Color.RED.darker());
        getGraphics().add(stem);

        GOval body = new GOval(5, 10 , 80, 80);
        body.setFilled(true);
        body.setFillColor(Color.RED.brighter());
        getGraphics().add(body);


        Eye leftEye = new Eye(10, 0.46, 0.18, Color.GREEN);
        Eye rightEye = new Eye(10, 0.46, 0.18, Color.GREEN);
        addEye(leftEye, 30 ,40 );
        addEye(rightEye, 60 ,40 );
    }


}
