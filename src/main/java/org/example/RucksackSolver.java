public class RucksackSolver {
   public int sumPriority(List<String> plecaki) {
       int suma = 0;
       for (String p : plecaki) {
           Plecak plecak = new Plecak(p);
           char z = plecak.zleSpakowanyElement1();
           suma += plecak.priorytetElementu(z);
       }
       return suma;
   }
}
