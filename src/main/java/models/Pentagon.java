package models;

import javafx.scene.canvas.GraphicsContext;

public class Pentagon extends Shape {
    @Override
    public void draw(GraphicsContext gr) {
        gr.setStroke(colorBorder);

        gr.setLineWidth(lineBorder);
        gr.strokePolygon(new double[]{x, x/2,x/1.5, x*1.5,x*2},
                new double[]{y,y*1.5, y*2, y*2,y*1.5},5
        );
        gr.strokePolygon(new double[]{x, x/2,x/1.5, x*1.5,x*2},
                new double[]{y,y*1.5, y*2, y*2,y*1.5},5
        );
        gr.setFill(colorFill);
        gr.fillPolygon(new double[]{x, x/2,x/1.5, x*1.5,x*2},
                new double[]{y,y*1.5, y*2, y*2,y*1.5},5
        );
        gr.fillPolygon(new double[]{x, x/2,x/1.5, x*1.5,x*2},
                new double[]{y,y*1.5, y*2, y*2,y*1.5},5
        );
    }

    @Override
    public String descriptor() {
        return "Цвет заливки пятиугольника " + super.colorFill +  "а границы : " + super.colorBorder;
    }
}
