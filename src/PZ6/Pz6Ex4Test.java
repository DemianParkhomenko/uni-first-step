package PZ6;

import org.junit.jupiter.api.Test;

import static PZ6.Pz6Ex4.endOther;
import static org.junit.jupiter.api.Assertions.*;

class Pz6Ex4Test {

    @Test
    void test() {
        boolean actual;

        actual= endOther("sada","ada");
        assertEquals(true,actual);

        actual= endOther("sada","AdA");
        assertEquals(true,actual);

        actual= endOther("My firt test","TESt");
        assertEquals(true,actual);

        actual= endOther("Demian","DEmain22");
        assertEquals(false,actual);

        actual= endOther("Demian","DeMIan");
        assertEquals(true,actual);


    }
}