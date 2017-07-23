package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


/*

                int x = 0;
                double f = x - Math.sin(x);

                while (x < 50) {
                    x++;
                    System.out.println("Значение аргутмента = " + x + "Значение функции = " +f  );
                }}}

/*
//задание 1б

                            int x = 0;
                            double f = Math.sin(x)* Math.sin(x);

                            while (x < 50) {
                                x++;
                                System.out.println("Значение аргутмента = " + x + "Значение функции = " +f  );
                            }

*/
                          /*
//задание 1в
                                    int x = 0;
                                    double f = 2 * Math.cos(x) - 1;

                                    while (x < 50) {
                                        x++;
                                        System.out.println("Значение аргутмента = " + x + "Значение функции = " + f);
                                    }
                                }
*/
                          /*

//задание 2

                                            int a = 3;
                                            int b = -5;
                                            int x= 0;
                                            double y = a*x*x+b;

                                            while (x < 6) {
                                                x+=0.5;
                                                System.out.println("x= " + x + "y = " +y  );
                                            }


                                       }
                                       /*
        /*
        System.out.println("ex.10");


        int count=0; ;

        for (int i = 1; count <= 10; i++3) {
            count++;
            int sum=+i;
            System.out.println("cумма первых 10=  "+sum);
            }
        }

        */
        /*
                System.out.println("ex.8");
           int count = 0;


        for (int i = 0; count <= 20; i++) {
            if (i % 13 == 0) {

            }
                System.out.println(i);

                else
                    if(i % 17 == 0){
                        System.out.println(i);
                        ++count;
                    }

            }
        }
    }
*/
        /*
        System.out.println("ex.7");
        int count = 0;

        for (int i = 101; count <= 15; i++) {
            if (i % 19 == 0) {
                System.out.println(i);
                ++count;
            }
        }
    }
}
*/
/*
    int number = 0; // только для трехназных чисел
    int a = 0;
    int b = 0;

    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number : ");
                number = scanner.nextInt();

                System.out.print("Enter a : ");
                a = scanner.nextInt();

                System.out.print("Enter b : ");
                b = scanner.nextInt();

                int firstNum = number / 100; // сотые
                int secondNum = (number - 100 * firstNum) / 10; // десятые
                int thirdNum = (number - 100 * firstNum) - 10 * secondNum; // единицы

                int countOfA = 0;
                int countOfB = 0;

                if (firstNum == a) {
                ++countOfA;
                }
                if (secondNum == a) {
                ++countOfA;
                }
                if (thirdNum == a) {
                ++countOfA;
                }

                if (firstNum == b) {
                ++countOfB;
                }
                if (secondNum == b) {
                ++countOfB;
                }
                if (thirdNum == b) {
                ++countOfB;
                }

                if (countOfA < countOfB) {
        System.out.println("Число a встречается реже чем b");
        } else {
        System.out.println("Число b встречается реже чем a, или их одинаковое количество");
        }
        }}
    */
/*
        System.out.println("example 11/1");
        int a = 0;
        int b = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a : ");
        a = scanner.nextInt();

        System.out.print("Enter b : ");
        b = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }}
*/
/*
        int lenghtKatet = 0;
        System.out.println("Vedite dliny kateta");
        Scanner scanner = new Scanner(System.in);

        lenghtKatet = scanner.nextInt();

        for (int i = 0; i < lenghtKatet; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }}
*/
/*
            int MIDDLE = 10;

            int width = 0;
            while (width < MIDDLE) {
                for (int i = 0; i < MIDDLE - width; i++) {
                    System.out.print(" ");  // поставьте здесь вместо пробела i, чтобы проверить, что середина на 20-м символе
                }
                for (int i = 0; i < width * 2 + 1; i++) {
                    System.out.print("#");
                }
                System.out.println();
                width++;
            }
        }}
*/







