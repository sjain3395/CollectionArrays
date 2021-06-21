class Bank
{
    public void displayAllCustomerNames(String[] customer )
    {
        for (String name: customer)
        {
          System.out.println(name);

        }
    }
}

public class Anymousearray {
    public static void main(String[] args)
    {
       Bank bank = new Bank();
//       String[] customerList = {"Anup", "Neeraj", "Rahul","Ravi"};
       bank.displayAllCustomerNames(new String[]{"Anup","Shree","Neeraj","Rahul","Ravi" });
    }
}
