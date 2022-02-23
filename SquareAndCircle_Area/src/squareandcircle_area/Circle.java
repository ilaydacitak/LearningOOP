package squareandcircle_area;

/**
 *
 * @author ilaydacitak
 */
public class Circle {
    public double radius ;
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(){
        this.radius = 2.0 ;
    }
    public double getCircleArea(){
        return Math.PI*radius;
    }
}
