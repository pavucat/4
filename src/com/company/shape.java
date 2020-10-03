package com.company;

import java.net.PortUnreachableException;

public abstract class shape{
   String color;
   boolean filled;
   shape() {};
   shape(String color, boolean filled)
   {
       this.color=color;
       this.filled=filled;
   }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFiled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public double getarea(){ return 0;};
   public double getperimeter(){return 0;};
   @Override
    public String toString(){return "";};
}
class Rectangle extends shape
{
    double width;
    double lenght;
    Rectangle(){};
    Rectangle(double width, double lenght)
    {
        this.lenght=lenght;
        this.width=width;
    }
    Rectangle (double width, double lenght, String color, boolean filled)
    {
        this.lenght=lenght;
        this.width=width;
        this.color=color;
        this.filled=filled;
    }

    public double getWidth() {
        return width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getarea() {
        return lenght*width;
    }

    @Override
    public double getperimeter() {
        return 2*lenght+2*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                "lenght="+ lenght+"area="+getarea()+"perimeter="+getperimeter()+"}";
    }
}
class square extends Rectangle
{
    square(){};
    square(double side)
    {
        lenght=side;
    }
    square(double side, String color, boolean filled)
    {
        lenght=side;
        this.color=color;
        this.filled=filled;
    }
    public double getSide()
    {
        return lenght;
    }
    public void setSide(double side)
    {
        lenght=side;
    }

    @Override
    public String toString() {
        return "square{"+"side="+lenght+"}";
    }
}
class circle extends shape
{
    double r;
    circle(){};
    circle(double r)
    {
        this.r=r;
    }
    circle(double r, String color, boolean filled)
    {
        this.r=r;
        this.color=color;
        this.filled=filled;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getarea()
    {
        return Math.PI*Math.pow(r, 2);
    }

    @Override
    public double getperimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public String toString() {
        return "circle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", r=" + r +
                '}';
    }
}
class main
{
    public static void main(String[] args)
    {
        circle one=new circle(2, "saasdasd", true);
        System.out.println(one.toString());
        System.out.println(one.getarea());
    }
}