package edu.macalester.comp124.critters;

import acm.graphics.GCompound;
import acm.graphics.GRect;

/**
 * Created by evan on 3/13/14.
 */
public class QWOPRightLeg extends GCompound {
    public static final int
            TLENGTH = 90,
            THEIGHT = 28,
            CWIDTH = 25,
            CHEIGHT = 70;

    public QWOPRightLeg() {
        double hipX = QWOPRunner.hip.getX();
        double hipY = QWOPRunner.hip.getY();

        GRect Thigh = new GRect(hipX, hipY, TLENGTH, THEIGHT);
        Thigh.setColor(QWOPRunner.legColor);
        Thigh.setFilled(true);
        Thigh.setFillColor(QWOPRunner.legColor);
        add(Thigh);

        GRect Calf = new GRect(hipX+TLENGTH - CWIDTH, hipY + THEIGHT, CWIDTH, CHEIGHT);
        Calf.setColor(QWOPRunner.legColor);
        Calf.setFilled(true);
        Calf.setFillColor(QWOPRunner.legColor);
        add(Calf);


    }

}
