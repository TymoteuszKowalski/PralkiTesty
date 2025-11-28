package org.example;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
   public static void main(String[] args) throws Exception {
       List<String> linie = Files.readAllLines(Path.of("input.txt"));
       RucksackSolver solver = new RucksackSolver();
       int wynik = solver.sumPriority(linie);
       System.out.println("Suma priorytetów = " + wynik);
   }
}
