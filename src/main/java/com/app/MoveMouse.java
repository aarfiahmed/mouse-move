package com.app;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Logger;

public class MoveMouse {
private static final Logger log= Logger.getLogger(MoveMouse.class.getName());
    public static void main(String[] args) {
        try {
            log.info("App started");
            Robot robot = new Robot();
            // Create a Timer
            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    int x = (int) java.awt.MouseInfo.getPointerInfo().getLocation().getX();
                    int y = (int) java.awt.MouseInfo.getPointerInfo().getLocation().getY();

                    robot.mouseMove(x + 10, y + 10);
                }
            }, 0, 10000); // Schedule the task to run every 10000 milliseconds (10 seconds)

        } catch (AWTException e) {
          log.info("error occurred while processing ->"+e.getMessage());
        }
    }
}
