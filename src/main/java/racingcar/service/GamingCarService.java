package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.Car;
import racingcar.domain.GamingCars;

public class GamingCarService {

    private final GamingCars gamingCars;

    public GamingCarService(GamingCars gamingCars){
        this.gamingCars = gamingCars;
    }

    public void playOneTime(){
        for(Car car : gamingCars.getAllCars()){
            boolean flag = isRandomNumberOver4();
            car.moveOnetime(flag);
        }
    }

    private boolean isRandomNumberOver4(){
        int number = Randoms.pickNumberInRange(0,9);
        return number>=4;
    }

    public GamingCars getGamingCars(){
        return gamingCars;
    }

}
