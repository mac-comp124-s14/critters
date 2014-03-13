package edu.macalester.comp124.critters;

import acm.graphics.GArc;
import acm.graphics.GOval;
import acm.graphics.GRect;

import java.awt.*;

/**
 * Created by KevinTang on 3/13/14.
 */
public class PacMan extends Critter {

    @Override
    public void buildGraphics(){

        GRect leftleg = new GRect(10, 60, 12, 30);
        leftleg.setFilled(true);
        leftleg.setFillColor(bodycolor);
        leftleg.setColor(outsideColor);
        addLeg(new Leg(leftleg, 2));

        GRect rightleg = new GRect(40, 60, 12, 30);
        rightleg.setFilled(true);
        rightleg.setFillColor(bodycolor);
        rightleg.setColor(outsideColor);
        addLeg(new Leg(rightleg , 2));

        GArc body = new GArc(70,70, 30, 300);
        body.setFilled(true);
        body.setFillColor(bodycolor);
        body.setColor(outsideColor);
        getGraphics().add(body);

        Eye righteye = new Eye(2.5, 4, 2, Color.CYAN);
        addEye(righteye, 40, 10);

        GOval pacFoodOne = new GOval(55, 35, 5, 5);
        pacFoodOne.setFilled(true);
        pacFoodOne.setFillColor(Color.BLACK);
        getGraphics().add(pacFoodOne);

        GOval pacFoodtwo = new GOval(65, 35, 5, 5);
        pacFoodtwo.setFilled(true);
        pacFoodtwo.setFillColor(Color.BLACK);
        getGraphics().add(pacFoodtwo);

        GOval pacFoodthree = new GOval(75, 35, 5, 5);
        pacFoodthree.setFilled(true);
        pacFoodthree.setFillColor(Color.BLACK);
        getGraphics().add(pacFoodthree);

    }


    private static final Color bodycolor = new Color(163, 149, 7);
    private static final Color outsideColor = new Color(120, 16, 20);

}
