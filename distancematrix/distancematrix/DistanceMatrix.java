package distancematrix;
import java.util.LinkedList;

public class DistanceMatrix implements Matrix{
    // From the given instructions about how to treat lists 
    private LinkedList<GeometricPoint> cities;
    private  LinkedList<LinkedList<Double>> matrix;
        
    // Create the class constructor 
    public DistanceMatrix(){
        this.cities = new LinkedList<GeometricPoint>();
        this.matrix = new LinkedList<LinkedList<Double>>();
    }
    // We implement getters that a
    public String getCityName(int index){
        return cities.get(index).getName();
    }
    public int getNoOfCities(){
        return cities.size();

    }
    public double getDistance(int index1, int index2){
        return cities.get(index1).distance(cities.get(index2));

    }
    public LinkedList<LinkedList<Double>> getMatrix(){
        return this.matrix;
    }
    // Now we will implement the methods 

    public void addCity(double X, double Y, String name) {
        GeometricPoint adding = new GeometricPoint(X, Y, name);
        cities.add(adding);
    }

    public void createDistanceMatrix(){
        LinkedList<LinkedList<Double>> distanceMatrix = new LinkedList<LinkedList<Double>>();
        int citiesNum = getNoOfCities();

        for(int i = 0; i < citiesNum; i++){
            LinkedList<Double> listOfDistance = new LinkedList<Double>();
            for(int j = 0; j < citiesNum;j++){
                listOfDistance.add(getDistance(i,j));

            }
            distanceMatrix.add(listOfDistance);
            
        }
        matrix = distanceMatrix;

        
    }
    

}
