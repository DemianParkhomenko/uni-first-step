package PZ6;
import static org.junit.jupiter.api.Assertions.*;

class Pz6Ex2Test {

    @org.junit.jupiter.api.Test
    void sumDigits() {
        int actual = Pz6Ex2.sumDigits("11hjhj2");
        int expected = 4;
        assertEquals(expected, actual);
    }

}
