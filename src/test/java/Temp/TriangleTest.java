package Temp;

/**
 * 
 * Rule - L1, L2 & L3
 * 
 * if L1(min)+L2 (min)>L3 - true else false
 * 
 * 
 * Test Data:
 * 
 * [1,5,4] - False () [2.5, 2, 7] - False () [1, 1.5, 1] - True [10,7, 1] -
 * False [1,3,3.5] - True [1,1,1] - True [1, -1, 2] - False [1,0,2]- False
 * 
 * Ip- [3,5,7]
 */

public class TriangleTest {

    public static void main(String[] args) {

        int tri[] = { 1, 1, 2 };
        boolean f = Triangle(tri);
        if (f) {
            System.out.println("Triangle Possible.");
        } else {
            System.out.println("Triangle Not Possible.");
        }
    }

    public static boolean Triangle(int ar[]) {
        boolean flag = false;

        if (ar.length == 3) {
            if (ar[0] <= 0 || ar[1] <= 0 || ar[2] <= 0) {
                flag = false;
            } else {
                if (ar[0] < ar[2] && ar[1] < ar[2] && ar[0] + ar[1] > ar[2]) {
                    flag = true;

                } else if (ar[2] < ar[0] && ar[1] < ar[0] && ar[2] + ar[1] > ar[0]) {
                    flag = true;

                } else if (ar[2] < ar[1] && ar[0] < ar[1] && ar[2] + ar[0] > ar[1]) {
                    flag = true;

                } else {
                    flag = false;
                }

            }

        }

        return flag;

    }
}
