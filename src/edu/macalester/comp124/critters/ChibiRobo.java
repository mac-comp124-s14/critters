package edu.macalester.comp124.critters;

import acm.graphics.GImage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created by jyang4 on 3/13/14.
 */
public class ChibiRobo extends Critter {

    @Override
    public void buildGraphics() {

        GImage ChibiRobo = null;
        try {
            ChibiRobo = new GImage(ImageIO.read(getClass().getResource("/Chibi-Robo_Pick_Up_Plug.png")));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        getGraphics().add(ChibiRobo);


        addEye(new Eye(5, 0.26, 0.18, Color.RED), 90, 65);
        addEye(new Eye(5, 0.26, 0.18, Color.RED), 115, 65);
    }

    private static final Color
            strokeColor = new Color(0, 0, 0),
            fillColor = new Color(100, 0,0);

}
