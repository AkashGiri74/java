/*4. Develop a Java class BankAccount that uses Encapsulation to 
manage accountNumber, balance, and accountHolderName. Provide 
methods to deposit and withdraw money while ensuring that the 
balance does not go negative. */
class BankAccount
{
     String accountNumber;
     double balance;
     String accountHolderName;


    BankAccount(String accountNumber,String accountHolderName)
    {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=0.0;
    }
    public String getAccountno(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getaccountHolderName()
    {
        return accountHolderName;
    }

    public void deposit(double amount)
    {
        if(amount >0)
        {
            balance+=amount;
            System.out.println("deposit "+amount+"suuccess!");
        }
        else
        {
            System.out.println("enter +ve amoint");
        }
    }
    public void withdraw(double amount)
    {
        if(amount >0 && balance >=amount)
        {
            balance-=amount;
            System.out.println("withdraw "+amount+"suuccess!");
        }
        else
        {
            System.out.println("low bal !");
        }
    }
    public void displayInfo()
    {
        System.out.println("account holder"+accountHolderName);
        System.out.println("account no"+accountNumber);
        System.out.println("account bal"+balance);
    }
}
class demo
{
    public static void main(String[] args)
     { BankAccount a=new BankAccount("1234", "Akash giri");
     a.deposit(999999999999.0);
     a.withdraw(1);
     a.displayInfo();
        
    }
}

