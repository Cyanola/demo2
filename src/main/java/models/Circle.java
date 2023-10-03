package models;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape {
    public Circle() {
        super();

    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setStroke(colorBorder);
        gr.setLineWidth(lineBorder);
        gr.strokeOval(this.x - (height / 2), this.y - (super.width / 2), height, super.width);
        gr.setFill(colorFill);
        gr.fillOval(this.x - (height / 2), this.y - (super.width / 2), height, super.width);
    }

    @Override
    public String descriptor() {
        return null;
    }
}
