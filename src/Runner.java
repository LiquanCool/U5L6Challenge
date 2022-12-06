import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        Bank BagelBank = new Bank();
        CreditCard card1 = new CreditCard(name,"1234");
        BagelShop shop1 = new BagelShop("shop1", 1000, 2, BagelBank);
        BankApp app = new BankApp();
        System.out.println(BankApp.menu());
        String choice = scan.nextLine();
        System.out.println("Which card do you want to use?");
        int card = scan.nextInt();
        while (!choice.equals("q"))
        {
            if (card == 1) {
                if (choice.equals("b")) {


                }
                System.out.println(BankApp.menu());
                choice = scan.nextLine();
                System.out.println("Which card do you want to use?");
                card = scan.nextInt();
            }
            else
            {

            }
        }

        // call methods from your BankApp object to handle program logic
    }
}