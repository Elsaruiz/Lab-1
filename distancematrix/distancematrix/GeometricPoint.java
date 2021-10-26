package distancematrix;
public class GeometricPoint{
    private double x;
    private double y;
    private String name;
    
    public GeometricPoint(double initx, double inity, String name){
        x = initx;
        y = inity;
        this.name = name;
    }
    public String  getName(){
        return this.name;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public double distance(GeometricPoint p1){
        double xCalc = Math.pow(x - p1.x, 2);
        double yCalc = Math.pow(y - p1.y, 2);
        double distance = Math.sqrt(xCalc+yCalc);
        return distance;
    }
    public void print(){
        System.out.println( "The coordinates of " + name + " are: x = " + this.x + ", y = " + this.y);
    }
}