package meikai.java.chap01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolverTest {

  @ParameterizedTest
  @CsvSource({
      "3,2,1, 3",
      "3,2,2, 3",
      "3,1,2, 3",
      "3,2,3, 3",
      "2,1,3, 3",
      "3,3,2, 3",
      "3,3,3, 3",
      "2,2,3, 3",
      "2,3,1, 3",
      "2,3,2, 3",
      "1,3,2, 3",
      "2,3,3, 3",
      "1,2,3, 3",
  })
  void max3(int a, int b, int c, int expected) {
    assertEquals(expected, Solver.max3(a, b, c));
  }

  @ParameterizedTest
  @CsvSource({
      "3,2,1, 1",
      "3,2,2, 2",
      "3,1,2, 1",
      "3,2,3, 2",
      "2,1,3, 1",
      "3,3,2, 2",
      "3,3,3, 3",
      "2,2,3, 2",
      "2,3,1, 1",
      "2,3,2, 2",
      "1,3,2, 1",
      "2,3,3, 2",
      "1,2,3, 1",
  })
  void min3(int a, int b, int c, int expected) {
    assertEquals(expected, Solver.min3(a, b, c));
  }

  @ParameterizedTest
  @CsvSource({
      "3,2,1, 2",
      "3,2,2, 2",
      "3,1,2, 2",
      "3,2,3, 3",
      "2,1,3, 2",
      "3,3,2, 3",
      "3,3,3, 3",
      "2,2,3, 2",
      "2,3,1, 2",
      "2,3,2, 2",
      "1,3,2, 2",
      "2,3,3, 3",
      "1,2,3, 2",
  })
  void med3(int a, int b, int c, int expected) {
    assertEquals(expected, Solver.med3(a, b, c));
  }
}
