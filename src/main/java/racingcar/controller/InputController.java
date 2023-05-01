package racingcar.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import racingcar.validate.InputValidation;
import racingcar.view.InputView;

public class InputController {

    public List<String> inputCarNames(){
        try{
            String input = InputView.inputCarNames();
            InputValidation.checkInputCarNames(input);
            return Arrays.stream(input.split(",")).collect(Collectors.toList());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return inputCarNames();
        }
    }

}
