package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
public class GamingCars {

    private final List<Car> allCars;

    public GamingCars(List<String> nameOfCars){
        allCars = new ArrayList<>();
        makeCarLists(nameOfCars);
    }

    public void makeCarLists(List<String> nameOfCars){
        for(String car : nameOfCars){
            allCars.add(new Car(car));
        }
    }

    public List<Car> getAllCars(){
        return allCars;
    }
}
