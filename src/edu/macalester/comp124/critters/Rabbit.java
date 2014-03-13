package edu.macalester.comp124.critters;


import acm.graphics.GOval;

import java.awt.*;

/**
 * Created by Reena on 3/13/14.
 */

public class Rabbit extends Critter {

    protected void buildGraphics(){

        GOval leftEars = new GOval(25, 25, 10, 50);
        GOval rightEars = new GOval(50, 25, 10, 50);
        leftEars.setFilled(true);
        rightEars.setFilled(true);
        leftEars.setFillColor(Color.DARK_GRAY);
        rightEars.setFillColor(Color.DARK_GRAY);
        getGraphics().add(leftEars);
        getGraphics().add(rightEars);

        GOval leftInnerEars = new GOval(27, 40, 8, 35);
        GOval rightInnerEars = new GOval(52, 40, 8, 35);
        leftInnerEars.setFilled(true);
        rightInnerEars.setFilled(true);
        leftInnerEars.setFillColor(Color.ORANGE);
        rightInnerEars.setFillColor(Color.ORANGE);
        getGraphics().add(leftInnerEars);
        getGraphics().add(rightInnerEars);

        GOval face = new GOval(20, 60, 50, 25);
        face.setFilled(true);
        face.setFillColor(Color.gray);
        getGraphics().add(face);

        Eye leftEye = new Eye(3, 1.5, 0.18, Color.BLUE);
        Eye rightEye = new Eye(3, 1.5, 0.18, Color.BLUE);
        addEye(leftEye, 25, 65);
        addEye(rightEye, 45, 65);

        GOval nose = new GOval(35, 70 ,10, 5);
        nose.setFilled(true);
        nose.setFillColor(Color.pink);
        getGraphics().add(nose);
    }









}
