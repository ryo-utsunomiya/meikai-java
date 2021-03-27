package meikai.java.chap01;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    var stdin = new Scanner(System.in);
    System.out.println("enter 3 numbers:");
    var a = stdin.nextInt();
    var b = stdin.nextInt();
    var c = stdin.nextInt();
    System.out.println("min:" + Solver.min3(a, b, c));
    System.out.println("med:" + Solver.med3(a, b, c));
    System.out.println("max:" + Solver.max3(a, b, c));
  }
}
