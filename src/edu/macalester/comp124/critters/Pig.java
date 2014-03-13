package edu.macalester.comp124.critters;

import acm.graphics.*;

import java.awt.*;

/**
 * Created by rberman on 3/13/14.
 */
public class Pig extends Critter {

    @Override
    protected void buildGraphics() {
        GRect leftLeg  = new GRect(-16, 10, 10, 40);
        leftLeg.setColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 2));

        GRect rightLeg = new GRect( 6, 10, 10, 40);
        rightLeg.setColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 2));

        GOval tail1 = new GOval(27, -5, 15, 15);
        tail1.setColor(fillColor);
        getGraphics().add(tail1);

        GOval tail2 = new GOval(37, -5, 10, 10);
        tail2.setColor(fillColor);
        getGraphics().add(tail2);

        GOval body = new GOval(-35, -30, 70, 70);
        body.setColor(strokeColor);
        body.setFilled(true);
        body.setFillColor(fillColor);
        getGraphics().add(body);

        GOval ear1 = new GOval(-20, -50, 15, 15);
        ear1.setColor(strokeColor);
        ear1.setFilled(true);
        ear1.setFillColor(fillColor);
        getGraphics().add(ear1);

        GOval ear2 = new GOval(5, -50, 15, 15);
        ear2.setColor(strokeColor);
        ear2.setFilled(true);
        ear2.setFillColor(fillColor);
        getGraphics().add(ear2);

        GOval head = new GOval(-25, -40, 50, 50);
        head.setColor(strokeColor);
        head.setFilled(true);
        head.setFillColor(fillColor);
        getGraphics().add(head);

        Eye leftEye = new Eye(6, 0.26, 0.18, Color.GREEN);
        Eye rightEye = new Eye(6, 0.26, 0.18, Color.GREEN);
        addEye(leftEye, -10, -25);
        addEye(rightEye, 10, -25);

        GOval nose = new GOval(-10, -25, 20, 20);
        nose.setColor(strokeColor);
        nose.setFilled(true);
        nose.setFillColor(fillColor);
        getGraphics().add(nose);

        GOval nostril1 = new GOval(3, -18, 3, 5);
        nostril1.setColor(strokeColor);
        nostril1.setFilled(true);
        nostril1.setFillColor(strokeColor);
        getGraphics().add(nostril1);

        GOval nostril2 = new GOval(-7, -18, 3, 5);
        nostril2.setColor(strokeColor);
        nostril2.setFilled(true);
        nostril2.setFillColor(strokeColor);
        getGraphics().add(nostril2);
    }


    private static final Color
            strokeColor = new Color(40, 40, 60),
            fillColor   = new Color(232, 120, 129);
}
