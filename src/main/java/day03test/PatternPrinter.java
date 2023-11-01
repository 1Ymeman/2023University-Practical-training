package day03test;

import day03test.Pattern01_菱形;

    public class PatternPrinter {
        public static void main(String[] args) {
            System.out.println("直角三角形：");
            printRightTriangle();
            System.out.println("梯形：");
            printTrapezoid();
            System.out.println("等腰三角形：");
            printIsoscelesTriangle();
            System.out.println("菱形：");
            //调用同pacge下的宁一个class
            Pattern01_菱形.main(null);
        }
//菱形在另一个class

        private static void printIsoscelesTriangle() {
            int height = 3;

            for (int i = 1; i <= height; i++) {
                int spaces = height - i;
                printSpaces(spaces);
                printStars(2 * i - 1);
                System.out.println();
            }
        }

        private static void printTrapezoid() {
            int upperBase = 3;
            int lowerBase = 7;
            int height = 3;

            for (int i = 1; i <= height; i++) {
                int spaces = (lowerBase - upperBase - 2 * (i - 1)) / 2;
                printSpaces(spaces);
                printStars(upperBase + 2 * (i - 1));
                System.out.println();
            }
        }

        private static void printRightTriangle() {
            int height = 6;

            for (int i = 1; i <= height; i++) {
                printStars(i);
                System.out.println();
            }
        }

        private static void printSpaces(int count) {
            for (int i = 0; i < count; i++) {
                System.out.print(" ");
            }
        }

        private static void printStars(int count) {
            for (int i = 0; i < count; i++) {
                System.out.print("*");
            }
        }
    }

