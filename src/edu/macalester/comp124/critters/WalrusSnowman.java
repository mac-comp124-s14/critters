package edu.macalester.comp124.critters;

import acm.graphics.GOval;
import acm.graphics.GRect;

import java.awt.*;

/**
 * Created by jyang4 on 3/13/14.
 */
public class WalrusSnowman extends Critter {

    @Override
    public void buildGraphics(){

        //tried to make a snowman, kinda reversed head, body, bottombody

        GOval head = new GOval(-25,0, 75,75);
        head.setFilled(true);
        head.setFillColor(Color.GRAY);
        getGraphics().add(head);

        GOval body = new GOval(-25, 50, 110, 110);
        body.setFilled(true);
        body.setFillColor(Color.GRAY);
        getGraphics().add(body);

        GOval bottomBody = new GOval(-25, 105,100,100);
        bottomBody.setFilled(true);
        bottomBody.setFillColor(Color.GRAY);
        getGraphics().add(bottomBody);

        GRect leftTusk = new GRect(-20, 40, 7, 40);
        leftTusk.setColor(Color.WHITE);
        leftTusk.setFilled(true);
        leftTusk.setFillColor(Color.WHITE);
        addLeg(new Leg(leftTusk, 2));

        GRect rightTusk = new GRect( 10, 40, 7, 40);
        rightTusk.setColor(Color.WHITE);
        rightTusk.setFilled(true);
        rightTusk.setFillColor(Color.WHITE);
        addLeg(new Leg(rightTusk, 2));

        Eye leftEye = new Eye(6, 0.26, 0.18, Color.BLUE);
        Eye rightEye = new Eye(6, 0.26, 0.18, Color.BLUE);
        addEye(leftEye, -8, 10);
        addEye(rightEye, 8, 10);
    }

    public static final Color saddleBrown = new Color(139,69,19);
}
