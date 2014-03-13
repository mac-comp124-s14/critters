package edu.macalester.comp124.critters;

import acm.graphics.*;
import acm.util.RandomGenerator;

import java.awt.*;

/**
 * Created by Barbara B on 3/13/14.
 */
public class MonstersIncBot extends Critter {

    private static final Color
        strokeColor = new Color(40, 40, 60),
        fillColor   = new Color(143, 182, 75),
        dotColor = new Color(255, 255, 255),
        hornColor = new Color(150, 100, 18);

    @Override
    protected void buildGraphics() {

        GRect rightArm = new GRect(-40, 25, 15, 10);
        rightArm.setColor(strokeColor);
        rightArm.setFilled(true);
        rightArm.setFillColor(fillColor);
        getGraphics().add(rightArm);

        GRect leftArm = new GRect(75, 25, 15, 10);
        leftArm.setColor(strokeColor);
        leftArm.setFilled(true);
        leftArm.setFillColor(fillColor);
        getGraphics().add(leftArm);

        GRect leftLeg  = new GRect(0, 65, 15, 40);
        leftLeg.setColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 4));

        GRect rightLeg = new GRect(30, 65, 15, 40);
        rightLeg.setColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 4));

        GPolygon leftHorn = new GPolygon();
        leftHorn.addVertex(0, 20);
        leftHorn.addVertex(10, 0);
        leftHorn.addVertex(20, 20);
        leftHorn.setColor(strokeColor);
        leftHorn.setFilled(true);
        leftHorn.setFillColor(hornColor);
        getGraphics().add(leftHorn, -5, -35);

        GPolygon rightHorn = new GPolygon();
        rightHorn.addVertex(0, 20);
        rightHorn.addVertex(10, 0);
        rightHorn.addVertex(20, 20);
        rightHorn.setColor(strokeColor);
        rightHorn.setFilled(true);
        rightHorn.setFillColor(hornColor);
        getGraphics().add(rightHorn, 35, -35);

        GOval head = new GOval(-25, -25, 100, 100);
        head.setColor(strokeColor);
        head.setFilled(true);
        head.setFillColor(fillColor);
        getGraphics().add(head);

        RandomGenerator rgen = new RandomGenerator();
        double w = head.getWidth();
        double h  = head.getHeight();

        for (int i = 0; i < 20; i++) {
            double randomW = rgen.nextDouble(-w/4, w/1.5);
            double randomH = rgen.nextDouble(-h/4, h/1.5);
            GOval dot = new GOval(randomW, randomH, 5, 5);
            dot.setFilled(true);
            dot.setColor(dotColor);
            getGraphics().add(dot);
        }

        Eye rightEye = new Eye(30, 0.6, 0.1, Color.GREEN);
        addEye(rightEye, 25, 10);

        GArc mouth = new GArc(30, 30, 0, 180);
        mouth.setFilled(true);
        getGraphics().add(mouth, 10, 50);
    }

}