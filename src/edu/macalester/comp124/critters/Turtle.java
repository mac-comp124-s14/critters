package edu.macalester.comp124.critters;

import acm.graphics.GArc;
import acm.graphics.GOval;
import acm.graphics.GRect;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: mfinegold28
 * Date: 10/15/13
 * Time: 9:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class Turtle extends Critter {

    @Override
    protected void buildGraphics() {
        for (int i = 0; i < 4; i++) {
            GRect leg1 = new GRect(-30 + 20 * i, 0, 10, 20);
            leg1.setColor(Color.GREEN);
            leg1.setFilled(true);
            leg1.setColor(Color.BLACK);
            leg1.setFillColor(Color.GREEN);
            addLeg(new Leg(leg1, 2));
        }


        GArc shell = new GArc(80, 50, 0, 180);
        shell.setFilled(true);
        shell.setFillColor(Color.GREEN);
        getGraphics().add(shell, -40, -25);

        GOval head = new GOval(35, 20);
        head.setFilled(true);
        head.setFillColor(Color.GREEN);
        getGraphics().add(head, 40, -5);


        Eye leftEye = new Eye(6, 0.26, 0.18, Color.BLUE);
        //Eye rightEye = new Eye(6, 0.26, 0.18, Color.BLUE);

        addEye(leftEye, 55, 0);
        //addEye(rightEye, 10, -46);
    }

    private static final Color
            strokeColor = new Color(40, 40, 60),
            fillColor = new Color(160, 172, 182);

}

