package edu.macalester.comp124.critters;

import acm.graphics.GImage;
import acm.graphics.GRect;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

/**
 * Created by jyang4 on 3/13/14.
 */
public class DrakeRedCrest extends Critter {

    //FOR JUSTICE!

/*
    A dashing hero flashing through the spaceways,
He's red and black and white and yellow too!
Justice is what he claims to fight for.
But it's a mystery - what does this 'justice' mean? He hasn't got a clue.
Those who think they can disturb the peace,
Get a taste of his space fury.
Protector of the universe, that is his destiny.
Go! Space Hunter - Drake Redcrest.
*/

    @Override
    public void buildGraphics() {

        GImage DrakeRedCrest = null;
        try {
            DrakeRedCrest = new GImage(ImageIO.read(getClass().getResource("/Space_Hunter_Drake_RedCrest.png")));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        getGraphics().add(DrakeRedCrest);


        addEye(new Eye(5, 0.26, 0.18, Color.RED), 75, 70);
        addEye(new Eye(5, 0.26, 0.18, Color.RED), 105, 65);
    }

    private static final Color
            strokeColor = new Color(0, 0, 0),
            fillColor = new Color(100, 0,0);
}

