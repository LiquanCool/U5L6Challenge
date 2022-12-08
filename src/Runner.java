import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String PIN;
        int num;
        System.out.println("What is your name?");
        String name = scan.nextLine();
        Bank BagelBank = new Bank();
        System.out.println("What do you want your PIN to be?");
        PIN = scan.nextLine();
        CreditCard card1 = new CreditCard(name,PIN);
        CreditCard card2 = new CreditCard(name,PIN);
        BagelShop shop1 = new BagelShop("shop1", 1000, 2, BagelBank);
        BankApp app = new BankApp();
        System.out.println(BankApp.menu());
        String choice = scan.nextLine();
        System.out.println("Which card do you want to use?");
        int card = scan.nextInt();
        while (!choice.equals("q"))
        {
            if (card == 1) {
                if (choice.equals("b"))
                {
                    System.out.println("How many would you like to buy?");
                    num = scan.nextInt();
                    scan.nextLine();
                    System.out.println("What is your PIN?");
                    PIN = scan.nextLine();
                    System.out.println(app.purchase(num, card1, PIN, shop1));
                }
                else if (choice.equals("r"))
                {
                    System.out.println("How many would you like to return?");
                    num = scan.nextInt();
                    scan.nextLine();
                    System.out.println("What is your PIN?");
                    PIN = scan.nextLine();
                    System.out.println(app.returnBagels(num, card1, PIN, shop1));
                }
                else if (choice.equals("p"))
                {
                    System.out.println("How much would you like to pay?");
                    num = scan.nextInt();
                    scan.nextLine();
                    System.out.println("What is your PIN?");
                    PIN = scan.nextLine();
                    System.out.println(app.payment(num, card1, PIN, BagelBank));
                }
                else if (choice.equals("o"))
                {
                    System.out.println("What is your name?");
                    name = scan.nextLine();
                    scan.nextLine();
                    System.out.println("What do you want your new PIN to be?");
                    PIN = scan.nextLine();
                    System.out.println(app.OpenCredit(name, PIN, card2));
                }
                else if (choice.equals("c"))
                {
                    System.out.println(app.compareCredit(card1, card2, BagelBank));
                }
                else if (choice.equals("d"))
                {
                    System.out.println(app.deposit(shop1));
                }
                else if (choice.equals("i"))
                {
                    System.out.println(app.checkInventory(shop1));
                }
                System.out.println(BankApp.menu());
                choice = scan.nextLine();
                System.out.println("Which card do you want to use?");
                card = scan.nextInt();
            }
            else
            {
                if (choice.equals("b"))
                {
                    System.out.println("How many would you like to buy?");
                    num = scan.nextInt();
                    scan.nextLine();
                    System.out.println("What is your PIN?");
                    PIN = scan.nextLine();
                    System.out.println(app.purchase(num, card2, PIN, shop1));
                }
                else if (choice.equals("r"))
                {
                    System.out.println("How many would you like to return?");
                    num = scan.nextInt();
                    scan.nextLine();
                    System.out.println("What is your PIN?");
                    PIN = scan.nextLine();
                    System.out.println(app.returnBagels(num, card2, PIN, shop1));
                }
                else if (choice.equals("p"))
                {
                    System.out.println("How much would you like to pay?");
                    num = scan.nextInt();
                    scan.nextLine();
                    System.out.println("What is your PIN?");
                    PIN = scan.nextLine();
                    System.out.println(app.payment(num, card2, PIN, BagelBank));
                }
                else if (choice.equals("o"))
                {
                    System.out.println("What is your name?");
                    name = scan.nextLine();
                    System.out.println("What do you want your new PIN to be?");
                    PIN = scan.nextLine();
                    System.out.println(app.OpenCredit(name, PIN, card2));
                }
                else if (choice.equals("c"))
                {
                    System.out.println(app.compareCredit(card1, card2, BagelBank));
                }
                else if (choice.equals("d"))
                {
                    System.out.println(app.deposit(shop1));
                }
                else if (choice.equals("i"))
                {
                    System.out.println(app.checkInventory(shop1));
                }
                System.out.println(BankApp.menu());
                choice = scan.nextLine();
                scan.nextLine();
                System.out.println("Which card do you want to use?");
                card = scan.nextInt();
            }
        }

        // call methods from your BankApp object to handle program logic
    }
}