class BankAccount
{
    String accountno;
    double bal;

    public String getAccountno()
    {
        return this.accountno;
    }
    public double getBalance()
    {
        return this.bal;
    }

    public void setAccountNumber(String accontno)
    {
        this.accountno=accountno;
    }
    public void SetBalance(double amount)
    {
        if(amount >0)
        {
            this.bal=amount;
        }
        else
        {
            System.out.println("enter +ve amoint");
        }
    }
}
class Bank
{
    public static void main(String args[])
    {
        BankAccount b1=new BankAccount();
        b1.SetBalance(9999999999.0);
        System.out.println("updated bal "+b1.getBalance());

    }
}