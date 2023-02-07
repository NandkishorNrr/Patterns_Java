public class Main {
    public static void main(String[] args) {
//        pattern1(10, 10);
//        pattern2(5, 5);
//        pattern3(4, 9);
//        pattern4(10,10);
//        pattern5(7,7);
//        pattern6();
//        pattern7();
//        pattern8();
//        patter9();
//        pattern10();
//        pattern11();
//        pattern12();
//        pattern13();
//        pattern14();
//        pattern15();
//        pattern16();
//        pattern17();
//        pattern18();
//        pattern19();
//        pattern20(5);
        pattern21(5);
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
//    6) Program To Print Following Pattern
           /*
            1	2	3	4	5
            16				6
            15				7
            14				8
            13	12	11	10	9
            */

    public static void pattern6(){
        int[][] mat = new int[5][5];
        int topRow = 0;
        int bottomRow = mat.length - 1;
        int leftColumn = 0;
        int rightColumn = mat[0].length - 1;
        int count = 1;

        for (int i = leftColumn; i < rightColumn ; i++) {
            mat[topRow][i] = count++;
        }
        for (int i = topRow; i < bottomRow; i++) {
            mat[i][rightColumn] = count++;
        }
        for (int i = rightColumn; i > leftColumn ; i--) {
            mat[bottomRow][i] = count++;
        }
        for (int i = bottomRow; i > topRow; i--) {
            mat[i][leftColumn] = count++;
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0)
                    System.out.print("\t");
                else
                    System.out.print(mat[i][j]+ "\t");
            }
            System.out.println();
        }
    }
//    7) Program To Print Following Pattern
    /*
            12344321
            123**321
            12****21
            1******1
    */
    public static void pattern7(){
        int count = 1;
        for (int i = 1; i <=4 ; i++) {
            count = 1;
            for (int j = 1; j <= 8; j++) {
                if (5 - i < j && j < 4 + i)
                    System.out.print("*");
                else{
                    if (j <= 4)
                        System.out.print(count++);
                    else
                        System.out.print(--count);
                }

            }
            System.out.println();
        }
    }
//    8) Program To Print Following Pattern
    /*
            1	2	3	4	5	6	7	8	9	10
            36	37	38	39	40	41	42	43	44	11
            35	64	65	66	67	68	69	70	45	12
            34	63	84	85	86	87	88	71	46	13
            33	62	83	96	97	98	89	72	47	14
            32	61	82	95	100	99	90	73	48	15
            31	60	81	94	93	92	91	74	49	16
            30	59	80	79	78	77	76	75	50	17
            29	58	57	56	55	54	53	52	51	18
            28	27	26	25	24	23	22	21	20	19
    */
    public static void pattern8(){
        int[][] mat = new int[10][10];
        int topRow = 0;
        int bottomRow = mat.length - 1;
        int leftColumn = 0;
        int rightColumn = mat[0].length - 1;
        int count = 1;

        while (leftColumn < rightColumn){
            for (int i = leftColumn; i < rightColumn; i++) {
                mat[topRow][i] = count++;
            }
            for (int i = topRow; i < bottomRow; i++) {
                mat[i][rightColumn] = count++;
            }
            for (int i = rightColumn--; i > leftColumn ; i--) {
                mat[bottomRow][i] = count++;
            }
            for (int i = bottomRow--; i > topRow; i--) {
                mat[i][leftColumn] = count++;
            }
            topRow++;
            leftColumn++;
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]+ "\t");
            }
            System.out.println();
        }
    }
//    9) Program To Print Following Pattern
    public static void patter9(){
        int n;
        for (int i = 1; i <= 10; i++) {
            n = 11 - i;
            for (int j = 1; j <= i*2 -1 ; j++) {
                if (j < i ){

                    System.out.print(n++);
                }
                else {
                    if (n == 10){
                        System.out.print(0);
                        n--;
                        continue;
                    }
                    System.out.print(n--);
                }
            }
            System.out.println();
        }
    }
//    10) Program to Print Following Pattern


    public static void pattern10(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j <= i)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//  11) Program to Print Following Pattern
    /*
    A
    B B
    C C C
    D D D D
    E E E E E
    */
    public static void pattern11(){
        char ch = 64;
        for (int i = 1; i <= 5; i++) {
            ch++;
            for (int j = 1; j <= 5; j++) {
                if (j <= i)
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void pattern12(){
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i == 1 || i == 10 || j == 1 || j == 10)
                    System.out.print(1 + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
//    13) Program to Print Following Pattern
    /*
            1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1
    */

    public static void pattern13(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
//    14) Program to Print Following Pattern
    /*
            *********
            *******
            *****
            ***
            *
    */
    public static void pattern14(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10 - (i*2 - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    15) Program to Print Following Pattern
//    >>> ?
    public static void pattern15(){
        int n = 0;
        for (int i = 1; i <= 6 ; i++) {
            n = 1;
            for (int j = 1; j <= 11 ; j++) {
                if ((6 - i < j && j < 6 + i))
                    System.out.print(n + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

//    16) Program to Print Following Pattern
    /*
            * * * * *
            * * * *
            * * *
            * *
            *
*/
    public static void pattern16(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= 6 - i)
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    17) Program to Print Following Pattern
    /*
            1
            2 3
            4 5 6
            7 8 9 10
    */
    public static void pattern17(){
        int count = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j <= i)
                System.out.print(count++);
            }
            System.out.println();
        }
    }
//    18) Program to Print Following Pattern
    /*
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
    */
    public static void pattern18(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= i)
                    System.out.print(j);
            }
            System.out.println();
        }
    }
//    19) Program to Print Following Pattern
    /*
                            *
                          * * *
                        * * * * *
                      * * * * * * *
                    * * * * * * * * *
*/
    public static void pattern19(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                if (5 - i < j && j < i + 5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();

        }
    }
    //    20) Program to Print Following Pattern
    /*
            1 1 1 1 1 1 1 1 1 1
            1                 1
            1                 1
            1                 1
            1                 1
            1                 1
            1                 1
            1                 1
            1                 1
            1 1 1 1 1 1 1 1 1 1
    */
    public static void pattern20(int n){
        for (int i = 0; i < n*2 - 1; i++) {
            for (int j = 0; j < n*2 - 1; j++) {
                if ((i == 0 || i == n*2 - 2) || (j == 0 || j == n*2 - 2))
                    System.out.print(1 + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void pattern21(int n){
        int p = n;
        for (int i = 0; i < n*2 - 1; i++) {
            for (int j = 0; j < n*2 - 1; j++) {
                if ((i == 0 || i == n*2 - 2) || (j == 0 || j == n*2 - 2))
                    System.out.print(p + " ");
                else if ((i == 1 || i == n*2 - 3) || (j == 1 || j == n*2 - 3))
                    System.out.print(p - 1 + " ");
                else if ((i == 2 || i == n*2 - 4) || (j == 2 || j == n*2 - 4))
                    System.out.print(p - 2 + " ");
                else if ((i == 3 || i == n*2 - 5) || (j == 3 || j == n*2 - 5))
                    System.out.print(p - 3 + " ");
                else if ((i == 4 || i == n*2 - 6) || (j == 4 || j == n*2 - 6))
                    System.out.print(p - 4 + " ");
            }
            System.out.println();
        }
    }
}


