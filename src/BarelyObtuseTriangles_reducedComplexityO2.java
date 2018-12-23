import java.io.*;
import java.util.*;

public class BarelyObtuseTriangles_reducedComplexityO2 {

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); //scanner to read input
      int Q = scanner.nextInt(); //Q number of query read from keyboard
      int N = 0, counter = 0; //N is maximum number in all input lines, counter for trinagle lst
      int ind, aSq; //ind is index and aSq is a*a
      double root; //root of the equation
      int[] lines = new int[Q]; //array of lines value (Numbers) read from input
      ArrayList<Integer> lst = new ArrayList<>(); //initialize ArraList

      for (int i = 0; i < Q; i++) { //loop to read lines one by one and save max value in N
          lines[i] = scanner.nextInt();
          if (lines[i] > N) N = lines[i];
      }
      for (int a = 2; a <= (N/3); a+=2) { //main loop to find Barely Obtuse Traingles of max number
          aSq = a * a; //a squared
          for (int b = a; b <= (N - a)/2; b+=2) { //inner loop
              root = (a + b) + Math.sqrt( aSq + (b *  b) + 1); //equation to find root
              if (root > N) break; //if root bigger than number break loop
              if ( root == (int)root ) { //compare if root is Integer value
                  lst.add(counter++, (int)root); //add root to lst in the position i-th
              }
          }
      }
      Collections.sort(lst); //sort lst in ascending order

      for (int i = 0; i < Q; i++) { //loop through all read lines and find position in lst
          ind = Collections.binarySearch(lst,lines[i]); //binary search for number position in lst
          ind++; //increament ind because first elements in starts at 0 in Java
          if (ind < 0)  //if ind negative then number not found and it is position given with minus sign
             ind = ind * -1; //change sign to positive and retrive previous element in lst
          System.out.println(ind); //ind indicates number of triangles found
      }
  }
}
