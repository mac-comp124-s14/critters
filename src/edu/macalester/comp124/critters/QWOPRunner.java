package edu.macalester.comp124.critters;

import acm.graphics.GImage;
import acm.graphics.GPoint;
import acm.graphics.GRect;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created by evan on 3/13/14.
 */
public class QWOPRunner extends Critter {

    public static final Color legColor = new Color(142, 74, 38);
    public static final GPoint hip = new GPoint(62,155);

    @Override
    protected void buildGraphics() {

        GRect left = new GRect(hip.getX(), hip.getY(), 28 ,QWOPRightLeg.TLENGTH+QWOPRightLeg.CHEIGHT);
        left.setColor(legColor);
        left.setFilled(true);
        left.setFillColor(legColor);
        addLeg(new Leg(left, 2));

        QWOPRightLeg right = new QWOPRightLeg();
        addLeg(new Leg(right, 2));

        GImage body = null;
        try {
            body = new GImage(ImageIO.read(getClass().getResource("/qwop-body.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        getGraphics().add(body);

        addEye(new Eye(4, 0.25, 0.18, legColor), 110, 25);

    }
}
