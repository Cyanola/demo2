package Factory;

import models.Creator;
import models.Shape;
import models.Square;
import models.Pentagon;
import models.Circle;
import models.Triangle;

import java.util.Objects;

public class ShapeFactory implements Creator {

    @Override
    public Shape factoryMethod(String name) {
        if(Objects.equals(name, "Пятиугольник")){
            return new Pentagon();
        }
        else if(Objects.equals(name, "Квадрат")){
            return new Square();
        }
        else if(Objects.equals(name, "Треугольник")){
            return new Triangle();
        }

        else if(Objects.equals(name, "Круг")){
            return new Circle();
        }
        else{
            return null;
        }
    }


}
