package edu.macalester.comp124.critters;

import acm.graphics.GImage;
import acm.graphics.GRect;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created by RLP on 3/13/14.
 */
public class PersonOnStilts extends Critter {

    @Override
    protected void buildGraphics(){

        GRect stiltOne = new GRect(20, 150, 20, 400);
        Color stiltColor = new Color(218,165,32);
        stiltOne.setColor(stiltColor);
        stiltOne.setFilled(true);
        stiltOne.setFillColor(stiltColor);
        addLeg(new Leg(stiltOne, 5));

        GRect stiltTwo = new GRect(60, 150, 20, 400);
        stiltTwo.setColor(stiltColor);
        stiltTwo.setFilled(true);
        stiltTwo.setFillColor(stiltColor);
        addLeg(new Leg(stiltTwo, 5));

        GImage Person = null;
        try {
            Person = new GImage(ImageIO.read(getClass().getResource("/Person.png")));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        getGraphics().add(Person);

        addEye(new Eye(10, 0.26, 0.18, Color.GREEN), 20, 40);
        addEye(new Eye(10, 0.26, 0.18, Color.GREEN), 50, 40);
    }
}
