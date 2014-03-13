package edu.macalester.comp124.critters;


import acm.graphics.GImage;
import acm.graphics.GRect;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;
/**
 * Created by chris on 3/13/14.
 */
public class SpaghettiMonster extends Critter{
    @Override
    protected void buildGraphics() {

        GRect leftLeg  = new GRect(10, 170, 200, 20);
        leftLeg.setColor(Color.LIGHT_GRAY);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(Color.LIGHT_GRAY);
        addLeg(new Leg(leftLeg, 2));

        GRect rightLeg  = new GRect(300, 170, 200, 20);
        rightLeg.setColor(Color.LIGHT_GRAY);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(Color.LIGHT_GRAY);
        addLeg(new Leg(rightLeg, 2));


        GImage SpaghettiMonster = null;
        try {
            SpaghettiMonster = new GImage(ImageIO.read(getClass().getResource("/SpaghettiMonster.png")));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        getGraphics().add(SpaghettiMonster);


        addEye(new Eye(20, 0.8, 2, Color.MAGENTA), 315, 30);
        addEye(new Eye(20, 0.8, 2, Color.MAGENTA), 160, 50);
    }


    private static final Color
            strokeColor = new Color(0, 0, 0),
            fillColor = new Color(100, 0,0);
}
