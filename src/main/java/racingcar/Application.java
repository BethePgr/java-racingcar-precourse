package racingcar;

import racingcar.controller.GamingCarsController;

public class Application {

    public static void main(String[] args) {
        GamingCarsController gamingCarsController = new GamingCarsController();
        gamingCarsController.run();
    }
}
