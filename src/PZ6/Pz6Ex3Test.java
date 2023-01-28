package PZ6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pz6Ex3Test {

    @Test
    void catDog() {
        boolean actual = Pz6Ex3.catDog("catdog");
        boolean expected = true;
        assertEquals(expected, actual);

        actual = Pz6Ex3.catDog("catog");
        expected = false;
        assertEquals(expected, actual);

        actual = Pz6Ex3.catDog("catdog222catdog");
        expected = true;
        assertEquals(expected, actual);


        actual = Pz6Ex3.catDog("cat342dd324catog");
        expected = false;
        assertEquals(expected, actual);

        actual = Pz6Ex3.catDog("cat223dddcog");
        expected = false;
        assertEquals(expected, actual);

    }
}