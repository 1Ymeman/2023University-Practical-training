package 多态.test01;

import java.util.Scanner;

public class Test {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Build build = new Build("别墅1", 700, "乱葬岗", 900, 12);

        Apartment apartment = new Apartment("贫民窟", 300, "跳桥底", 10, 5);

        System.out.println("1->买楼 2->买别墅\nInput: ");

        int choice = input.nextInt();

        if (1 == choice) {

            System.out.println(apartment.buy());

        } else if (2 == choice) {

            System.out.println(build.buy());

        }

    }


}
