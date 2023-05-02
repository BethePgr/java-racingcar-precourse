package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.domain.Car;
import racingcar.domain.GamingCars;

public class GamingCarService {

    private final GamingCars gamingCars;

    public GamingCarService(List<String> carNames) {
        gamingCars = new GamingCars(carNames);
    }

    public void playOneTime() {
        for (Car car : gamingCars.getAllCars()) {
            boolean flag = isRandomNumberOver4();
            car.moveOnetime(flag);
        }
    }

    private List<Car> findLargestPositionOfCarList() {
        int position = gamingCars.getAllCars().stream()
            .max(Comparator.comparingInt(Car::getPosition))
            .orElseThrow(() -> new IllegalArgumentException("[ERROR] 1등인 차가 없습니다.")).getPosition();

        return gamingCars.getAllCars().stream().filter(car -> car.getPosition() == position)
            .collect(
                Collectors.toList());
    }

    public String findLargestPositionOfCarNames() {
        List<Car> carList = findLargestPositionOfCarList();
        StringBuilder stringBuilder = new StringBuilder();
        for (Car car : carList) {
            stringBuilder.append(car.getName()).append(",");
        }
        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
    }


    private boolean isRandomNumberOver4() {
        int number = Randoms.pickNumberInRange(0, 9);
        return number >= 4;
    }

    public GamingCars getGamingCars() {
        return gamingCars;
    }

}
