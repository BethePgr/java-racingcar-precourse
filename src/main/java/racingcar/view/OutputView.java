package racingcar.view;

import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.GamingCars;

public class OutputView {

    public static void printCarState(GamingCars gamingCars) {
        List<Car> allCars = gamingCars.getAllCars();
        for (Car car : allCars) {
            System.out.println(car.getName() + " : " + printCarPosition(car));
        }
        System.out.println();
    }

    private static String printCarPosition(Car car) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < car.getPosition(); i++) {
            str.append("-");
        }
        return str.toString();
    }

    public static void printCarWinners(String winnerCars) {
        System.out.println("최종 우승자 : " + winnerCars);
    }
}
