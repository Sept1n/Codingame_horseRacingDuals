import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<Integer> horsesTable = new ArrayList<>(N);
        int previousPower = 0;
        int minDifference = 100;
        int actualDifference;
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            horsesTable.add(pi);
        }
        Collections.sort(horsesTable);
        for(int i = 0; i < horsesTable.size(); i++) {
            if(i == 0) {
                previousPower = horsesTable.get(0);
            }
            else {
                actualDifference = horsesTable.get(i) - previousPower;
                if(minDifference > actualDifference) {
                    minDifference = actualDifference;
                }
                previousPower = horsesTable.get(i);
            }

        }
        System.out.println(minDifference);
    }
}