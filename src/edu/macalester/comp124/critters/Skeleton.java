package edu.macalester.comp124.critters;/*
Created by Cole Erickson, cericks4@macalester.edu
Date: 10/15/13 Time: 10:02 AM

*/
import java.awt.*;
import java.io.IOException;

import acm.graphics.*;

import javax.imageio.ImageIO;


public class Skeleton extends Critter {
    @Override
    protected void buildGraphics() {

        GRect leftLeg  = new GRect(76, 150, 13, 110);
        leftLeg.setColor(strokeColor);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(fillColor);
        addLeg(new Leg(leftLeg, 2));

        GRect rightLeg = new GRect( 95, 150, 13, 110);
        rightLeg.setColor(strokeColor);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(fillColor);
        addLeg(new Leg(rightLeg, 2));

        GImage Skeleton = null;
        try {
            Skeleton = new GImage(ImageIO.read(getClass().getResource("/skeleton.png")));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        getGraphics().add(Skeleton);

        addEye(new Eye(10, 0.5, 0.18, Color.blue), 87, 24);
        addEye(new Eye(10, 0.5, 0.18, Color.yellow), 105, 24);




    }
    private static final Color
            strokeColor = new Color(255, 248, 220),
            fillColor   = new Color(205, 175, 149);
}
