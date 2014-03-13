package edu.macalester.comp124.critters;

import acm.graphics.GArc;
import acm.graphics.GRect;

import java.awt.*;

/**
 * Created by Marcio on 3/13/14
 */

public class Spongebob extends Critter {

    @Override
    protected void buildGraphics() {

        GRect body = new GRect(-35, -20, 70, 100);
        body.setFilled(true);
        body.setFillColor(Color.YELLOW);
        getGraphics().add(body);

        Eye leftEye = new Eye(10, 0.46, 0.18, Color.BLUE);
        Eye rightEye = new Eye(10, 0.46, 0.18, Color.BLUE);
        addEye(leftEye, -18, 10);
        addEye(rightEye, 18, 10);

        GRect leftArm  = new GRect(35, 20, 10, 45);
        leftArm.setFilled(true);
        leftArm.setFillColor(Color.YELLOW);
        getGraphics().add(leftArm);

        GRect rightArm = new GRect(-45, 20, 10, 45);
        rightArm.setFilled(true);
        rightArm.setFillColor(Color.YELLOW);
        getGraphics().add(rightArm);

        GRect leftLeg  = new GRect(10, 80, 10, 40);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(Color.YELLOW);
        addLeg(new Leg(leftLeg, 2));

        GRect rightLeg = new GRect(-20, 80, 10, 40);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(Color.YELLOW);
        addLeg(new Leg(rightLeg, 2));

        GRect leftShoe = new GRect(10, 110, 17, 12);
        leftShoe.setFilled(true);
        leftShoe.setFillColor(Color.BLACK);
        getGraphics().add(leftShoe);

        GRect rightShoe = new GRect(-20, 110, 17, 12);
        rightShoe.setFilled(true);
        rightShoe.setFillColor(Color.BLACK);
        getGraphics().add(rightShoe);

        GRect shirt = new GRect(-35, 60, 70, 10);
        shirt.setFilled(true);
        shirt.setFillColor(Color.WHITE);
        getGraphics().add(shirt);

        GRect pants = new GRect(-35, 70, 70, 10);
        pants.setFilled(true);
        pants.setFillColor(Color.decode("0xB88A00"));
        getGraphics().add(pants);

        GRect tie = new GRect(-5, 60, 10, 15);
        tie.setFilled(true);
        tie.setFillColor(Color.RED);
        getGraphics().add(tie);

        GArc mouth = new GArc(40, 30, 0, -180);
        mouth.setFilled(true);
        mouth.setFillColor(Color.decode("0xFF6666"));
        getGraphics().add(mouth, -20, 20);

        GRect rightTooth = new GRect(-9, 35, 7, 7);
        rightTooth.setFilled(true);
        rightTooth.setFillColor(Color.WHITE);
        getGraphics().add(rightTooth);

        GRect leftTooth = new GRect(2, 35, 7, 7);
        leftTooth.setFilled(true);
        leftTooth.setFillColor(Color.WHITE);
        getGraphics().add(leftTooth);
    }


}
