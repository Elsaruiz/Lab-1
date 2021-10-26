package distancematrix;
public class TestPoint{
    public static void main(String[] args){
        GeometricPoint narnia = new GeometricPoint(2.5,1.5, "Narnia");
        GeometricPoint mordor = new GeometricPoint(3.5,2.3, "Mordor");
        GeometricPoint gotham = new GeometricPoint(8,5, "Gotham");
        GeometricPoint springfield = new GeometricPoint(10,9.2, "Springfield");
        narnia.print();
        mordor.print();
        gotham.print();
        springfield.print();
        System.out.println("As we already said coordinates we have are for "+ narnia.getName() +"("+narnia.getX()+", "+ narnia.getY() +")"+" and for "+ mordor.getName() +" ("+mordor.getX()+", "+ mordor.getY() +")"+". Therefore the distance between" + " and p2 is "+ mordor.distance(narnia)+" km");
        mordor.setX(1);
        mordor.setY(4);
        System.out.println("Now we have changed Mordor values then distance changes:  \n");
        System.out.println("As we already said coordinates we have are for "+ narnia.getName() +" ("+narnia.getX()+", "+ narnia.getY() +") "+" and for "+ mordor.getName() +" ("+mordor.getX()+", "+ mordor.getY() +")"+". Therefore the distance between" + " and p2 is "+ mordor.distance(narnia)+" km");
    }

}

