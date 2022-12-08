
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
                    "Enter i to check inventory\n" +
                    "Enter q to quit the program";
    }
    public String purchase(int num, CreditCard card, String PIN, BagelShop shop)
    {
        if (shop.payForBagels(card,num,PIN))
        {
            return "Paid for " + num + " bagels";
        }
        else
        {
            return "Transaction failed";
        }
    }

    public String returnBagels(int num, CreditCard card, String PIN, BagelShop shop)
    {
        if (shop.returnBagels(card,num,PIN))
        {
            return "Returned " + num + " bagels";
        }
        else
        {
            return "Transaction failed";
        }
    }

    public String payment(int num, CreditCard card, String PIN, Bank bank)
    {
        bank.makePayment(card, num);
        return "Made payment of " + num;
    }

    public String OpenCredit(String name, String PIN, CreditCard card2)
    {
        card2.setAccountHolder(name);
        card2.setPersonalPIN(PIN);
        return "Made card2";
    }

    public String compareCredit(CreditCard card1, CreditCard card2, Bank bank)
    {
        return bank.lowerBalance(card1,card2) + "has the lower balance.";
    }

    public String deposit(BagelShop shop)
    {
        shop.depositProfits();
        return "Deposited all profits!";
    }

    public String checkInventory(BagelShop shop)
    {
        return shop.toString();
    }
}
