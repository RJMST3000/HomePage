/**
 * Java Program for Credit Card
 *
 * Mohammad Taukir Reza
 * 1.1
 */

public class Credit_Card extends Bank_Card
{
    // Setting Attributes for Sub-Class Credit_Card

    private int cVcNumber;
    private int CreditLimit;
    private double InterestRate;
    private String ExpirationDate;
    private String GracePeriod;
    private boolean isGranted;

    // Constructor of Credit_Card Sub_Class

    public Credit_Card(int cardID, int balanceAmount, String clientName, String issuerBank, String bankAccount, int cVcNumber, double InterestRate, String ExpirationDate)
    {
        super(balanceAmount, cardID, bankAccount, issuerBank);
        setclientName(clientName);
        this.cVcNumber = cVcNumber;
        this.InterestRate = InterestRate;
        this.ExpirationDate = ExpirationDate;
        isGranted = false;
    }

    // Mutator Methods

    public void setCreditLimit(int CreditLimit, String GracePeriod)
    {
        if ( CreditLimit <= 2.5 * getbalanceAmount() )
        {
            this.CreditLimit = CreditLimit;
            this.GracePeriod = GracePeriod;
            isGranted = true;
        }
        else
        {
            System.out.println("Sorry, Credit can't be Issued.");
        }
    }

    //Accessor Methods
    public int getcVcNumber()
    {
        return this.cVcNumber;
    }
    public int getCreditLimit()
    {
        return this.CreditLimit;
    }
    public double getInterestRate()
    {
        return this.InterestRate;
    }
    public String getExpirationDate()
    {
        return this.ExpirationDate;
    }
    public String getGracePeriod()
    {
        return this.GracePeriod;
    }
    public void cancelCreditCard()
    {
        if(isGranted)
        {
            cVcNumber = 0;
            CreditLimit = 0;
            GracePeriod = String.valueOf(0);
            isGranted = false;
        }
    }

    //override
    public void display()
    {
        super.display();

        if (isGranted)
        {
            System.out.println("CVC Number: " + cVcNumber);
            System.out.println("Credit Limit: " + CreditLimit);
            System.out.println("Interest Rate: " + InterestRate);
            System.out.println("Expiration Date: " + ExpirationDate);
            System.out.println("Grace Period: " + GracePeriod);
        }
    }
}

