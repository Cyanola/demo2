package com.example.demo2;

import Factory.ShapeFactory;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import models.Shape;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    Canvas canvas;

    @FXML
    TextField txt;

    ShapeFactory shapeFactory;
    GraphicsContext gc;
    @FXML
    Label info;
    @FXML
    protected void onMouseClicked(MouseEvent event) {

        Shape shape = shapeFactory.factoryMethod(txt.getText());
        shape.setX(event.getX());
        shape.setY(event.getY());
shape.setHeight(150);
shape.setWidth(400);
      //получить контекст(холст) для рисования

        shape.draw(gc);
        info.setText(shape.descriptor());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        shapeFactory = new ShapeFactory();
        gc = canvas.getGraphicsContext2D();
    }
}