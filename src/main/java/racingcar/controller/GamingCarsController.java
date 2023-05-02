package racingcar.controller;

import java.util.List;
import racingcar.domain.GamingCars;
import racingcar.service.GamingCarService;
import racingcar.view.OutputView;

public class GamingCarsController {

    public void run() {
        List<String> carNames = InputController.inputCarNames();
        int times = InputController.inputGameTimes();
        GamingCarService gamingCarService = new GamingCarService(carNames);
        playGame(times, gamingCarService);
        OutputView.printCarWinners(gamingCarService.findLargestPositionOfCarNames());
    }

    public void playGame(int times, GamingCarService gamingCarService) {
        for (int i = 0; i < times; i++) {
            gamingCarService.playOneTime();
            OutputView.printCarState(gamingCarService.getGamingCars());
        }
    }
}
