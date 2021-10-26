package distancematrix;
import java.util.LinkedList;
public class TestDistanceMatrix{
    public static void main(String[] args){
        // First we give values to the different created GeometricPoints that we will take as cities
        GeometricPoint narnia = new GeometricPoint(2.5,1.5, "Narnia");
        GeometricPoint mordor = new GeometricPoint(3.5,2.3, "Mordor");
        GeometricPoint gotham = new GeometricPoint(8,5, "Gotham");
        GeometricPoint springfield = new GeometricPoint(10,9.2, "Springfield");

        // Then we create the matrix
        DistanceMatrix matrix = new DistanceMatrix();

        // In the matrix we add our cities(elements of matrix) Testing addCity()
        matrix.addCity(2.5,1.5, "Narnia");
        matrix.addCity(3.5,2.3, "Mordor");
        matrix.addCity(8,5,"Gotham");
        matrix.addCity(10,9.2, "Springfield");

        // Create a matrix with the stored distances (more detail in the report)
        matrix.createDistanceMatrix();
        // We show it. Testing getMatrix()
        System.out.println("The matrix we created results as the following: ");
        System.out.println(matrix.getMatrix());

        // We test getNoOfCities() and tell the user the number of elements cities in the matrix
        System.out.println("In the matrix we created there are " + matrix.getNoOfCities() + " cities.");

        // We test getCityName() and getDistance() 
        System.out.println("The distance between " + matrix.getCityName(2) + " and " + matrix.getCityName(3) + " is of: " + matrix.getDistance(2, 3) + " km");


    }
}

