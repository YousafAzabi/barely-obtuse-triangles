import java.io.*;
import java.util.*;

public class BarelyObtuseTrangles {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int Q = scanner.nextInt("Enter number of query lines: ");
    int line = 0, aSq, sq, counter = 0;
    int ind;
    int[] lines = new int[Q];
    ArrayList<Integer> lst = new ArrayList<>();

    for (int i = 0; i < Q; i++) {
      lines[i] = scanner.nextInt("Enter number: ");
      if (lines[i] > line) line = lines[i];
    }

    for (int a = 2; a <= line/3; a+=2) {
      aSq = a * a;
      for (int b = a; b <= (line - a)/2; b+=2) {
        sq = aSq + (b*b);
        for (int c = b+1; c <= (line - a - b); c+=2) {
          if ( sq == (c*c - 1) ) {
            lst.add(counter, a + b + c);
            counter ++;
          }
        }
      }
    }

    Collections.sort(lst);

    for (int i = 0; i < Q; i++) {
      ind = Collections.binarySearch(lst,lines[i])++;
      if (ind < 0) ind = ind * -1;
      System.out.println(ind);
    }
  }
}
