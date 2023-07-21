/**
 * Java Program for Bank Card
 *
 * Mohammad Taukir Reza
 * 1.1
 */

public class Bank_Card
{
    // Setting Attributes of Class
    private int cardID;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;

    // Constructor of BankCard Class

    public Bank_Card(int balanceAmount, int cardID, String bankAccount, String issuerBank)
    {
        this.balanceAmount = balanceAmount;
        this.cardID = cardID;
        this.bankAccount = bankAccount;
        this.issuerBank = issuerBank;
        this.clientName = ""; // Intializing "clientName" variale to an Empty Datatype "String"
    }

    // Accessor Methods

    public int getcardID()
    {
        return this.cardID;
    }

    public String getclientName()
    {
        return this.clientName;
    }

    public String getissuerBank()
    {
        return this.issuerBank;
    }

    public int getbalanceAmount()
    {
        return this.balanceAmount;
    }

    // Mutator Methods

    public void setclientName(String clientName)
    {
        this.clientName = clientName;
    }

    public void setbalanceAmount(int balanceAmount)
    {
        this.balanceAmount = balanceAmount;
    }

    public String getbankAccount()
    {
        return this.bankAccount = bankAccount;
    }

    // Setting Display Method to Display Bank Details and
    // To confirm clientname is assigned or not using"if" and "else" condition

    public void display()
    {
        System.out.println("Card Id: " + this.cardID);

        if ( this.clientName.equals("") )
        {
            System.out.println("Sorry, Please assign the Client Name.");
        }
        else
        {
            System.out.println("Your Client name is: " + this.clientName);
        }
        System.out.println("Issuer Bank: " + this.issuerBank);
        System.out.println("Bank Account: " + this.bankAccount);
        System.out.println("Balance Amount: " + this.balanceAmount);
    }
}
