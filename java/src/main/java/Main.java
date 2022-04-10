public class Main {
    public static void main(String[] args) {
        SumOfMultiples sumOfMultiples = new SumOfMultiples();
        Fibonacci fibonacci = new Fibonacci();
        PrimeFactors primeFactors = new PrimeFactors();

        Long value = 600851475143L;

        System.out.println("Resultado do Problema 1: " + sumOfMultiples.sum(1000));
        System.out.println("Resultado do Problema 2: " + fibonacci.fibonacciSum());
        System.out.println("Resultado do Problema 3: " + primeFactors.sumPrimeFactors(value));
    }
}
