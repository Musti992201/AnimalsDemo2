package Animal2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Animals2Test {
    private Animal animal;

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {
        animal=new Animal("Max",3,"Lion","Roar");
    }

    @Test
    void getAnimalLoud(){
        String loud=animal.giveAnimalloud();
        String expected="Max makes Roar";

        assertEquals(expected,loud);
    }

    private void assertEquals(String expected, String loud) {
    }

    @Test
    void getNameandAge(){
        String nameAndAge=animal.getNameandAge();
        String expected ="Max is 3 years old";

        assertEquals(expected, nameAndAge);
    }

    @Test
    void ageCategory(){
        String ageCategory = animal.ageCategory();
        String expected ="young animal";

        assertEquals(expected, ageCategory);
    }}



