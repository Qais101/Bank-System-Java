
public class BankAccount {
    private String number;
    private double balance;
    private String holderName;
    private static int total=0;
    private static double max_deposit=1000000.0;
    public BankAccount(String number,double balance,String holderName)
    {
    this.number=number;
    this.balance=balance;
    this.holderName=holderName;
    total++;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public static int getTotal() {
        return total;
    }

    public static double getMaxDeposit()
    {
    return max_deposit;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    
    
    
    
    public void deposit(double amount)
    {
    if(amount>0&&amount<=max_deposit)
    {
    balance+=amount;
          System.out.println(amount+" has been credited to "+getNumber()+".");
                System.out.println("Deposit Successful, Balance : "+getBalance());
    }
    else
    {
        System.out.println("Deposit failed. Amount must be greater than 0 and not exceed "+max_deposit);
    }
    }
    
    
    
    public void withdraw(double amount)
    {
    if(amount>0&&amount<=balance)
    {
    balance-=amount;
         System.out.println(amount+" has been debited from "+getNumber()+".");
                System.out.println("Withdrawal successful, Balance : "+getBalance());
    }
    else
    {
        System.out.println("Withdrawal failed. Check amount or avaialabe balance.");
    }
    }
    
    public void displayAccountInfo()
    {
        System.out.println("\n--- Account Info ---");
        System.out.println("Account Number   :"+number);
        System.out.println("Holder Name      :"+holderName);
        System.out.println("Current Balance  :"+balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" + "number=" + number + ", balance=" + balance + ", holderName=" + holderName + '}';
    }
    
    
}
