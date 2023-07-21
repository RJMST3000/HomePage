
/**
 * Write a description of class Debit_Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Debit_Card extends Bank_Card
{
    // Setting Attributes for Sub-Class Debit Card

    private int pinNumber;
    private int Withdrawalamount;
    private String Dateofwithdrawal;
    private boolean hasWithdrawn;

    // Contructor for Sub-Class Debit Card

    public Debit_Card (int balanceAmount, int cardID, String bankAccount, String issuerBank, String clientName, int pinNumber)
    {
        super(balanceAmount, cardID, bankAccount, issuerBank);
        super.setclientName(clientName);
        this.pinNumber = pinNumber;
        this.hasWithdrawn = false;
    }

    // Accessor Methods

    public int getPinNumber() {
        return this.pinNumber;
    }

    public int getWithdrawalamount()
    {
        return this.Withdrawalamount;
    }


    public String getDateOfWithdrawal()
    {
        return this.Dateofwithdrawal;
    }

    public void setDateOfWithdrawal(String Dateofwithdrawal)
    {
        this.Dateofwithdrawal = Dateofwithdrawal;
    }

    public boolean getHasWithdrawn()
    {
        return this.hasWithdrawn;
    }


    // Mutator Method

    public void setWithdrawalamount(int Withdrawalamount)
    {
        this.Withdrawalamount = Withdrawalamount;
    }


    public void setWithdrawalAmount (int Withdrawalamount, String DateOfwithdrawal, int pinNumber)
    {
        if ( this.pinNumber == pinNumber )
        {
            System.out.println("Thank You");

            System.out.println("Your Current Balance is: " + super.getbalanceAmount());

            if (super.getbalanceAmount() > 0)

            {
                System.out.println("Now, You can Withdraw your money.");

                if (super.getbalanceAmount() <= this.Withdrawalamount)
                {
                    this.Withdrawalamount = Withdrawalamount;
                    this.hasWithdrawn = true;
                    setbalanceAmount(getbalanceAmount()-Withdrawalamount);
                    System.out.println("Rs."  + Withdrawalamount + "has been successfully withdrawn.");
                    System.out.println("The remaining balance on your account is:" + getbalanceAmount());
                }
                else
                {
                    System.out.println("Sorry,You have insufficient balance in your Account");
                }
            }
            else
            {
                System.out.println("Your balance is  0.00 ");

            }
        }
        else
        {
            System.out.println("The Pin number that you have entered is incorrect.");
            System.out.println("Please enter your Pin again.");
        }
    }
}

