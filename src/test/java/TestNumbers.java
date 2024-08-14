import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestNumbers {
    Numbers numbers = new Numbers();
    @Test
    @DisplayName("Тест сложения")
    public void plusTest(){
        assertEquals(10,numbers.plus(3,7));
    }
    @Test
    @DisplayName("Тест вычитания")
    public void minusTest(){
        assertEquals(3,numbers.minus(7,4));
    }
    @Nested
    @DisplayName("Тест умножения")
    class multiply{
        @Test
        public void multiplyTestFirst(){
            assertEquals(12,numbers.multiply(3,4));
        }
        @Test
        public void multiplyTestSecond(){
            assertThrows(ArithmeticException.class, ()->numbers.multiply(3,0));
        }
    }
    @Nested
    @DisplayName("Тест деления")
    class divide{
        @Test
        public void divideTestFirst(){
            assertEquals(3,numbers.divide(12,4));
        }
        @Test
        public void divideTestSecond(){
            assertThrows(ArithmeticException.class,()->numbers.divide(12,0));
        }
    }
    @Test
    @DisplayName("Тест возведения в степень")
    public void powerTest(){
        assertEquals(32,numbers.power(2,5));
    }
}
