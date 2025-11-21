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

    public void zwrociZawartoscKomory1b(){
        //given
        String z = "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL";
        Plecak plecak = new Plecak(z);

        //when
        String k1 = plecak.zawartoscKomory1();

        //then
        Assertions.assertEquals("jqHRNqRjqzjGDLGL", k1);
    }
}
