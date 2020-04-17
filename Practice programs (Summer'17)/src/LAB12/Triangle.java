package LAB12;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Triangle extends Polygon {

    private double sideA;
    private double sideB;
    private double sideC;
    public Triangle (){
        
    }
    public Triangle (double sideA, double sideB, double sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
        
    }
    public double getSideA(){
        return sideA;
    }
    public double getSideB(){
        return sideB;
    }
    public double getSideC(){
        return sideC;
    }
    public void setSideA(double sideA ){
        this.sideA=sideA;
    }
    public void setSideB(double sideB ){
        this.sideB=sideB;
    }
    public void setSideC(double sideC ){
        this.sideC=sideC;
    }
    
    public double area(){
        double s = (sideA+ sideB +sideC)/2;
        
        return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
    }
    public double perimeter(){
            return sideA+ sideB+ sideC;
    }
}
