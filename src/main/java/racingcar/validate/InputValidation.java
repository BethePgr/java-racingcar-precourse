package racingcar.validate;

import java.util.Arrays;

public class InputValidation {

    public static void checkInputCarNames(String carNames){
        if(Arrays.stream(carNames.split(",")).anyMatch(num -> num.length()<1 || num.length()>5)){
            throw new IllegalArgumentException("[ERROR] 모든 자동차 이름은 1글자와 5글자 사이여야 합니다.");
        }
    }

    public static void checkInputGamesTimes(String input){
        String reg = "^[0-9]+$";
        if(!input.matches(reg)){
            throw new IllegalArgumentException("[ERROR] 자동차 게임 시도 횟수는 숫자여야 합니다.");
        }
    }
}
