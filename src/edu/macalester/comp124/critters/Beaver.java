package edu.macalester.comp124.critters;

import acm.graphics.*;
import java.awt.*;


/**
 * Created by ahejl on 3/13/14.
 */
public class Beaver extends Critter {

    private static final Color
        tanColor = new Color(200, 180, 135),
        detailColor   = new Color(90, 40, 0),
        whiteColor = new Color(255, 255, 255),
        furColor = new Color(140, 60, 28);

    @Override
    protected void buildGraphics() {

        GOval tail = new GOval(30, 20, 35, 50);
        tail.setColor(detailColor);
        tail.setFilled(true);
        tail.setFillColor(detailColor);
        getGraphics().add(tail);

        GOval body = new GOval(-10, 20, 60, 70);
        body.setColor(furColor);
        body.setFilled(true);
        body.setFillColor(furColor);
        getGraphics().add(body);

        GOval head = new GOval(-10, -10, 50, 40);
        head.setColor(furColor);
        head.setFilled(true);
        head.setFillColor(furColor);
        getGraphics().add(head);

        Eye leftEye = new Eye(8, 0.46, 0.18, detailColor);
        Eye rightEye = new Eye(8, 0.46, 0.18, detailColor);
        addEye(leftEye, 5, 5);
        addEye(rightEye, 25, 5);

        GRect rightTooth = new GRect(12, 16, 2, 6);
        rightTooth.setColor(whiteColor);
        rightTooth.setFilled(true);
        rightTooth.setFillColor(whiteColor);
        getGraphics().add(rightTooth);

        GRect leftTooth = new GRect(16, 16, 2, 6);
        leftTooth.setColor(whiteColor);
        leftTooth.setFilled(true);
        leftTooth.setFillColor(whiteColor);
        getGraphics().add(leftTooth);

        GOval nose = new GOval(13, 12, 5, 4);
        nose.setColor(detailColor);
        nose.setFilled(true);
        nose.setFillColor(detailColor);
        getGraphics().add(nose);

        GRect rightLeg = new GRect(10, 85, 10, 5);
        rightLeg.setColor(detailColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(detailColor);
        addLeg(new Leg(rightLeg, 2));

        GRect leftLeg = new GRect(25, 85, 10, 5);
        leftLeg.setColor(detailColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(detailColor);
        addLeg(new Leg(leftLeg, 2));

        GOval tummy = new GOval(0, 30, 40, 50);
        tummy.setColor(tanColor);
        tummy.setFilled(true);
        tummy.setFillColor(tanColor);
        getGraphics().add(tummy);

        GOval rightPaw = new GOval(30, 40, 10, 10);
        rightPaw.setColor(detailColor);
        rightPaw.setFilled(true);
        rightPaw.setFillColor(detailColor);
        getGraphics().add(rightPaw);

        GOval leftPaw = new GOval(-8, 40, 10, 10);
        leftPaw.setColor(detailColor);
        leftPaw.setFilled(true);
        leftPaw.setFillColor(detailColor);
        getGraphics().add(leftPaw);

    }
}
