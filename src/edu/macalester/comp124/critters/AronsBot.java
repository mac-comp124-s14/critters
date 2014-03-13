package edu.macalester.comp124.critters;

import acm.graphics.GImage;
import acm.graphics.GRect;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;


/**
 * Created by athomas5 on 3/13/14.
 */
public class AronsBot extends Critter{

    @Override
    protected void buildGraphics() {

        GImage Finn = null;
        try {
            Finn = new GImage(ImageIO.read(getClass().getResource("/adventureTime.png")));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        getGraphics().add(Finn);

        GRect leftLeg = new GRect(160,130,25,90);
        leftLeg.setColor(Color.GREEN);
        leftLeg.setFilled(true);
        leftLeg.setFillColor(Color.MAGENTA);
        addLeg(new Leg(leftLeg, 2));

        GRect rightLeg = new GRect(130,130,25,90);
        rightLeg.setColor(Color.RED);
        rightLeg.setFilled(true);
        rightLeg.setFillColor(Color.cyan);
        addLeg(new Leg(rightLeg, 2));

        addEye(new Eye(10, 0.26, 0.18, Color.PINK), 140, 30);
        addEye(new Eye(10, 0.26, 0.18, Color.BLUE), 160, 30);
    }
}
