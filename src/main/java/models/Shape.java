package models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape{

    protected int lineBorder;
    protected Color colorBorder;
    protected Color colorFill;
    protected double x, y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Shape() {
        this.lineBorder = 10;
        this.colorBorder = Color.TAN;
        this.colorFill = Color.HONEYDEW;
        this.x = 450;
        this.y = 350;
    }
    public double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double width;


    public abstract void draw(GraphicsContext gr);
    public abstract String descriptor();


    public double getLineBorder() {
        return lineBorder;
    }

    public void setLineBorder(int lineBorder) {
        this.lineBorder = lineBorder;
    }

    public Color getColorBorder() {
        return colorBorder;
    }

    public void setColorBorder(Color colorBorder) {
        this.colorBorder = colorBorder;
    }

    public Color getColorFill() {
        return colorFill;
    }

    public void setColorFill(Color colorFill) {
        this.colorFill = colorFill;
    }
}
