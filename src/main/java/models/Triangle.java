package models;

import javafx.scene.canvas.GraphicsContext;

public class Triangle extends Shape {
    @Override
    public void draw(GraphicsContext gc) {
        gc.beginPath();

// Make different Paths
        gc.setStroke(this.colorBorder);
        gc.setFill(this.colorFill);
        gc.setLineWidth(this.lineBorder);

        gc.moveTo(x, y);
        gc.lineTo(this.x *2, this.y*2+y);

        gc.lineTo(this.x+x*2+x,this.y*2+y);


        gc.lineTo(x,y);

        gc.fill();
        gc.stroke();


//// End the Path

        gc.closePath();
    }

    @Override
    public String descriptor() {
        return "Цвет заливки треугольника " + super.colorFill +  "а границы : " + super.colorBorder;     }
}
