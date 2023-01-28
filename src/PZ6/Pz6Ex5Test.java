package PZ6;

import static org.junit.jupiter.api.Assertions.*;

class Pz6Ex5Test {
    @org.junit.jupiter.api.Test
    void test(){
    String actual = Pz6Ex5.withoutString("Hello World!","Hello World!");
    String expected ="";
    assertEquals(expected, actual);

    actual = Pz6Ex5.withoutString("Hello World!","Hello");
    expected =" World!";
    assertEquals(expected, actual);

        actual = Pz6Ex5.withoutString("Hello World!","Hell");
        expected ="o World!";
        assertEquals(expected, actual);

        actual = Pz6Ex5.withoutString("Hello World!","Hello Wo");
        expected ="rld!";
        assertEquals(expected, actual);

        actual = Pz6Ex5.withoutString("Hello World!","or");
        expected ="Hello Wld!";
        assertEquals(expected, actual);
    }
}