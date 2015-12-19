/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture1;

import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author Moeez
 */
public class FirstJAppletClass extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    @Override
    public void paint(Graphics g) {
        // TODO overwrite start(), stop() and destroy() methods
        g.drawString("My First Applet Diagram in EVS", 50, 50);
    }
}
