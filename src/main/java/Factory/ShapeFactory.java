package Factory;

import models.Creator;
import models.Shape;
import models.Square;
import models.Pentagon;
import models.Circle;
import models.Triangle;
public class ShapeFactory implements Creator {

    @Override
    public Shape factoryMethod(String name) {
        if(name=="Пятиугольник"){
            return new Pentagon();
        }
        else if(name =="Квадрат"){
            return new Square();
        }
        else if(name=="Треугольник"){
            return new Triangle();
        }

        else if(name=="Круг"){
            return new Circle();
        }
        else{
            return null;
        }
    }


}
