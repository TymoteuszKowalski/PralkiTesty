import org.example.Plecak;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlecakTest {
    @Test
    public void zwrociZawartoscKomory1a(){
        //given
        String z = "vJrwpWtwJgWrhcsFMMfFFhFp";
        Plecak plecak = new Plecak(z);

        //when
        String k1 = plecak.zawartoscKomory1();

        //then
        Assertions.assertEquals("vJrwpWtwJgWr", k1);
    }

    @Test
    public void zwrociZawartoscKomory1b(){
        //given
        String z = "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL";
        Plecak plecak = new Plecak(z);

        //when
        String k2 = plecak.zawartoscKomory2();

        //then
        Assertions.assertEquals("jqHRNqRjqzjGDLGL", k2);
    }

    @Test
    public void zwrociZleSpakowanyElement1(){
        //given
        String z = "vJrwpWtwJgWrhcsFMMfFFhFp";
        Plecak plecak = new Plecak(z);

        //when
        char element = plecak.zleSpakowanyElement1();

        //then
        Assertions.assertEquals('p', element);
    }

    @Test
    public void zwrociPriorytetElementu1(){
        //given
        char znak = 'c';
        String z = "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL";
        Plecak plecak = new Plecak(z);

        //when
        int priorytet = plecak.priorytetElementu(znak);

        //then
        Assertions.assertEquals(3,priorytet);
    }
}
