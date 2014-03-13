package edu.macalester.comp124.critters;

import acm.graphics.GImage;
import acm.graphics.GOval;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created by jgraham2 on 3/13/14.
 */
public class Merman extends Critter {

    @Override
    protected void buildGraphics() {

        GImage tail = null;
        try {
            tail = new GImage(ImageIO.read(getClass().getResource("/mermaid_tail.png")),-10,130);
        } catch (IOException e) {
            e.printStackTrace();
        }
        addLeg(new Leg(tail, 3));

        GImage leftArm = null;
        try {
            leftArm = new GImage(ImageIO.read(getClass().getResource("/mermaid_arm.png")),30,-30);
        } catch (IOException e) {
            e.printStackTrace();
        }
        leftArm.setSize(-90,90);
        getGraphics().add(leftArm);

        GImage rightArm = null;
        try {
            rightArm = new GImage(ImageIO.read(getClass().getResource("/mermaid_arm.png")),60,-30);
        } catch (IOException e) {
            e.printStackTrace();
        }
        rightArm.setSize(90, 90);
        getGraphics().add(rightArm);

        GOval body = new GOval(90,170);
        body.setFilled(true);
        body.setFillColor(new Color(255, 209, 195));
        getGraphics().add(body);

        GOval lNipple = new GOval(20, 50, 4, 4);
        lNipple.setFilled(true);
        lNipple.setFillColor(Color.BLACK);
        getGraphics().add(lNipple);

        GOval rNipple = new GOval(70, 50, 4, 4);
        rNipple.setFilled(true);
        rNipple.setFillColor(Color.BLACK);
        getGraphics().add(rNipple);

        GOval bellyButton = new GOval(45, 140, 4, 4);
        bellyButton.setFilled(true);
        bellyButton.setFillColor(Color.BLACK);
        getGraphics().add(bellyButton);

        GOval head = new GOval(20,-38,50,70);
        head.setFilled(true);
        head.setFillColor(new Color(255, 209, 195));
        getGraphics().add(head);

        addEye(new Eye(30, 0.65 , 0.5, Color.CYAN), 20, -25);
        addEye(new Eye(30, 0.65 , 0.5, Color.CYAN), 60, -25);





    }
}
