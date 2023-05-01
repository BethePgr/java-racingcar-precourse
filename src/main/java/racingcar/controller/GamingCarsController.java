package racingcar.controller;

import java.util.List;
import racingcar.domain.GamingCars;
import racingcar.service.GamingCarService;
import racingcar.view.OutputView;

public class GamingCarsController {

    public void run(){
        List<String> carNames = InputController.inputCarNames();
        int times = InputController.inputGameTimes();
        GamingCars gamingCars = new GamingCars(carNames);
        GamingCarService gamingCarService = new GamingCarService(gamingCars);
        playGame(times,gamingCarService);

    }

    public void playGame(int times,GamingCarService gamingCarService){
        for(int i = 0;i<times;i++) {
            gamingCarService.playOneTime();
            OutputView.printCarState(gamingCarService.getGamingCars());
        }
    }
}
