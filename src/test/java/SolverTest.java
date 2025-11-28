import org.example.RucksackSolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class SolverTest {
   @Test
   public void sumujePrzykladAoC() {
       List<String> dane = List.of(
               "vJrwpWtwJgWrhcsFMMfFFhFp",
               "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
               "PmmdzqPrVvPwwTWBwg",
               "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
               "ttgJtRGJQctTZtZT",
               "CrZsJsPPZsGzwwsLwLmpwMDw"
       );
     
       RucksackSolver solver = new RucksackSolver();
       int suma = solver.sumPriority(dane);
       Assertions.assertEquals(157, suma);
   }
}
