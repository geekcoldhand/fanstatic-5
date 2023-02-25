package com.tmo.syncupkids.app.fantastic5;

public class Point {
    private int totalPoints;

    /**
     * How to create a Point:
     * Point myPoint = new Point();
     * myPoint.setPoints(50); // for example
     */
    public Point() {
        this.totalPoints = 0;
    }

    /**
     * adds points
     *
     * @param points
     */
    public void addPoints(int points) {
        this.totalPoints += points;
    }

    /**
     * subtracts points
     *
     * @param points
     */
    public void subtractPoints(int points) {
        this.totalPoints -= points;
    }

    /**
     * returns points
     *
     */
    public int getPoints() {
        return totalPoints;
    }

    /**
     * sets points
     *
     * @param points
     */
    public void setPoints(int points) {
        totalPoints = points;
    }
}