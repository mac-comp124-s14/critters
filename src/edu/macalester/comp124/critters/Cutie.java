package edu.macalester.comp124.critters;

import acm.graphics.GImage;
import acm.graphics.GRect;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;


/**
 * Created by hli on 3/13/14.
 */
public class Cutie extends Critter{
    protected void buildGraphics() {





        GImage Cutie = null;
        try {
            Cutie = new GImage(ImageIO.read(getClass().getResource("/cutiepie.png")));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        getGraphics().add(Cutie);


        addEye(new Eye(10, 0.26, 0.18, Color.blue), 105, 30);
        addEye(new Eye(10, 0.26, 0.18, Color.RED), 75, 45);
        addEye(new Eye(10, 0.26, 0.18, Color.yellow), 90, 35);
        addEye(new Eye(10, 0.26, 0.18, Color.blue), 110, 40);
        addEye(new Eye(10, 0.26, 0.18, Color.RED), 75, 60);

    }


    private static final Color
            strokeColor = new Color(0, 0, 0),
            fillColor = new Color(100, 0,0);
}
