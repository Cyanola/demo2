package models;

import javafx.scene.canvas.GraphicsContext;

public class Square extends Shape {
    @Override
    public void draw(GraphicsContext gr) {
        gr.setStroke(colorBorder);
        gr.setLineWidth(lineBorder);
        gr.strokeRect(this.x - (width/2), this.y - (height/2), width, height);
        gr.setFill(colorFill);
        gr.fillRect(this.x - (width/2), this.y - (height/2), width, height);
    }

    @Override
    public String descriptor() {
        return "Цвет заливки квадрата " + super.colorFill +  "а границы : " + super.colorBorder;
    }
}
