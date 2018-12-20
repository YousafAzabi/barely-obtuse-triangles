import java.io.*;
import java.util.*;

public class BarelyObtuseTriangles_reducedComplexityO2 {

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int Q = scanner.nextInt();
      int N = 0, counter = 0;
      int ind, aSq;
      double root;
      int[] lines = new int[Q];
      ArrayList<Integer> lst = new ArrayList<>();

      for (int i = 0; i < Q; i++) {
          lines[i] = scanner.nextInt();
          if (lines[i] > N) N = lines[i];
      }
      for (int a = 2; a <= (N/3); a+=2) {
          aSq = a * a;
          for (int b = a; b <= (N - a)/2; b+=2) {
              root = (a + b) + Math.sqrt( aSq + (b *  b) + 1);
              if (root > N) break;
              if ( root == (int)root ) {
                  lst.add(counter++, (int)root);
                  //System.out.println(a + "\t" + b + "\t\t" + (int)root);
              }
          }
      }
      Collections.sort(lst);

      for (int i = 0; i < Q; i++) {
          ind = Collections.binarySearch(lst,lines[i]);
          ind++;
          if (ind < 0)
             ind = ind * -1;
          System.out.println(ind);
      }
  }
}
