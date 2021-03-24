package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int cups = 9;
    static int money = 550;
    static Scanner scanner = new Scanner(System.in);
    static boolean loop = true;

    public static void main(String[] args) {
        while (loop) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String action = scanner.nextLine();

            switch (action) {
                case "buy":
                    action();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    money();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    loop = false;
                    break;
            }
            }
        }




    static void remaining () {
        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of coffee beans\n" +
                cups + " of disposable cups\n" + "$" +
                money + " of money");
        System.out.println();
    }

    static void action () {
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        Scanner scanner1 = new Scanner(System.in);
        String input1 = scanner1.nextLine();
        int input;
        try {
            input = Integer.parseInt(input1);
        } catch (NumberFormatException e) {
            input = 0;
        }
        if (input == 1) {
            if (water < 250) {
                System.out.println("Sorry, not enough water!");
            } else if (beans < 16) {
                System.out.println("Sorry, not enough beans!");
            } else if (cups < 1) {
                System.out.println("Sorry, not enough cups!");
            }
            if (water >= 250 && beans >= 16 && cups >= 1) {
                water -= 250;
                beans -= 16;
                cups -= 1;
                money += 4;
                System.out.println("I have enough resources, making you a coffee!");
            }
        }
        if (input == 2) {
            if (water < 350) {
                System.out.println("Sorry, not enough water!");
            } else if (milk < 75) {
                System.out.println("Sorry, not enough milk!");
            } else if (beans < 20) {
                System.out.println("Sorry, not enough beans!");
            } else if (cups < 1) {
                System.out.println("Sorry, not enough cups!");
            }
            if (water >= 350 && beans >= 20 && cups >= 1 && milk >= 75) {
                water -= 350;
                milk -= 75;
                beans -= 20;
                cups -= 1;
                money += 7;
                System.out.println("I have enough resources, making you a coffee!");
            }
        }
        if (input == 3) {
            if (water < 200) {
                System.out.println("Sorry, not enough water!");
            } else if (milk < 100) {
                System.out.println("Sorry, not enough milk!");
            } else if (beans < 12) {
                System.out.println("Sorry, not enough beans!");
            } else if (cups < 1) {
                System.out.println("Sorry, not enough cups!");
            }
            if (water >= 200 && beans >= 12 && cups >= 1 && milk >= 100) {
                water -= 200;
                milk -= 100;
                beans -= 12;
                cups -= 1;
                money += 6;
                System.out.println("I have enough resources, making you a coffee!");
            }
        }
        if (input1.equals("back")) {
            exit();
        }
    }

    public static void exit() {
        return;
    }

    static void fill () {
        System.out.println("Write how many ml of water do you want to add: ");
        int waterAdd = scanner.nextInt();
        water = water + waterAdd;
        System.out.println("Write how many ml of milk do you want to add: ");
        int milkAdd = scanner.nextInt();
        milk = milkAdd + milk;
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        int beansAdd = scanner.nextInt();
        beans = beansAdd + beans;
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int cupsAdd = scanner.nextInt();
        cups = cupsAdd + cups;
    }


    static void money () {
        System.out.println("I gave you $" + money);
        System.out.println();
        money = 0;
    }
}
