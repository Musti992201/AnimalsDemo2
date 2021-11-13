package Animal2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Animals2Test {

    int a;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        a=1;
    }
    @Test
    void myfirsttest(){
        assertTrue(a>0);

    }
}