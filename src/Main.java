public class Main {
    public static void main(String[] args) {
//        pattern1(10, 10);
//        pattern2(5, 5);
//        pattern3(4, 9);
//        pattern4(10,10);
        pattern5(7,7);
    }
//    1) Program To Print Following Pattern X(filled left and right)
    /*
            *                 *
            * *             * *
            * * *         * * *
            * * * *     * * * *
            * * * * * * * * * *
            * * * * * * * * * *
            * * * *     * * * *
            * * *         * * *
            * *             * *
            *                 *
    */

    public static void pattern1(int row, int column){
        boolean exp;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i <= 5){
                    exp = (j > i && j < 11 - i);
                    if (!exp)
                        System.out.print('*' + " ");
                    else
                        System.out.print("  ");
                }
                if (i > 5){
                    exp = (j > 11 - i && j < i);
                    if (!exp)
                        System.out.print('*' + " ");
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
//    2) Program To Print Following Pattern
              /*
              5432*
              543*1
              54*21
              5*321
              *4321
              */
    public static void pattern2(int row, int column){
        for (int i = 1; i <= row; i++) {
            for (int j = column; j >= 1; j--) {
                if (i == j)
                    System.out.print("*");
                else
                    System.out.print(j);
            }
            System.out.println();
        }
    }
//    3) Program To Print Following Pattern
            /*
            *000*000*
            0*00*00*0
            00*0*0*00
            000***000
            */
    public static void pattern3(int row, int column){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i == j || j == 10 - i || j == 5)
                    System.out.print('*');
                else
                    System.out.print(0);
            }
            System.out.println();
        }
    }
//    4) Program To Print Following Pattern
           /*
            1
            2 4
            3 6 9
            4 8 12 16
            5 10 15 20 25
            6 12 18 24 30 36
            7 14 21 28 35 42 49
            8 16 24 32 40 48 56 64
            9 18 27 36 45 54 63 72 81
            10 20 30 40 50 60 70 80 90 100
            */
    public static void pattern4(int row, int column){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }

//    5) Program To Print Following Pattern(X)
    /*
          1           1
            2       2
              3   3
                4
              3   3
            2       2
          1           1

*/
    public static void pattern5(int row, int column){
        int count = 1;
        boolean exp;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i < 5){
                    exp = (j == i || j == 8 - i);
                    if (exp)
                        System.out.print(i + " ");
                    else
                        System.out.print("  ");
                }
                else {
                    exp = (j == 8 - i || j == i);
                    if (exp)
                        System.out.print(8 - i + " ");
                    else
                        System.out.print("  ");
                }

            }
            System.out.println();
            if (count > (row / 2))
                count--;
            else
                count++;
        }
    }
}
