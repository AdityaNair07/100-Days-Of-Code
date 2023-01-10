import java.io.*;
import java.util.*;

class NestedLogic {

    public static int fine(int[] returnData, int[] dueData) {
        int fine = 0;
        if (returnData[2] > dueData[2]) {
            fine = 10000;
            return fine;
        } else if (returnData[2] == dueData[2] && returnData[1] > dueData[1]) {
            fine = (returnData[1] - dueData[1]) * 500;
            return fine;
        } else if (returnData[2] == dueData[2] && returnData[1] == dueData[1] && returnData[0] > dueData[0]) {
            fine = (returnData[0] - dueData[0]) * 15;
            return fine;
        } else
            return fine;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int returnData[] = new int[3];
        for (int i = 0; i < returnData.length; i++) {
            returnData[i] = sc.nextInt();
        }

        int dueData[] = new int[3];
        for (int i = 0; i < dueData.length; i++) {
            dueData[i] = sc.nextInt();
        }
        int fine = fine(returnData, dueData);
        System.out.println(fine);
    }
}
