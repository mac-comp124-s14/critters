package edu.macalester.comp124.critters;

import acm.graphics.GLine;
import acm.graphics.GRect;

import java.awt.*;

/**
 * Created by Connor Valenti on 3/13/14.
 */
public class ImprovedRobot extends Critter {
    @Override
    protected void buildGraphics() {
        GRect leftLeg = new GRect(50, 50, 10, 30);
        leftLeg.setColor(Color.BLACK);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(Color.GRAY);
        addLeg(new Leg(leftLeg, 5));

        GRect rightLeg = new GRect(65, 50, 10, 30);
        rightLeg.setColor(Color.BLACK);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(Color.GRAY);
        addLeg(new Leg(rightLeg, 5));

        GRect leftArm = new GRect(25, 25, 30, 10);
        leftArm.setColor(Color.BLACK);
        leftArm.setFilled(true);
        leftArm.setFillColor(Color.GRAY);
        addLeg(new Leg(leftArm, 3));

        GRect rightArm = new GRect(70, 25, 30, 10);
        rightArm.setColor(Color.BLACK);
        rightArm.setFilled(true);
        rightArm.setFillColor(Color.GRAY);
        addLeg(new Leg(rightArm, 3));

        GRect body = new GRect(45, 25, 35, 25);
        body.setColor(Color.BLACK);
        body.setFilled(true);
        body.setFillColor(Color.GRAY);
        getGraphics().add(body);

        GRect head = new GRect(55, 10, 15, 15);
        head.setColor(Color.BLACK);
        head.setFilled(true);
        head.setFillColor(Color.GRAY);
        getGraphics().add(head);

        GLine leftAntenna = new GLine(62, 10, 55, -10);
        leftAntenna.setColor(Color.GRAY);
        getGraphics().add(leftAntenna);

        GLine rightAntenna = new GLine(62, 10, 69, -10);
        rightAntenna.setColor(Color.GRAY);
        getGraphics().add(rightAntenna);

        Eye eye = new Eye(7.5, .6, .2, Color.BLACK);
        addEye(eye, 62, 17);
    }
}
