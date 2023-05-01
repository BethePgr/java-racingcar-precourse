package racingcar.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GamingCarsTest {

    @Test
    @DisplayName("")
    void testGamingCars() throws Exception{
        //given
        List<String> cars = Arrays.asList("one","two","three");
        //when
        GamingCars gamingCars = new GamingCars(cars);
        //then
        assertEquals(3,gamingCars.getAllCars().size());

    }

}