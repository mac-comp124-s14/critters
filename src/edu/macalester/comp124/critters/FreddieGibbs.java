package edu.macalester.comp124.critters;

import acm.graphics.GImage;
import acm.graphics.GRect;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created by willkentdaggett on 3/13/14.
 */
public class FreddieGibbs extends Critter {

    @Override
    protected void buildGraphics() {

        GRect leftLeg = new GRect(100, 210, 35, 100);
        leftLeg.setFilled(true);
        leftLeg.setColor(Color.black);
        addLeg(new Leg(leftLeg, 2));

        GRect rightLeg = new GRect(150, 210, 35, 100);
        leftLeg.setFilled(true);
        leftLeg.setColor(Color.black);
        addLeg(new Leg(rightLeg, 2));

        GImage freddieG = null;
        try {
            freddieG = new GImage(ImageIO.read(getClass().getResource("/gibbs.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        getGraphics().add(freddieG);

        addEye(new Eye(10, 0.26, 0.18, Color.RED), 100, 25);
        addEye(new Eye(10, 0.26, 0.18, Color.RED), 115, 30);

    }
}
