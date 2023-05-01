package racingcar.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.validate.InputValidation;
import racingcar.view.InputView;

public class InputController {

    public static List<String> inputCarNames(){
        try{
            String input = InputView.inputCarNames();
            InputValidation.checkInputCarNames(input);
            return Arrays.stream(input.split(",")).collect(Collectors.toList());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return inputCarNames();
        }
    }

    public static int inputGameTimes(){
        try{
            String input = InputView.inputGameTimes();
            InputValidation.checkInputGamesTimes(input);
            return Integer.parseInt(input);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return inputGameTimes();
        }
    }
}
