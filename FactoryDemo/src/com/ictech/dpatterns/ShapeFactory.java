package com.ictech.dpatterns;

public class ShapeFactory {

    public Shape getshape (String name){
        if (name==null){
            return null;
        }else if(name.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(name.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(name.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;

    }


}
