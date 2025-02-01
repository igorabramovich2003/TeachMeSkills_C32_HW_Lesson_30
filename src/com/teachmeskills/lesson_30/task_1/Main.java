package com.teachmeskills.lesson_30.task_1;

import com.teachmeskills.lesson_30.task_1.model.Pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size: small, medium, large: ");
            String size = sc.nextLine();
            System.out.print("Do you want to add chicken to your pizza? true/false: ");
            boolean withChicken = sc.nextBoolean();
            System.out.print("Do you want to add beef to your pizza? true/false: ");
            boolean withBeef = sc.nextBoolean();
            System.out.print("Do you want to add mushrooms to your pizza? true/false: ");
            boolean withMushrooms = sc.nextBoolean();
            System.out.print("Do you want to add cheese sauce to your pizza? true/false: ");
            boolean withCheeseSauce = sc.nextBoolean();
            System.out.print("Do you want to add ketchup to your pizza? true/false: ");
            boolean withKetchup = sc.nextBoolean();

            Pizza yourPizza = new Pizza.PizzaBuilder()
                    .setSize(size)
                    .setWithChicken(withChicken)
                    .setWithBeef(withBeef)
                    .setWithMushrooms(withMushrooms)
                    .setWithCheeseSauce(withCheeseSauce)
                    .buildPizza();

            System.out.println(yourPizza.toString());
        }
    }
}
