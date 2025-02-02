package org.example;

public class App {
  public static void main(String[] args) {
    System.out.println("");
    Factorizer factorizer = new Factorizer();
    System.out.println("This is prime factors in 100: " + factorizer.primeFactors(0));
    System.out.println("This is prime factors in 100: " + factorizer.primeFactors(2));
    System.out.println("This is prime factors in 50: " + factorizer.primeFactors(50));
    System.out.println("This is prime factors in 100: " + factorizer.primeFactors(100));
    

  }
}
