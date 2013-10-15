package edu.macalester.comp124.critters;

import acm.graphics.GImage;
import acm.graphics.GPolygon;
import acm.graphics.GRect;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Falcor extends Critter {

    @Override
    protected void buildGraphics() {

        GPolygon tail1 = new GPolygon(0,70);
        tail1.addVertex(150,0);
        tail1.addVertex(0,0);
        tail1.addArc(150, 75, 200, 110);
        tail1.scale(1.8);
        tail1.rotate(-45);
        tail1.setFilled(true);
        tail1.setColor(tailColor);
        addLeg(new Leg(tail1, 10));

        GRect leg1  = new GRect(200, 300, 35, 95);
        leg1.setColor(legColor);
        leg1.setFilled(true);
        leg1.setFillColor(legColor);
        addLeg(new Leg(leg1, 2));

        GRect leg2  = new GRect(240, 300, 35, 95);
        leg2.setColor(legColor);
        leg2.setFilled(true);
        leg2.setFillColor(legColor);
        addLeg(new Leg(leg2, 2));

        GRect leg3  = new GRect(310, 300, 35, 95);
        leg3.setColor(legColor);
        leg3.setFilled(true);
        leg3.setFillColor(legColor);
        addLeg(new Leg(leg3, 2));

        GRect leg4  = new GRect(350, 300, 35, 95);
        leg4.setColor(legColor);
        leg4.setFilled(true);
        leg4.setFillColor(legColor);
        addLeg(new Leg(leg4, 2));


        GImage falcor = null;
        try {
            falcor = new GImage(ImageIO.read(getClass().getResource("/falcor.png")));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        getGraphics().add(falcor, 100, 0);


        addEye(new Eye(30, 0.26, 0.18, Color.RED), 275, 115);
        addEye(new Eye(30, 0.26, 0.18, Color.RED), 400, 75);
    }


    private static final Color
            tailColor = new Color(137, 136, 137),
            legColor = new Color(41, 44, 42);
}
