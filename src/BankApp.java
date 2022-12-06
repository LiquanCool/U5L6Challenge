
public class BankApp {
    public BankApp()
    {

    }

    public static String menu()
    {
        return "Enter b to purchase at the bagel shop\n" +
                "Enter r to return at the bagel shop\n" +
                    "Enter p to make a payment on the credit card\n" +
                    "Enter o to open a second credit card\n" +
                    "Enter c to compare credit card balances\n" +
                    "Enter d to deposit profits into the bank\n" +
                    "Enter c to check inventory\n" +
                    "Enter q to quit the program";
    }
    public String purchase(int num, CreditCard card, String PIN, BagelShop shop)
    {
        shop.payForBagels(card,num,PIN);
        return "Paid for " + num + " bagels";
    }

    public String returnBagels(int num, CreditCard card, String PIN, BagelShop shop)
    {
        shop.returnBagels(card,num,PIN);
        return "Returned " + num + " bagels";
    }

    public String payment(int num, CreditCard card, String PIN, Bank bank)
    {
        bank.makePayment(card, num);
        return "Made payment of " + num;
    }

    public String OpenCredit(String name, String PIN)
    {
        CreditCard card2 = new CreditCard(name,PIN);
        return "Made card2";
    }

    public String compareCredit()
}
