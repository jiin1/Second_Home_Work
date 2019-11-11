package com.lobach;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] arr = {x, y};
        return arr;
    }


    public void setXY(int x, int y) {
        this.y = y;
        this.x = x;
    }

    @Override
    public String toString() {
        return  "(x=" + x +
                ", y=" + y +
                ')';
    }

    public  double dictance(int x, int y){
        int disX = x-this.x;
        int disY = y-this.y;
        double Distance= Math.sqrt(Math.pow(disX,2)+Math.pow(disY,2));
        return Distance;
    }

    public double dictance( MyPoint another){
        int disX = another.getX()-this.x;
        int disY = another.getY()-this.y;
        double Distance= Math.sqrt((disX*disX)+(disY*disY));
        return Distance;
    }

    public double dictance(){
        int disX = this.x;
        int disY = this.y;
        double Distance= Math.sqrt((disX*disX)+(disY*disY));
        return Distance;
    }
}
