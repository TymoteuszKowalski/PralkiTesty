import org.example.Plecak;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlecakTest {
   @Test
   public void zwrociZawartoscKomory1() {
       Plecak p = new Plecak("vJrwpWtwJgWrhcsFMMfFFhFp");
       Assertions.assertEquals("vJrwpWtwJgWr", p.zawartoscKomory1());
   }
    
   @Test
   public void zwrociZawartoscKomory2() {
       Plecak p = new Plecak("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL");
       Assertions.assertEquals("rsFMfFZSrLrFZsSL", p.zawartoscKomory2());
   }
    
   @Test
   public void zwrociZleSpakowanyElement() {
       Plecak p = new Plecak("vJrwpWtwJgWrhcsFMMfFFhFp");
       Assertions.assertEquals('p', p.zleSpakowanyElement1());
   }
    
   @Test
   public void priorytetZnaku() {
       Plecak p = new Plecak("x");
       Assertions.assertEquals(3, p.priorytetElementu('c'));
       Assertions.assertEquals(27, p.priorytetElementu('A'));
   }
}
