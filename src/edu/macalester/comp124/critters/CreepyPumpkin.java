package edu.macalester.comp124.critters;

import acm.graphics.*;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: igreene
 * Date: 10/15/13
 * Time: 9:59 AM
 * To change this template use File | Settings | File Templates.
 */
public class CreepyPumpkin extends Critter{

    GImage CreepyPumpkin = null;
    @Override
    protected void buildGraphics() {


        try {
            CreepyPumpkin = new GImage(ImageIO.read(getClass().getResource("/CreepyPumpkin.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }


        createLeg(-25, 0);
        createLeg(-50, 75);
        createLeg(-25, 130);
        createLeg(175, 0);
        createLeg(200, 75);
        createLeg(175, 130);

        getGraphics().add(CreepyPumpkin);



        addEye(new Eye(16, 0.6, 0.2, Color.BLACK), 60, 20);
        addEye(new Eye(20, 0.2, 0.1, Color.RED), 110, 37);
    }

    private void createLeg(double x, double y) {
        GLine legLine = new GLine(CreepyPumpkin.getWidth()/2, CreepyPumpkin.getHeight()/2, x, y);


        addLeg(new Leg(legLine, 4));
    }
}
