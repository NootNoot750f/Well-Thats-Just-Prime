package org.example;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FactorizerTest {
  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(0), new ArrayList());
    System.out.println("Test passed: itReturnsAnEmptyListForZero");
  }
  @Test 
void itReturnsCorrectPrimeFactorsForTwo(){
  Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(2), new ArrayList<>(Arrays.asList(2)));
    System.out.println("Test passed: itReturnsCorrectPrimeFactorsForTwo");

}
@Test
  void itReturnsCorrectPrimeFactorsForFifty() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(50), new ArrayList<>(Arrays.asList(2, 5, 5)));
    System.out.println("Test passed: itReturnsCorrectPrimeFactorsForFifty");

  }  
@Test 
void itReturnsCorrectPrimeFactorsForOneHundred(){
  Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(100), new ArrayList<>(Arrays.asList(2, 2, 5, 5)));
    System.out.println("Test passed: itReturnsCorrectPrimeFactorsForHundred");

}


}
