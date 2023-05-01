package racingcar.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.service.GamingCarService;

class GamingCarsTest {

    @Test
    @DisplayName("이름 세 개를 작성했으니 gamingCars의 사이즈도 3개여야 한다.")
    void testGamingCars() throws Exception{
        //given
        List<String> cars = Arrays.asList("one","two","three");
        //when
        GamingCars gamingCars = new GamingCars(cars);
        //then
        assertEquals(3,gamingCars.getAllCars().size());
    }

    @Test
    @DisplayName("두 번 이동했으니 position의 값은 0과2사이여야 한다.")
    void testGamingCarsMoving() throws Exception{
        //given
        List<String> cars = Arrays.asList("one");
        //when
        GamingCars gamingCars = new GamingCars(cars);
        GamingCarService gamingCarService = new GamingCarService(gamingCars);
        //then
        gamingCarService.playOneTime();
        gamingCarService.playOneTime();
        int position = gamingCars.getAllCars().get(0).getPosition();
        assertTrue(position >= 0 && position <= 2);

    }

}