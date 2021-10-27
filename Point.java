public class Point{
    private double x;
    private double y;
    
    public Point(double initx, double inity, String name){
        x = initx;
        y = inity;
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
    public double distance(Point p1){
        double xCalc = Math.pow(x - p1.x, 2);
        double yCalc = Math.pow(y - p1.y, 2);
        double distance = Math.sqrt(xCalc+yCalc);
        return distance;
    }
    public void print(){
        System.out.println( "The coordinates are: x = " + this.x + ", y = " + this.y);
    }
}