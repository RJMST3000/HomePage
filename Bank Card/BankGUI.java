/**
 * @code description GUI for a Banking system that stores details of Bank Card in an ArrayList (Written in Java)
 *
 * @author Mohammad Taukir Reza
 * @version 1.1
 */


//importing java packages from jdk
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.Border;
import java.util.ArrayList;

//---CREATING A CLASS AND IMPLEMENTING ACTIONLISTENER INTERFACE---//
class BankGUI implements ActionListener
{
    //-----------------CREATING DIFFERENT OBJECTS OF JAVA SWING COMPONENTS FOR DIFFERENT----------------//

    //----------------JAVA SWING COMPONENT OBJECTS FOR <MAINFRAME FRAME>----------------//
    //JFrame Object
    JFrame main_frame;
    //JPanel Object
    JPanel mainframe_panel;
    //JLabel Object
    JLabel main_frame_title;
    //JButton Objects
    JButton main_frame_add_credit_card, main_frame_add_debit_card, main_frame_set_credit_limit,
            main_frame_withdraw_money, main_frame_Cancel_Credit_Card;


    //----------------JAVA SWING COMPONENT OBJECTS FOR <CREDIT CARD FRAME>----------------//
    //JFrame Object
    JFrame credit_card_frame;
    //JPanel Object
    JPanel credit_card_frame_panel;
    //JLabel Objects
    JLabel credit_card_frame_title, credit_card_frame_subtitle;
    JLabel credit_card_frame_clientName, credit_card_frame_issuerBank, credit_card_frame_bankAccount,
            credit_card_frame_cardId, credit_card_frame_balanceAmount, credit_card_frame_cvcNumber, 
            credit_card_frame_interestRate, credit_card_frame_expirationDate;
    //JTextField Objects
    JTextField credit_card_frame_client_Name, credit_card_frame_issuer_Bank, credit_card_frame_bank_Account,
            credit_card_frame_card_Id, credit_card_frame_balance_Amount, credit_card_frame_interest_Rate, credit_card_frame_cvc_Number;
    //JButton Objects
    JButton credit_card_frame_display_details, credit_card_frame_back, credit_card_frame_clear, 
    credit_card_frame_apply;
    //JComboBox Objects
    JComboBox credit_card_frame_expiration_day, credit_card_frame_expiration_month, 
    credit_card_expiration_frame_year;


    //----------------JAVA SWING COMPONENT OBJECTS FOR <DEBIT CARD FRAME>----------------//
    //JFrame Object
    JFrame debit_card_frame;
    //JPanel Object
    JPanel debit_card_frame_panel;
    //JLabel Objects
    JLabel debit_card_frame_title, debit_card_frame_subtitle;
    JLabel debit_card_frame_clientName, debit_card_frame_cardId, debit_card_frame_bankAccount,
            debit_card_frame_pinNumber, debit_card_frame_issuerBank, debit_card_frame_balanceAmount;
    //JTextField Objects
    JTextField debit_card_frame_client_Name, debit_card_frame_card_Id, debit_card_frame_bank_Account,
            debit_card_frame_pin_Number, debit_card_frame_issuer_Bank, debit_card_frame_balance_Amount;
    //JButton Objects
    JButton debit_card_frame_display_details, debit_card_frame_apply, debit_card_frame_clear, debit_card_frame_back;


    //----------------JAVA SWING COMPONENT OBJECTS FOR <WITHDRAW MONEY FRAME>----------------//
    //JFrame Object
    JFrame withdrawMoney_frame;
    //JPanel Object
    JPanel  withdrawMoney_panel;
    //JLabel Objects
    JLabel withdrawMoney_title, withdrawMoney_subtitle;
    JLabel withdrawMoney_cardId, withdrawMoney_pinNumber, withdrawMoney_withdrawalDate, 
    withdrawMoney_withdrawalAmount;
    //JTextField Objects
    JTextField withdrawMoney_card_Id, withdrawMoney_pin_Number, withdrawMoney_withdrawal_Amount;
    //JButton Objects
    JButton withdrawMoney_display_Details, withdrawMoney_get_card_Id, withdrawMoney_draw_out;
    JButton withdrawMoney_clear, withdrawMoney_back;
    //JComboBox Objects
    JComboBox withdrawDate_year, withdrawDate_month, withdrawDate_day;


    //----------------JAVA SWING COMPONENT OBJECTS FOR <SET THE CREDIT LIMIT FRAME>----------------//
    //JFrame Object
    JFrame setcreditlimit_frame;
    //JPanel Objects
    JPanel setcreditlimit_panel;
    //JLabel Objects
    JLabel setcreditlimit_title, setcreditlimit_subtitle, setcreditlimit_cardId,
            setcreditlimit_newCreditLimit, setcreditlimit_newGracePeriod;
    //JTextField Objects
    JTextField setcreditlimit_card_Id, setcreditlimit_new_Credit_Limit, 
    setcreditlimit_new_Grace_Period;
    //JButton Objects
    JButton setcreditlimit_clear, setcreditlimit_back, 
    setcreditlimit_set_the_credit_limit, setcreditlimit_display_details;


    //----------------JAVA SWING COMPONENT OBJECTS FOR <CANCEL CREDIT CARD FRAME>----------------//
    //JFrame Object
    JFrame cancelCreditCardframe;
    //JPanel Objects
    JPanel cancelCreditCard_panel;
    //JLabel Objects
    JLabel cancelCreditcard_title, cancelCreditcard_subtitle, cancelCreditcard_creditCardId;
    //JTextField Objects
    JTextField cancelCreditcard_creditCard_Id;
    //JButton Objects
    JButton cancelCreditcard_display, cancelCreditcard_cancel,
    cancelCreditcard_back, cancelCreditcard_clear;

    //ImageIcon Object
    ImageIcon frameicon = new ImageIcon("frame_icon.png");
    //Border Object
    Border Border = BorderFactory.createLineBorder(Color.BLACK,2);


    //Declaring ArrayList
    ArrayList<Bank_Card> bankcard = new ArrayList<>();


    //---CONSTRUCTOR---//
    BankGUI()
    {
        //-----------------------------------------------STARTING OF <MAINFRAME CARD> GUI_CODE----------------------------------------------------------//
        //JFrame Object
        main_frame = new JFrame("SIGMA BANK");

        //JPanel Object
        mainframe_panel = new JPanel();
        mainframe_panel.setLayout(null);
        mainframe_panel.setBounds(0, 0, 800, 460);

        //Title
        //-----JLabel-----//
        main_frame_title = new JLabel("SIGMA BANK Pvt.Ltd");
        main_frame_title.setFont(new Font("Oswald", Font.BOLD, 24));
        main_frame_title.setBounds(268, 24, 255, 34);

        //---- <ADD CREDIT CARD> "JButton"----//
        //-----JButton-----//
        main_frame_add_credit_card = new JButton("ADD A CREDIT CARD");
        main_frame_add_credit_card.setFont(new Font("Oswald", Font.PLAIN, 16));
        main_frame_add_credit_card.setFocusable(false);
        main_frame_add_credit_card.setBounds(419, 92, 205, 49);
        main_frame_add_credit_card.addActionListener(this);

        //---- <ADD DEBIT CARD> "JButton"----//
        //-----JButton-----//
        main_frame_add_debit_card = new JButton("ADD A DEBIT CARD");
        main_frame_add_debit_card.setFont(new Font("Oswald", Font.PLAIN, 16));
        main_frame_add_debit_card.setFocusable(false);
        main_frame_add_debit_card.setBounds(137, 92, 205, 49);
        main_frame_add_debit_card.addActionListener(this);

        //---- <WITHDRAW MONEY> "JButton"----//
        //-----JButton-----//
        main_frame_withdraw_money = new JButton("WITHDRAW MONEY");
        main_frame_withdraw_money.setFont(new Font("Oswald", Font.PLAIN, 16));
        main_frame_withdraw_money.setFocusable(false);
        main_frame_withdraw_money.setBounds(137, 187, 205, 51);
        main_frame_withdraw_money.addActionListener(this);

        //---- <SET CREDIT LIMIT> "JButton"----//
        main_frame_set_credit_limit = new JButton("SET CREDIT LIMIT");
        main_frame_set_credit_limit.setFont(new Font("Oswald", Font.PLAIN, 16));
        main_frame_set_credit_limit.setFocusable(false);
        main_frame_set_credit_limit.setBounds(419, 189, 205, 49);
        main_frame_set_credit_limit.addActionListener(this);

        //---- <CANCEL CREDIT CARD> "JButton"----//
        main_frame_Cancel_Credit_Card = new JButton("CANCEL CREDIT CARD");
        main_frame_Cancel_Credit_Card.setFont(new Font("Oswald", Font.PLAIN, 16));
        main_frame_Cancel_Credit_Card.setFocusable(false);
        main_frame_Cancel_Credit_Card.setBounds(268, 284, 217, 54);
        main_frame_Cancel_Credit_Card.addActionListener(this);

        //---ADDING COMPONENTS TO THE PANEL---//
        //Title Component
        mainframe_panel.add(main_frame_title);
        //Add Credit Card Component
        mainframe_panel.add(main_frame_add_credit_card);
        //Add Debit Card Component
        mainframe_panel.add(main_frame_add_debit_card);
        //Add Debit Card Component
        mainframe_panel.add(main_frame_withdraw_money);
        //Set Credit Limit Component
        mainframe_panel.add(main_frame_set_credit_limit);
        //Cancel Credit Card Button Component
        mainframe_panel.add(main_frame_Cancel_Credit_Card);

        //---Setting attributes of frame---//
        main_frame.setIconImage(frameicon.getImage());
        main_frame.setResizable(false);
        main_frame.setSize(800, 435);
        main_frame.setDefaultCloseOperation(main_frame.EXIT_ON_CLOSE);
        main_frame.setVisible(true);

        //---Adding panel to the frame---//
        main_frame.add(mainframe_panel);




        //-----------------------------------------------END OF <MAINFRAME CARD> GUI_CODE----------------------------------------------------------//




        //-----------------------------------------------STARTING OF <CREDIT CARD> GUI_CODE----------------------------------------------------------//
        //JFrame Object
        credit_card_frame = new JFrame("SIGMA BANK");

        //JPanel Object
        credit_card_frame_panel = new JPanel();
        credit_card_frame_panel.setLayout(null);
        credit_card_frame_panel.setBounds(0,0,575,600);

        //Title
        //-----JLabel-----//
        credit_card_frame_title = new JLabel("Credit Card");
        credit_card_frame_title.setFont(new Font("Oswald", Font.BOLD, 24));
        credit_card_frame_title.setBounds(215, 5, 140, 34);

        //SubTitle
        //-----JLabel-----//
        credit_card_frame_subtitle = new JLabel("Enter the Credit Card Details:");
        credit_card_frame_subtitle.setFont(new Font("Oswald", Font.PLAIN, 18));
        credit_card_frame_subtitle.setBounds(164, 50, 240, 34);

        //Client Name
        //-----JLabel-----//
        credit_card_frame_clientName = new JLabel("Client Name:");
        credit_card_frame_clientName.setFont(new Font("Oswald", Font.PLAIN, 16));
        credit_card_frame_clientName.setBounds(79, 94, 100, 22);
        //-----JTextField-----//
        credit_card_frame_client_Name = new JTextField();
        credit_card_frame_client_Name.setBounds(181, 91, 306, 32);
        credit_card_frame_client_Name.setFont(new Font("Oswald", Font.PLAIN, 18));
        credit_card_frame_client_Name.setBorder(Border);

        //Card ID
        //-----JLabel-----//
        credit_card_frame_cardId = new JLabel("Card ID:");
        credit_card_frame_cardId.setFont(new Font("Oswald", Font.PLAIN, 16));
        credit_card_frame_cardId.setBounds(79, 144, 70, 20);
        //-----JTextField-----//
        credit_card_frame_card_Id = new JTextField();
        credit_card_frame_card_Id.setBounds(151, 139, 337, 32);
        credit_card_frame_card_Id.setFont(new Font("Oswald", Font.PLAIN, 18));
        credit_card_frame_card_Id.setBorder(Border);

        //Bank Account
        //-----JLabel-----//
        credit_card_frame_bankAccount = new JLabel("Bank Account:");
        credit_card_frame_bankAccount.setFont(new Font("Oswald", Font.PLAIN, 16));
        credit_card_frame_bankAccount.setBounds(79, 193, 110, 20);
        //-----JTextField-----//
        credit_card_frame_bank_Account = new JTextField();
        credit_card_frame_bank_Account.setBounds(192, 187, 295, 32);
        credit_card_frame_bank_Account.setFont(new Font("Oswald", Font.PLAIN, 18));
        credit_card_frame_bank_Account.setBorder(Border);

        //CVC Number
        //-----JLabel-----//
        credit_card_frame_cvcNumber = new JLabel("CVC Number:");
        credit_card_frame_cvcNumber.setFont(new Font("Oswald", Font.PLAIN, 16));
        credit_card_frame_cvcNumber.setBounds(79, 241, 102, 20);
        //-----JTextField-----//
        credit_card_frame_cvc_Number = new JTextField();
        credit_card_frame_cvc_Number.setBounds(192, 235, 295, 32);
        credit_card_frame_cvc_Number.setFont(new Font("Oswald", Font.PLAIN, 18));
        credit_card_frame_cvc_Number.setBorder(Border);

        //Balance Amount
        //-----JLabel-----//
        credit_card_frame_balanceAmount = new JLabel("Balance Amount:");
        credit_card_frame_balanceAmount.setFont(new Font("Oswald", Font.PLAIN, 16));
        credit_card_frame_balanceAmount.setBounds(79, 289, 125, 20);
        //-----JTextField-----//
        credit_card_frame_balance_Amount = new JTextField();
        credit_card_frame_balance_Amount.setBounds(209, 283, 279, 32);
        credit_card_frame_balance_Amount.setFont(new Font("Oswald", Font.PLAIN, 18));
        credit_card_frame_balance_Amount.setBorder(Border);

        //Interest Rate
        //-----JLabel-----//
        credit_card_frame_interestRate = new JLabel("Interest Rate:");
        credit_card_frame_interestRate.setFont(new Font("Oswald", Font.PLAIN, 16));
        credit_card_frame_interestRate.setBounds(79, 340, 102, 20);
        //-----JTextField-----//
        credit_card_frame_interest_Rate = new JTextField();
        credit_card_frame_interest_Rate.setBounds(186, 334, 303, 32);
        credit_card_frame_interest_Rate.setFont(new Font("Oswald", Font.PLAIN, 18));
        credit_card_frame_interest_Rate.setBorder(Border);

        //Issuer Bank
        //-----JLabel-----//
        credit_card_frame_issuerBank = new JLabel("Issuer Bank:");
        credit_card_frame_issuerBank.setFont(new Font("Oswald", Font.PLAIN, 16));
        credit_card_frame_issuerBank.setBounds(79, 392, 102, 20);
        //-----JTextField-----//
        credit_card_frame_issuer_Bank = new JTextField();
        credit_card_frame_issuer_Bank.setBounds(182, 387, 307, 32);
        credit_card_frame_issuer_Bank.setFont(new Font("Rubik", Font.PLAIN, 18));
        credit_card_frame_issuer_Bank.setBorder(Border);

        //Expiration Date
        //-----JLabel-----//
        credit_card_frame_expirationDate = new JLabel("ExpirationDate:");
        credit_card_frame_expirationDate.setFont(new Font("Oswald", Font.PLAIN, 16));
        credit_card_frame_expirationDate.setBounds(79, 444, 125, 20);
        //-----JComboBox-----//
        //<--Year-->
        String[] year_of_expirationDate = {"2010", "2011", "2012", "2013", "2014",
                "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023"};
        credit_card_expiration_frame_year = new JComboBox<String>(year_of_expirationDate);
        credit_card_expiration_frame_year.setFont(new Font("Oswald", Font.PLAIN, 15));
        credit_card_expiration_frame_year.setBounds(204, 444, 70, 24);
        //<--Month-->
        String[] month_of_expirationDate = {"January","February","March","April","May",
                "June","July","August","September","October","November","December"};
        credit_card_frame_expiration_month = new JComboBox<String>(month_of_expirationDate);
        credit_card_frame_expiration_month.setFont(new Font("Oswald", Font.PLAIN, 15));
        credit_card_frame_expiration_month.setBounds(289, 444, 95, 24);
        //<--Day-->
        String[] day_of_expirationDate = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14",
                "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32"};
        credit_card_frame_expiration_day = new JComboBox<String>(day_of_expirationDate);
        credit_card_frame_expiration_day.setFont(new Font("Oswald", Font.PLAIN, 15));
        credit_card_frame_expiration_day.setBounds(401, 444, 50, 24);
        //Display Details
        credit_card_frame_display_details = new JButton("Display Details");
        credit_card_frame_display_details.setFocusable(false);
        credit_card_frame_display_details.setBounds(14, 520, 175, 32);
        credit_card_frame_display_details.addActionListener(this);

        //Clear
        credit_card_frame_clear = new JButton("Clear");
        credit_card_frame_clear.setFocusable(false);
        credit_card_frame_clear.setBounds(379, 520, 82, 32);
        credit_card_frame_clear.addActionListener(this);

        //Apply Button
        //-----JButton-----//
        credit_card_frame_apply = new JButton("Apply");
        credit_card_frame_apply.setFocusable(false);
        credit_card_frame_apply.setBounds(277, 520, 90, 32);
        credit_card_frame_apply.addActionListener(this);

        //Back Button
        //-----JButton-----//
        credit_card_frame_back = new JButton("Back");
        credit_card_frame_back.setFocusable(false);
        credit_card_frame_back.setBounds(471, 520, 82, 32);
        credit_card_frame_back.addActionListener(this);

        //---Adding Components to the panel---//
        //Title Component
        credit_card_frame_panel.add(credit_card_frame_title);
        //SubTitle Component
        credit_card_frame_panel.add(credit_card_frame_subtitle);
        //Client Name Components
        credit_card_frame_panel.add(credit_card_frame_clientName);
        credit_card_frame_panel.add(credit_card_frame_client_Name);
        //Card ID Component
        credit_card_frame_panel.add(credit_card_frame_cardId);
        credit_card_frame_panel.add(credit_card_frame_card_Id);
        //Bank Account Components
        credit_card_frame_panel.add(credit_card_frame_bankAccount);
        credit_card_frame_panel.add(credit_card_frame_bank_Account);
        //CVC Number Components
        credit_card_frame_panel.add(credit_card_frame_cvcNumber);
        credit_card_frame_panel.add(credit_card_frame_cvc_Number);
        //Balance Amount Components
        credit_card_frame_panel.add(credit_card_frame_balanceAmount);
        credit_card_frame_panel.add(credit_card_frame_balance_Amount);
        //Interest Rate Components
        credit_card_frame_panel.add(credit_card_frame_interestRate);
        credit_card_frame_panel.add(credit_card_frame_interest_Rate);
        //Issuer Bank Component
        credit_card_frame_panel.add(credit_card_frame_issuerBank);
        credit_card_frame_panel.add(credit_card_frame_issuer_Bank);
        //Expiration Date Components
        credit_card_frame_panel.add(credit_card_frame_expirationDate);
        credit_card_frame_panel.add(credit_card_expiration_frame_year);
        credit_card_frame_panel.add(credit_card_frame_expiration_month);
        credit_card_frame_panel.add(credit_card_frame_expiration_day);
        //Apply Button Component
        credit_card_frame_panel.add(credit_card_frame_apply);
        //Display Details
        credit_card_frame_panel.add(credit_card_frame_display_details);
        //Clear Button Component
        credit_card_frame_panel.add(credit_card_frame_clear);
        //Back Button Component
        credit_card_frame_panel.add(credit_card_frame_back);

        //---Setting attributes of frame---//
        credit_card_frame.setIconImage(frameicon.getImage());
        credit_card_frame.setResizable(false);
        credit_card_frame.setSize(575, 600);
        credit_card_frame.setDefaultCloseOperation(credit_card_frame.EXIT_ON_CLOSE);
        credit_card_frame.setVisible(false);

        //---Adding panel to the frame---//
        credit_card_frame.add(credit_card_frame_panel);



        //-----------------------------------------------END OF <CREDIT CARD> GUI_CODE----------------------------------------------------------//



        //-----------------------------------------------STARTING OF <DEBIT CARD> GUI_CODE----------------------------------------------------------//
        //JFrame Object
        debit_card_frame = new JFrame("SIGMA BANK");

        //JPanel Object
        debit_card_frame_panel = new JPanel();
        debit_card_frame_panel.setLayout(null);
        debit_card_frame_panel.setBounds(0,0,575,520);

        //Title
        //-----JLabel-----//
        debit_card_frame_title = new JLabel("Debit Card");
        debit_card_frame_title.setFont(new Font("Oswald",Font.BOLD,24));
        debit_card_frame_title.setBounds(228,5,125,34);

        //SubTitle
        //-----JLabel-----//
        debit_card_frame_subtitle = new JLabel("Enter the Debit Card Details:");
        debit_card_frame_subtitle.setFont(new Font("Oswald",Font.PLAIN,18));
        debit_card_frame_subtitle.setBounds(173,50,240,34);

        //Client Name
        //-----JLabel-----//
        debit_card_frame_clientName = new JLabel("Client Name:");
        debit_card_frame_clientName.setFont(new Font("Oswald",Font.PLAIN,16));
        debit_card_frame_clientName.setBounds(79,95,100,22);
        //-----JTextField-----//
        debit_card_frame_client_Name = new JTextField();
        debit_card_frame_client_Name.setBounds(181,91,306,32);
        debit_card_frame_client_Name.setFont(new Font("Oswald",Font.PLAIN,18));
        debit_card_frame_client_Name.setBorder(Border);

        //Card ID
        //-----JLabel-----//
        debit_card_frame_cardId = new JLabel("Card ID:");
        debit_card_frame_cardId.setFont(new Font("Oswald",Font.PLAIN,16));
        debit_card_frame_cardId.setBounds(79,144,70,20);
        //-----JTextField-----//
        debit_card_frame_card_Id = new JTextField();
        debit_card_frame_card_Id.setBounds(151,139,337,32);
        debit_card_frame_card_Id.setFont(new Font("Oswald",Font.PLAIN,18));
        debit_card_frame_card_Id.setBorder(Border);

        //Bank Account
        //-----JLabel-----//
        debit_card_frame_bankAccount = new JLabel("Bank Account:");
        debit_card_frame_bankAccount.setBounds(79,193,110,20);
        debit_card_frame_bankAccount.setFont(new Font("Oswald",Font.PLAIN,16));
        //-----JTextField-----//
        debit_card_frame_bank_Account = new JTextField();
        debit_card_frame_bank_Account.setBounds(192,187,295,32);
        debit_card_frame_bank_Account.setFont(new Font("Oswald",Font.PLAIN,18));
        debit_card_frame_bank_Account.setBorder(Border);

        //PIN Number
        //-----JLabel-----//
        debit_card_frame_pinNumber = new JLabel("PIN Number:");
        debit_card_frame_pinNumber.setFont(new Font("Oswald",Font.PLAIN,16));
        debit_card_frame_pinNumber.setBounds(79,241,95,20);
        //-----JTextField-----//
        debit_card_frame_pin_Number = new JTextField();
        debit_card_frame_pin_Number.setBounds(181,235,307,32);
        debit_card_frame_pin_Number.setFont(new Font("Oswald",Font.PLAIN,18));
        debit_card_frame_pin_Number.setBorder(Border);

        //Issuer Bank
        //-----JLabel-----//
        debit_card_frame_issuerBank = new JLabel("Issuer Bank:");
        debit_card_frame_issuerBank.setFont(new Font("Oswald",Font.PLAIN,16));
        debit_card_frame_issuerBank.setBounds(79,289,94,20);
        //-----JTextField-----//
        debit_card_frame_issuer_Bank = new JTextField();
        debit_card_frame_issuer_Bank.setBounds(181,283,307,32);
        debit_card_frame_issuer_Bank.setFont(new Font("Rubik",Font.PLAIN,18));
        debit_card_frame_issuer_Bank.setBorder(Border);

        //Balance Amount
        //-----JLabel-----//
        debit_card_frame_balanceAmount = new JLabel("Balance Amount:");
        debit_card_frame_balanceAmount.setFont(new Font("Oswald",Font.PLAIN,16));
        debit_card_frame_balanceAmount.setBounds(79,340,123,20);
        //-----JTextField-----//
        debit_card_frame_balance_Amount = new JTextField();
        debit_card_frame_balance_Amount.setBounds(210,334,279,32);
        debit_card_frame_balance_Amount.setFont(new Font("Oswald",Font.PLAIN,18));
        debit_card_frame_balance_Amount.setBorder(Border);

        //Display Details Button
        debit_card_frame_display_details = new JButton("Display Details");
        debit_card_frame_display_details.setFocusable(false);
        debit_card_frame_display_details.setBounds(14,438,160,32);
        debit_card_frame_display_details.addActionListener(this);

        //Back Button
        //-----JButton-----//
        debit_card_frame_back = new JButton("Back");
        debit_card_frame_back.setBounds(468,438,82,32);
        debit_card_frame_back.setFocusable(false);
        debit_card_frame_back.addActionListener(this);

        //Apply Button
        //-----JButton-----//
        debit_card_frame_apply = new JButton("Apply");
        debit_card_frame_apply.setBounds(280,438,82,32);
        debit_card_frame_apply.setFocusable(false);
        debit_card_frame_apply.addActionListener(this);

        //Clear
        debit_card_frame_clear = new JButton("Clear");
        debit_card_frame_clear.setFocusable(false);
        debit_card_frame_clear.setBounds(374,438,82,32);
        debit_card_frame_clear.addActionListener(this);

        //---ADDING COMPONENTS TO THE PANEL---//
        //Title Component
        debit_card_frame_panel.add(debit_card_frame_title);
        //SubTitle Component
        debit_card_frame_panel.add(debit_card_frame_subtitle);
        //Client Name Components
        debit_card_frame_panel.add(debit_card_frame_clientName);
        debit_card_frame_panel.add(debit_card_frame_client_Name);
        //Card ID Component
        debit_card_frame_panel.add(debit_card_frame_cardId);
        debit_card_frame_panel.add(debit_card_frame_card_Id);
        //Bank Account Components
        debit_card_frame_panel.add(debit_card_frame_bankAccount);
        debit_card_frame_panel.add(debit_card_frame_bank_Account);
        //Pin Number Components
        debit_card_frame_panel.add(debit_card_frame_pinNumber);
        debit_card_frame_panel.add(debit_card_frame_pin_Number);
        //Balance Amount Components
        debit_card_frame_panel.add(debit_card_frame_issuerBank);
        debit_card_frame_panel.add(debit_card_frame_issuer_Bank);
        //Issuer Bank Component
        debit_card_frame_panel.add(debit_card_frame_balanceAmount);
        debit_card_frame_panel.add(debit_card_frame_balance_Amount);
        //Display Details Button Component
        debit_card_frame_panel.add(debit_card_frame_display_details);
        //Apply Button Component
        debit_card_frame_panel.add(debit_card_frame_apply);
        //Clear Button Component
        debit_card_frame_panel.add(debit_card_frame_clear);
        //Back Button Component
        debit_card_frame_panel.add(debit_card_frame_back);

        //---Setting attributes of frame---//
        debit_card_frame.setIconImage(frameicon.getImage());
        debit_card_frame.setResizable(false);
        debit_card_frame.setSize(575,520);
        debit_card_frame.setDefaultCloseOperation (debit_card_frame.EXIT_ON_CLOSE);
        debit_card_frame.setVisible(false);

        //---Adding panel to the frame---//
        debit_card_frame.add(debit_card_frame_panel);




        //-----------------------------------------------END OF <DEBIT CARD> GUI_CODE----------------------------------------------------------//




        //-----------------------------------------------STARTING OF <WITHDRAW MONEY CARD> GUI_CODE----------------------------------------------------------//
        //JFrame Object
        withdrawMoney_frame = new JFrame("SIGMA BANK");
        //JPanel Object
        withdrawMoney_panel = new JPanel();
        withdrawMoney_panel.setBounds(0,0,575,381);
        withdrawMoney_panel.setLayout(null);

        //Title
        //-----JLabel-----//
        withdrawMoney_title = new JLabel("Withdraw Money");
        withdrawMoney_title.setFont(new Font("Oswald",Font.BOLD,24));
        withdrawMoney_title.setBounds(189,5,200,34);

        //SubTitle
        //-----JLabel-----//
        withdrawMoney_subtitle = new JLabel("Enter the Debit Card Details:");
        withdrawMoney_subtitle.setFont(new Font("Oswald",Font.PLAIN,18));
        withdrawMoney_subtitle.setBounds(168,50,240,34);

        //Card ID
        //-----JLabel-----//
        withdrawMoney_cardId = new JLabel("Card ID:");
        withdrawMoney_cardId.setFont(new Font("Oswald",Font.PLAIN,16));
        withdrawMoney_cardId.setBounds(70,97,70,20);
        //-----JTextField-----//
        withdrawMoney_card_Id = new JTextField();
        withdrawMoney_card_Id.setBounds(142,93,335,32);
        withdrawMoney_card_Id.setFont(new Font("Oswald",Font.PLAIN,18));
        withdrawMoney_card_Id.setBorder(Border);

        //Withdrawal Amount
        //-----JLabel-----//
        withdrawMoney_withdrawalAmount = new JLabel("Withdrawal Amount:");
        withdrawMoney_withdrawalAmount.setFont(new Font("Oswald",Font.PLAIN,16));
        withdrawMoney_withdrawalAmount.setBounds(70,143,150,20);
        //-----JTextField-----//
        withdrawMoney_withdrawal_Amount = new JTextField();
        withdrawMoney_withdrawal_Amount.setBounds(223,139,255,32);
        withdrawMoney_withdrawal_Amount.setFont(new Font("Rubik",Font.PLAIN,18));
        withdrawMoney_withdrawal_Amount.setBorder(Border);

        //PIN Number
        //-----JLabel-----//
        withdrawMoney_pinNumber = new JLabel("PIN Number:");
        withdrawMoney_pinNumber.setFont(new Font("Oswald",Font.PLAIN,16));
        withdrawMoney_pinNumber.setBounds(70,189,95,20);
        //-----JTextField-----//
        withdrawMoney_pin_Number = new JTextField();
        withdrawMoney_pin_Number.setBounds(170,185,307,32);
        withdrawMoney_pin_Number.setFont(new Font("Oswald",Font.PLAIN,18));
        withdrawMoney_pin_Number.setBorder(Border);

        //WithDrawal Date
        //-----JLabel-----//
        withdrawMoney_withdrawalDate = new JLabel("Withdrawal Date:");
        withdrawMoney_withdrawalDate.setFont(new Font("Oswald",Font.PLAIN,16));
        withdrawMoney_withdrawalDate.setBounds(70,235,125,22);
        //-----JComboBox-----//
        //<--Year-->
        String[] year_of_withdrawalDate = {"2010","2011","2012","2013","2014","2015",
                "2016","2017","2018","2019","2020","2021","2022","2023"};
        withdrawDate_year = new JComboBox<String>(year_of_withdrawalDate);
        withdrawDate_year.setFont(new Font("Oswald", Font.PLAIN, 15));
        withdrawDate_year.setBounds(201,236,70,24);
        //<--Month-->
        String[] month_of_withdrawalDate = {"January","February","March","April","May",
                "June","July","August","September","October","November","December"};
        withdrawDate_month = new JComboBox<String>(month_of_withdrawalDate);
        withdrawDate_month.setFont(new Font("Oswald", Font.PLAIN, 15));
        withdrawDate_month.setBounds(287,236,95,24);

        //<--Day-->
        String[] day_of_withdrawalDate = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14",
                "15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        withdrawDate_day = new JComboBox<String>(day_of_withdrawalDate);
        withdrawDate_day.setFont(new Font("Oswald", Font.PLAIN, 15));
        withdrawDate_day.setBounds(400,236,50,24);

        //Display Details Button
        withdrawMoney_display_Details = new JButton("Display Details");
        withdrawMoney_display_Details.setFocusable(false);
        withdrawMoney_display_Details.setBounds(18,300,122,32);
        withdrawMoney_display_Details.addActionListener(this);

        //Draw Out Button
        //-----JButton-----//
        withdrawMoney_draw_out = new JButton("Draw Out");
        withdrawMoney_draw_out.setFocusable(false);
        withdrawMoney_draw_out.setBounds(265,300,90,32);
        withdrawMoney_draw_out.addActionListener(this);

        //Back Button
        //-----JButton-----//
        withdrawMoney_back = new JButton("Back");
        withdrawMoney_back.setFocusable(false);
        withdrawMoney_back.setBounds(452,300,90,32);
        withdrawMoney_back.addActionListener(this);

        //Clear
        withdrawMoney_clear = new JButton("Clear");
        withdrawMoney_clear.setFocusable(false);
        withdrawMoney_clear.setBounds(362,300,82,32);
        withdrawMoney_clear.addActionListener(this);

        //Get Card ID
        withdrawMoney_get_card_Id = new JButton("Get Card ID");
        withdrawMoney_get_card_Id.setFocusable(false);
        withdrawMoney_get_card_Id.setBounds(145,300,115,32);
        withdrawMoney_get_card_Id.addActionListener(this);

        //---ADDING COMPONENTS TO THE PANEL---//
        //Title Component
        withdrawMoney_panel.add(withdrawMoney_title);
        //SubTitle Component
        withdrawMoney_panel.add(withdrawMoney_subtitle);
        //Card ID Component
        withdrawMoney_panel.add(withdrawMoney_cardId);
        withdrawMoney_panel.add(withdrawMoney_card_Id);
        //Withdrawal Amount Component
        withdrawMoney_panel.add(withdrawMoney_withdrawalAmount);
        withdrawMoney_panel.add(withdrawMoney_withdrawal_Amount);
        //Pin Number Components
        withdrawMoney_panel.add(withdrawMoney_pinNumber);
        withdrawMoney_panel.add(withdrawMoney_pin_Number);
        //WithDrawal Date Components
        withdrawMoney_panel.add(withdrawMoney_withdrawalDate);
        withdrawMoney_panel.add(withdrawDate_day);
        withdrawMoney_panel.add(withdrawDate_month);
        withdrawMoney_panel.add(withdrawDate_year);
        //Display Details Button Component
        withdrawMoney_panel.add(withdrawMoney_display_Details);
        //Drawout Button Component
        withdrawMoney_panel.add(withdrawMoney_draw_out);
        //Back Button Component
        withdrawMoney_panel.add(withdrawMoney_back);
        //Clear Button Component
        withdrawMoney_panel.add(withdrawMoney_clear);
        //Get Card ID Button Component
        withdrawMoney_panel.add(withdrawMoney_get_card_Id);

        //---Setting attributes of frame---//
        withdrawMoney_frame.setIconImage(frameicon.getImage());
        withdrawMoney_frame.setResizable(false);
        withdrawMoney_frame.setSize(575,385);
        withdrawMoney_frame.setDefaultCloseOperation ( withdrawMoney_frame.EXIT_ON_CLOSE);
        withdrawMoney_frame.setVisible(false);

        //---Adding panel to the frame---//
        withdrawMoney_frame.add(withdrawMoney_panel);




        //-----------------------------------------------END OF <WITHDRAW CARD> GUI_CODE----------------------------------------------------------//




        //-----------------------------------------------STARTING OF <SET CREDIT LIMIT> GUI_CODE----------------------------------------------------------//
        //JFrame Object
        setcreditlimit_frame = new JFrame("SIGMA BANK");

        //JPanel Object
        setcreditlimit_panel = new JPanel();
        setcreditlimit_panel.setLayout(null);
        setcreditlimit_panel.setBounds(0,0,575,355);

        //Title
        //-----JLabel-----//
        setcreditlimit_title = new JLabel("Set Credit Limit");
        setcreditlimit_title.setFont(new Font("Oswald",Font.BOLD,24));
        setcreditlimit_title.setBounds(189,5,200,34);

        //SubTitle
        //-----JLabel-----//
        setcreditlimit_subtitle = new JLabel("Enter the Debit Card Details:");
        setcreditlimit_subtitle.setFont(new Font("Oswald",Font.PLAIN,18));
        setcreditlimit_subtitle.setBounds(168,50,240,34);

        //Card ID
        //-----JLabel-----//
        setcreditlimit_cardId = new JLabel("Card ID:");
        setcreditlimit_cardId.setFont(new Font("Oswald",Font.PLAIN,16));
        setcreditlimit_cardId.setBounds(70,97,70,20);
        //-----JTextField-----//
        setcreditlimit_card_Id = new JTextField();
        setcreditlimit_card_Id.setBounds(142,91,335,32);
        setcreditlimit_card_Id.setFont(new Font("Oswald",Font.PLAIN,18));
        setcreditlimit_card_Id.setBorder(Border);

        //New Credit Limit
        //-----JLabel-----//
        setcreditlimit_newCreditLimit = new JLabel("New Credit Limit:");
        setcreditlimit_newCreditLimit.setFont(new Font("Oswald",Font.PLAIN,16));
        setcreditlimit_newCreditLimit.setBounds(70,146,135,22);
        //-----JTextField-----//
        setcreditlimit_new_Credit_Limit = new JTextField();
        setcreditlimit_new_Credit_Limit.setBounds(206,140,275,32);
        setcreditlimit_new_Credit_Limit.setFont(new Font("Oswald",Font.PLAIN,18));
        setcreditlimit_new_Credit_Limit.setBorder(Border);

        //New Grace Period
        //-----JLabel-----//
        setcreditlimit_newGracePeriod = new JLabel("New Grace Period:");
        setcreditlimit_newGracePeriod.setFont(new Font("Oswald",Font.PLAIN,16));
        setcreditlimit_newGracePeriod.setBounds(70,197,135,22);
        //-----JTextField-----//
        setcreditlimit_new_Grace_Period = new JTextField();
        setcreditlimit_new_Grace_Period.setBounds(219,191,265,32);
        setcreditlimit_new_Grace_Period.setFont(new Font("Oswald",Font.PLAIN,18));
        setcreditlimit_new_Grace_Period.setBorder(Border);

        //Set the Credit Limit Button
        setcreditlimit_set_the_credit_limit = new JButton("Set the Credit Limit");
        setcreditlimit_set_the_credit_limit.setFocusable(false);
        setcreditlimit_set_the_credit_limit.setBounds(220,270,150,32);
        setcreditlimit_set_the_credit_limit.addActionListener(this);

        //Display Button
        setcreditlimit_display_details = new JButton("Display Details");
        setcreditlimit_display_details.setFocusable(false);
        setcreditlimit_display_details.setBounds(87,270,122,32);
        setcreditlimit_display_details.addActionListener(this);

        //Clear
        setcreditlimit_clear = new JButton("Clear");
        setcreditlimit_clear.setFocusable(false);
        setcreditlimit_clear.setBounds(380,270,82,32);
        setcreditlimit_clear.addActionListener(this);

        //Back Button
        //-----JButton-----//
        setcreditlimit_back = new JButton("Back");
        setcreditlimit_back.setFocusable(false);
        setcreditlimit_back.setBounds(471,270,82,32);
        setcreditlimit_back.addActionListener(this);

        //---Adding Components to the panel---//
        //Title Component
        setcreditlimit_panel.add(setcreditlimit_title);
        //SubTitle Component
        setcreditlimit_panel.add(setcreditlimit_subtitle);
        //Card ID Component
        setcreditlimit_panel.add(setcreditlimit_cardId);
        setcreditlimit_panel.add(setcreditlimit_card_Id);
        //New Credit Limit Component
        setcreditlimit_panel.add(setcreditlimit_newCreditLimit);
        setcreditlimit_panel.add(setcreditlimit_new_Credit_Limit);
        //New Grace Period Component
        setcreditlimit_panel.add(setcreditlimit_newGracePeriod);
        setcreditlimit_panel.add(setcreditlimit_new_Grace_Period);
        //Set the Credit Limit Button
        setcreditlimit_panel.add(setcreditlimit_set_the_credit_limit);
        //Display Details Button
        setcreditlimit_panel.add(setcreditlimit_display_details);
        //Back Button Component
        setcreditlimit_panel.add(setcreditlimit_back);
        //Clear
        setcreditlimit_panel.add(setcreditlimit_clear);


        //---Setting attributes of frame---//
        setcreditlimit_frame.setIconImage(frameicon.getImage());
        setcreditlimit_frame.setResizable(false);
        setcreditlimit_frame.setSize(575,355);
        setcreditlimit_frame.setDefaultCloseOperation (setcreditlimit_frame.EXIT_ON_CLOSE);
        setcreditlimit_frame.setVisible(false);

        //---Adding panel to the frame---//
        setcreditlimit_frame.add(setcreditlimit_panel);




        //-----------------------------------------------END OF <SET CREDIT LIMIT> GUI_CODE----------------------------------------------------------//




        //-----------------------------------------------STARTING OF <CANCEL CREDIT CARD> GUI_CODE----------------------------------------------------------//
        //JFrame Object
        cancelCreditCardframe = new JFrame("SIGMA BANK");

        //JPanel Object
        cancelCreditCard_panel = new JPanel();
        cancelCreditCard_panel.setBounds(0,0,575,297);
        cancelCreditCard_panel.setLayout(null);

        //Title
        cancelCreditcard_title = new JLabel("Cancel Credit Card");
        cancelCreditcard_title.setFont(new Font("Oswald",Font.BOLD,24));
        cancelCreditcard_title.setBounds(176,5,255,34);

        //Subtitle
        cancelCreditcard_subtitle = new JLabel("Enter the Valid Credit Card ID Detail:");
        cancelCreditcard_subtitle.setFont(new Font("Oswald",Font.PLAIN,18));
        cancelCreditcard_subtitle.setBounds(138,50,300,25);

        //Card ID
        //-----JLabel-----//
        cancelCreditcard_creditCardId = new JLabel("Credit Card ID:");
        cancelCreditcard_creditCardId.setFont(new Font("Oswald",Font.PLAIN,16));
        cancelCreditcard_creditCardId.setBounds(225,97,114,22);
        //-----JTextField-----//
        cancelCreditcard_creditCard_Id = new JTextField();
        cancelCreditcard_creditCard_Id.setFont(new Font("Oswald",Font.PLAIN,18));
        cancelCreditcard_creditCard_Id.setBounds(114,130,335,32);
        cancelCreditcard_creditCard_Id.setBorder(Border);
        cancelCreditcard_creditCard_Id.setHorizontalAlignment(JTextField.CENTER);
        cancelCreditcard_creditCard_Id.setCaretPosition(cancelCreditcard_creditCard_Id.getText().length() / 2);


        //Cancel Credit Card
        //-----JButton-----//
        cancelCreditcard_cancel = new JButton("Cancel Credit Card");
        cancelCreditcard_cancel.setFocusable(false);
        cancelCreditcard_cancel.setBounds(218,217,145,32);
        cancelCreditcard_cancel.addActionListener(this);

        //Clear
        cancelCreditcard_clear = new JButton("Clear");
        cancelCreditcard_clear.setFocusable(false);
        cancelCreditcard_clear.setBounds(372,217,82,32);
        cancelCreditcard_clear.addActionListener(this);

        //Back Button
        //-----JButton-----//
        cancelCreditcard_back = new JButton("Back");
        cancelCreditcard_back.setFocusable(false);
        cancelCreditcard_back.setBounds(463,217,90,32);
        cancelCreditcard_back.addActionListener(this);

        //Display Details Button
        //-----JButton-----//
        cancelCreditcard_display = new JButton("Display Details");
        cancelCreditcard_display.setFocusable(false);
        cancelCreditcard_display.setBounds(64,217,145,32);
        cancelCreditcard_display.addActionListener(this);

        //---Adding Components to the panel---//
        //Title Component
        cancelCreditCard_panel.add(cancelCreditcard_title);
        //SubTitle Component
        cancelCreditCard_panel.add(cancelCreditcard_subtitle);
        //Credit Card ID
        cancelCreditCard_panel.add(cancelCreditcard_creditCardId);
        cancelCreditCard_panel.add(cancelCreditcard_creditCard_Id);
        //Clear
        cancelCreditCard_panel.add(cancelCreditcard_clear);
        //Back Button Component
        cancelCreditCard_panel.add(cancelCreditcard_back);
        //Cancel Credit Card
        cancelCreditCard_panel.add(cancelCreditcard_cancel);
        //Display Details Button
        cancelCreditCard_panel.add(cancelCreditcard_display);

        //---Setting attributes of frame---//
        cancelCreditCardframe.setIconImage(frameicon.getImage());
        cancelCreditCardframe.setResizable(false);
        cancelCreditCardframe.setSize(575,297);
        cancelCreditCardframe.setDefaultCloseOperation (cancelCreditCardframe.EXIT_ON_CLOSE);
        cancelCreditCardframe.setVisible(false);

        //---Adding panel to the frame---//
        cancelCreditCardframe.add(cancelCreditCard_panel);




        //-----------------------------------------------END OF <CANCEL CREDIT CARD> GUI_CODE----------------------------------------------------------//
    }


    //----------------------------------------<END OF CONSTRUCTOR>----------------------------------------//


    //-----------------------------------------------STARTING OF <ADDING FUNCTION BY IMPLMENTING ACTIONLISTENER METHOD> CODE-----------------------------------------------//
    public void actionPerformed(ActionEvent e)
    {
        //--------------------FUNCTION FOR CREDIT CARD--------------------//
        //ADD BUTTON
        if (e.getSource() == main_frame_add_credit_card) {
            credit_card_frame.setVisible(true);
            main_frame.setVisible(false);
        }
        //BACK BUTTON
        if (e.getSource() == credit_card_frame_back) {
            credit_card_frame.setVisible(false);
            main_frame.setVisible(true);
        }
        //CLEAR BUTTON
        if (e.getSource() == credit_card_frame_clear) {
            credit_card_frame_client_Name.setText("");
            credit_card_frame_card_Id.setText("");
            credit_card_frame_bank_Account.setText("");
            credit_card_frame_cvc_Number.setText("");
            credit_card_frame_balance_Amount.setText("");
            credit_card_frame_interest_Rate.setText("");
            credit_card_frame_issuer_Bank.setText("");

            String[] refresh_year_of_Credit_Card_Frame = {"2010", "2011", "2012", "2013", "2014",
                    "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023"};
            DefaultComboBoxModel<String> new_Model_of_Year_of_Credit_Card_Frame = new DefaultComboBoxModel<>(refresh_year_of_Credit_Card_Frame);
            credit_card_expiration_frame_year.setModel(new_Model_of_Year_of_Credit_Card_Frame);

            String[] refresh_month_of_Credit_Card_Frame = {"January", "February", "March", "April",
                    "May", "June", "July", "August", "September", "October", "November", "December"};
            DefaultComboBoxModel<String> new_Model_of_Month_of_Credit_Card_Frame = new DefaultComboBoxModel<>(refresh_month_of_Credit_Card_Frame);
            credit_card_frame_expiration_month.setModel(new_Model_of_Month_of_Credit_Card_Frame);

            String[] refresh_day_of_Credit_Card_Frame = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
                    "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32"};
            DefaultComboBoxModel<String> new_Model_of_Day_of_Credit_Card_Frame = new DefaultComboBoxModel<>(refresh_day_of_Credit_Card_Frame);
            credit_card_frame_expiration_day.setModel(new_Model_of_Day_of_Credit_Card_Frame);
        }
        //APPLY BUTTON
        if (e.getSource() == credit_card_frame_apply) {
            try {
                int cardID = Integer.parseInt(credit_card_frame_card_Id.getText());
                int balanceAmount = Integer.parseInt(credit_card_frame_balance_Amount.getText());
                String clientName = credit_card_frame_client_Name.getText();
                String issuerBank = credit_card_frame_issuer_Bank.getText();
                String bankAccount = credit_card_frame_bank_Account.getText();
                int cVcNumber = Integer.parseInt(credit_card_frame_cvc_Number.getText());
                Double InterestRate = Double.parseDouble(credit_card_frame_interest_Rate.getText());
                String ExpirationDate = credit_card_frame_expiration_month.getSelectedItem() +
                        " " + credit_card_frame_expiration_day.getSelectedItem() + ", " +
                        credit_card_expiration_frame_year.getSelectedItem();

                if(credit_card_frame_card_Id.getText().isEmpty() ||
                        credit_card_frame_balance_Amount.getText().isEmpty() ||
                        credit_card_frame_client_Name.getText().isEmpty() ||
                        credit_card_frame_issuer_Bank.getText().isEmpty() ||
                        credit_card_frame_bank_Account.getText().isEmpty() ||
                        credit_card_frame_cvc_Number.getText() .isEmpty() ||
                        credit_card_frame_interest_Rate.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(credit_card_frame, "Please fill out all the required fields with correct Format.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else if (isCreditCardExits(cardID))
                {
                    JOptionPane.showMessageDialog(credit_card_frame, "The Card ID:\"" + cardID + "\" already Exists.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    credit_card_frame_card_Id.setText("");

                    String[] refresh_year_of_Credit_Card_Frame = {"2010", "2011", "2012", "2013", "2014", "2015",
                            "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023"};
                    DefaultComboBoxModel<String> new_Model_of_Year_of_Credit_Card_Frame = new DefaultComboBoxModel<>(refresh_year_of_Credit_Card_Frame);
                    credit_card_expiration_frame_year.setModel(new_Model_of_Year_of_Credit_Card_Frame);

                    String[] refresh_month_of_Credit_Card_Frame = {"January", "February", "March", "April", "May",
                            "June", "July", "August", "September", "October", "November", "December"};
                    DefaultComboBoxModel<String> new_Model_of_Month_of_Credit_Card_Frame = new DefaultComboBoxModel<>(refresh_month_of_Credit_Card_Frame);
                    credit_card_frame_expiration_month.setModel(new_Model_of_Month_of_Credit_Card_Frame);

                    String[] refresh_day_of_Credit_Card_Frame = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
                            "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32"};
                    DefaultComboBoxModel<String> new_Model_of_Day_of_Credit_Card_Frame = new DefaultComboBoxModel<>(refresh_day_of_Credit_Card_Frame);
                    credit_card_frame_expiration_day.setModel(new_Model_of_Day_of_Credit_Card_Frame);
                }
                else if (balanceAmount <= 0)
                {
                    JOptionPane.showMessageDialog(credit_card_frame, "Balance amount cannot be 0 or less than 0.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    credit_card_frame_balance_Amount.setText("");
                }
                else if (InterestRate <= 0)
                {
                    JOptionPane.showMessageDialog(credit_card_frame, "Interest Rate cannot be 0 or less than 0.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    credit_card_frame_interest_Rate.setText("");
                }
                else if (cVcNumber  <= 0)
                {
                    JOptionPane.showMessageDialog(credit_card_frame, "CVC Number cannot be 0 or less than 0.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    credit_card_frame_cvc_Number.setText("");
                }
                else if (cardID <= 0)
                {
                    JOptionPane.showMessageDialog(credit_card_frame, "Card ID cannot be 0 or less than 0.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    credit_card_frame_card_Id.setText("");
                }
                else
                {
                    Bank_Card new1_credit_Card = new Credit_Card(cardID, balanceAmount, clientName, issuerBank, bankAccount, cVcNumber, InterestRate, ExpirationDate); //Up casting
                    bankcard.add(new1_credit_Card);
                    JOptionPane.showMessageDialog(credit_card_frame, "Your New Credit Card ID:\"" + cardID + "\" is created.","CONGRATULATIONS",JOptionPane.INFORMATION_MESSAGE);
                    credit_card_frame_client_Name.setText("");
                    credit_card_frame_card_Id.setText("");
                    credit_card_frame_bank_Account.setText("");
                    credit_card_frame_cvc_Number.setText("");
                    credit_card_frame_balance_Amount.setText("");
                    credit_card_frame_interest_Rate.setText("");
                    credit_card_frame_issuer_Bank.setText("");

                    String[] refresh_year_of_Credit_Card_Frame = {"2010", "2011", "2012", "2013", "2014",
                            "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023"};
                    DefaultComboBoxModel<String> new_Model_of_Year_of_Credit_Card_Frame = new DefaultComboBoxModel<>(refresh_year_of_Credit_Card_Frame);
                    credit_card_expiration_frame_year.setModel(new_Model_of_Year_of_Credit_Card_Frame);

                    String[] refresh_month_of_Credit_Card_Frame = {"January", "February", "March", "April", "May",
                            "June", "July", "August", "September", "October", "November", "December"};
                    DefaultComboBoxModel<String> new_Model_of_Month_of_Credit_Card_Frame = new DefaultComboBoxModel<>(refresh_month_of_Credit_Card_Frame);
                    credit_card_frame_expiration_month.setModel(new_Model_of_Month_of_Credit_Card_Frame);

                    String[] refresh_day_of_Credit_Card_Frame = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
                            "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32"};
                    DefaultComboBoxModel<String> new_Model_of_Day_of_Credit_Card_Frame = new DefaultComboBoxModel<>(refresh_day_of_Credit_Card_Frame);
                    credit_card_frame_expiration_day.setModel(new_Model_of_Day_of_Credit_Card_Frame);
                }
            }
            catch (NumberFormatException error)
            {
                JOptionPane.showMessageDialog(credit_card_frame, "Please, fill out all the fields with correct Format.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        //DISPLAY DETAILS BUTTON
        if (e.getSource() == credit_card_frame_display_details) {
            try {
                for (Bank_Card display_credit_card_details : bankcard) {
                    if (display_credit_card_details instanceof Credit_Card) {
                        Credit_Card cdccard = (Credit_Card) display_credit_card_details; //Down casting
                        System.out.println("*------------------------------------*"); // For Line Break
                        System.out.println("CREDIT CARD USER DETAILS:");
                        System.out.println("*------------------------------------*"); // For Line Break
                        System.out.println("Card ID: " + cdccard.getcardID());
                        System.out.println("Balance Amount: " + cdccard.getbalanceAmount());
                        System.out.println("Client Name: " + cdccard.getclientName());
                        System.out.println("Issuer Bank: " + cdccard.getissuerBank());
                        System.out.println("Bank Account: " + cdccard.getbankAccount());
                        System.out.println("CVC Number: " + cdccard.getcVcNumber());
                        System.out.println("Interest Rate: " + cdccard.getInterestRate());
                        System.out.println("Expiration Date: " + cdccard.getExpirationDate());
                        System.out.println(); // For Line Break
                    }
                }
            } catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(credit_card_frame, "ERROR", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        //--------------------FUNCTION FOR DEBIT CARD--------------------//
        //ADD BUTTON
        if (e.getSource() == main_frame_add_debit_card) {
            debit_card_frame.setVisible(true);
            main_frame.setVisible(false);
        }
        //BACK BUTTON
        if (e.getSource() == debit_card_frame_back) {
            debit_card_frame.setVisible(false);
            main_frame.setVisible(true);
        }
        //CLEAR BUTTON
        if (e.getSource() == debit_card_frame_clear) {
            debit_card_frame_client_Name.setText("");
            debit_card_frame_card_Id.setText("");
            debit_card_frame_bank_Account.setText("");
            debit_card_frame_pin_Number.setText("");
            debit_card_frame_issuer_Bank.setText("");
            debit_card_frame_balance_Amount.setText("");
        }
        //APPLY BUTTON
        if (e.getSource() == debit_card_frame_apply)
        {
            try
            {
                String clientName = debit_card_frame_client_Name.getText();
                int cardID = Integer.parseInt(debit_card_frame_card_Id.getText());
                String bankAccount = debit_card_frame_bank_Account.getText();
                int pinNumber = Integer.parseInt(debit_card_frame_pin_Number.getText());
                String issuerBank = debit_card_frame_issuer_Bank.getText();
                int balanceAmount = Integer.parseInt(debit_card_frame_balance_Amount.getText());

                if(isDebitCardIdExists(cardID))
                {
                    JOptionPane.showMessageDialog(debit_card_frame, "The Card ID:\"" + cardID + "\" already Exists.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    debit_card_frame_card_Id.setText("");
                }
                else if (balanceAmount <= 0)
                {
                    JOptionPane.showMessageDialog(debit_card_frame, "Balance amount cannot be 0 or less than 0.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    debit_card_frame_balance_Amount.setText("");
                }
                else if (pinNumber <= 0)
                {
                    JOptionPane.showMessageDialog(credit_card_frame, "Pin Number cannot be 0 or less than 0.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    debit_card_frame_pin_Number.setText("");
                }
                else if (cardID <= 0)
                {
                    JOptionPane.showMessageDialog(credit_card_frame, "Card ID cannot be 0 or less than 0.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    credit_card_frame_card_Id.setText("");
                }
                else
                {
                    Bank_Card new1_debit_Card = new Debit_Card(balanceAmount, cardID, bankAccount, issuerBank, clientName, pinNumber); //Up casting
                    bankcard.add(new1_debit_Card);
                    JOptionPane.showMessageDialog(debit_card_frame, "Your New Debit Card ID:\"" + cardID + "\" is created.","CONGRATULATIONS",JOptionPane.INFORMATION_MESSAGE);
                    debit_card_frame_client_Name.setText("");
                    debit_card_frame_card_Id.setText("");
                    debit_card_frame_bank_Account.setText("");
                    debit_card_frame_pin_Number.setText("");
                    debit_card_frame_issuer_Bank.setText("");
                    debit_card_frame_balance_Amount.setText("");
                }
            }
            catch(NumberFormatException error)
            {
                JOptionPane.showMessageDialog(debit_card_frame, "Please, fill out all the fields with correct Format.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        //DISPLAY DETAILS BUTTON
        if (e.getSource() == debit_card_frame_display_details)
        {
            try {
                for (Bank_Card display_debit_card_details : bankcard) {
                    if (display_debit_card_details instanceof Debit_Card) {
                        Debit_Card dbcard = (Debit_Card) display_debit_card_details; //Down casting
                        System.out.println("*------------------------------------*"); // For Line Break
                        System.out.println("DEBIT CARD USER DETAILS:");
                        System.out.println("*------------------------------------*"); // For Line Break
                        System.out.println("Client Name: " + dbcard.getclientName());
                        System.out.println("Card ID: " + dbcard.getcardID());
                        System.out.println("Bank Account: " + dbcard.getbankAccount());
                        System.out.println("Pin Number: " + dbcard.getPinNumber());
                        System.out.println("Issuer Bank: " + dbcard.getissuerBank()); //Problem
                        System.out.println("Balance Amount: " + dbcard.getbalanceAmount());
                        System.out.println(); // For Line Break
                    }
                }
            } catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(debit_card_frame, "Please, fill out all the fields with correct Format.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        //--------------------FUNCTION FOR  WITHDRAW MONEY--------------------//
        //ADD BUTTON
        if (e.getSource() == main_frame_withdraw_money) {
            withdrawMoney_frame.setVisible(true);
            main_frame.setVisible(false);
        }
        //BACK BUTTON
        if (e.getSource() == withdrawMoney_back) {
            withdrawMoney_frame.setVisible(false);
            main_frame.setVisible(true);
        }
        //CLEAR BUTTON
        if (e.getSource() == withdrawMoney_clear) {
            withdrawMoney_card_Id.setText("");
            withdrawMoney_withdrawal_Amount.setText("");
            withdrawMoney_pin_Number.setText("");

            String[] refresh_year_of_withdraw_frame = {"2010", "2011", "2012", "2013", "2014", "2015",
                    "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023"};
            DefaultComboBoxModel<String> new_Model_of_Year_of_withdraw_frame = new DefaultComboBoxModel<>(refresh_year_of_withdraw_frame);
            withdrawDate_year.setModel(new_Model_of_Year_of_withdraw_frame);

            String[] refresh_month_of_withdraw_frame = {"January", "February", "March", "April", "May", "June",
                    "July", "August", "September", "October", "November", "December"};
            DefaultComboBoxModel<String> new_Model_of_Month_of_withdraw_frame = new DefaultComboBoxModel<>(refresh_month_of_withdraw_frame);
            withdrawDate_month.setModel(new_Model_of_Month_of_withdraw_frame);

            String[] refresh_day_of_withdraw_frame = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
                    "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32"};
            DefaultComboBoxModel<String> new_Model_of_Day_of_withdraw_frame = new DefaultComboBoxModel<>(refresh_day_of_withdraw_frame);
            withdrawDate_day.setModel(new_Model_of_Day_of_withdraw_frame);
        }
        //GET CARD ID BUTTON
        if (e.getSource() == withdrawMoney_get_card_Id)
        {
            try {
                int cardID = Integer.parseInt(withdrawMoney_card_Id.getText());
                boolean cardIdFound = false;
                for (Bank_Card verify_cardID : bankcard)
                {
                    if(verify_cardID instanceof Debit_Card)
                    {
                        if (verify_cardID.getcardID() == cardID)
                        {
                            JOptionPane.showMessageDialog(withdrawMoney_frame,  "Card ID: \"" + cardID +
                                    "\" found!" + "\n" + "Current Balance Amount: " + "Rs." + verify_cardID.getbalanceAmount() +
                                    "\n" + "Client Name: " + verify_cardID.getclientName() + "\n" + "Bank Account: " +verify_cardID.getbankAccount() +
                                    "\n" + "Issuer Bank: " + verify_cardID.getissuerBank(), "ID FOUND", JOptionPane.INFORMATION_MESSAGE);
                            cardIdFound = true;
                            break;
                        }
                    }
                }
                if (!cardIdFound)
                {
                    JOptionPane.showMessageDialog(withdrawMoney_frame, "Sorry, your Debit Card ID:\"" + cardID + "\" not found!", "ID NOT FOUND", JOptionPane.ERROR_MESSAGE);
                    withdrawMoney_card_Id.setText("");
                }
            }
            catch (NumberFormatException error)
            {
                JOptionPane.showMessageDialog(withdrawMoney_frame, "Please enter Debit Card ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        //DRAW OUT BUTTON
        if (e.getSource() == withdrawMoney_draw_out)
        {
             try
             {
                int pinNumber = Integer.parseInt(withdrawMoney_pin_Number.getText());
                int Withdrawalamount = Integer.parseInt(withdrawMoney_withdrawal_Amount.getText());
                int cardID = Integer.parseInt(withdrawMoney_card_Id.getText());
                String Dateofwithdrawal = withdrawDate_month.getSelectedItem() + " "
                        + withdrawDate_day.getSelectedItem() + ", " +
                        withdrawDate_year.getSelectedItem();
                boolean foundcard = false;
                for(Bank_Card carddd : bankcard)
                {
                    if (carddd.getcardID() == cardID)
                    {
                        foundcard = true;
                        if(carddd instanceof Debit_Card)
                        {
                            Debit_Card card = (Debit_Card) carddd; //Down casting
                            if (card.getPinNumber() == pinNumber)
                            {
                                int balanceAmount = card.getbalanceAmount() - Withdrawalamount;
                                if (Withdrawalamount > card.getbalanceAmount())
                                {
                                    JOptionPane.showMessageDialog(withdrawMoney_frame, "You have Insufficient Balance.", "Error", JOptionPane.ERROR_MESSAGE);
                                    withdrawMoney_withdrawal_Amount.setText("");
                                }
                                else if(Withdrawalamount < 0)
                                {
                                    JOptionPane.showMessageDialog(withdrawMoney_frame, "Withdrawal Amount cannot be less than 0 or 0.", "Error", JOptionPane.ERROR_MESSAGE);
                                    withdrawMoney_withdrawal_Amount.setText("");
                                }
                                else if(Withdrawalamount == 0)
                                {
                                    JOptionPane.showMessageDialog(withdrawMoney_frame, "Withdrawal Amount cannot be 0.", "Error", JOptionPane.ERROR_MESSAGE);
                                    withdrawMoney_withdrawal_Amount.setText("");
                                }
                                else
                                {
                                    card.setbalanceAmount(balanceAmount);
                                    card.setDateOfWithdrawal(Dateofwithdrawal);
                                    card.setWithdrawalamount(Withdrawalamount);
                                    JOptionPane.showMessageDialog(withdrawMoney_frame, "Card ID:\"" + cardID + "\"" + "\n" + "Rs." + Withdrawalamount + "/-" + "" +
                                            " is WithDrawn." + "\n" + "Remaining Balance: " + "Rs." + balanceAmount, "AMOUNT WITHDRAWN SUCCESSFULLY", JOptionPane.INFORMATION_MESSAGE);
                                    withdrawMoney_card_Id.setText("");
                                    withdrawMoney_withdrawal_Amount.setText("");
                                    withdrawMoney_pin_Number.setText("");
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(withdrawMoney_frame, "Your Pin Number is Incorrect.", "INCORRECT PIN", JOptionPane.ERROR_MESSAGE);
                                withdrawMoney_pin_Number.setText("");
                            }
                        }
                    }
                }
                if(!foundcard)
                {
                    JOptionPane.showMessageDialog(withdrawMoney_frame, "Your Debit Card ID:\"" + cardID + "\" is Incorrect.", "INCORRECT ID", JOptionPane.ERROR_MESSAGE);
                    withdrawMoney_card_Id.setText("");
                }
             }
             catch(NumberFormatException error)
             {
                 JOptionPane.showMessageDialog(withdrawMoney_frame, "Please, fill out all the fields with correct Format.", "Error", JOptionPane.ERROR_MESSAGE);
             }
        }
        //DISPLAY DETAILS BUTTON
        if (e.getSource() == withdrawMoney_display_Details)
        {
            try {
                for(Bank_Card card : bankcard)
                {
                    if (card instanceof Debit_Card) {
                        Debit_Card cardd = (Debit_Card) card; //Down Casting
                        System.out.println("*------------------------------------------------*"); // For Line Break
                        System.out.println("DEBIT CARD USER DETAILS AFTER WITHDRAWING MONEY:");
                        System.out.println("*------------------------------------------------*"); // For Line Break
                        System.out.println("Client Name: " + cardd.getclientName());
                        System.out.println("Card ID: " + cardd.getcardID());
                        System.out.println("Bank Account: " + cardd.getbankAccount());
                        System.out.println("Issuer Bank: " + cardd.getissuerBank());
                        System.out.println("Balance Amount: " + cardd.getbalanceAmount());
                        System.out.println("Withdrawn Amount: " + cardd.getWithdrawalamount()); //problem
                        System.out.println("Withdrawn Date: " + cardd.getDateOfWithdrawal()); //problem
                        System.out.println(); // For Line Break
                    }
                }
            }
            catch (NumberFormatException error)
            {
                JOptionPane.showMessageDialog(withdrawMoney_frame, "ERROR", "Error", JOptionPane.ERROR_MESSAGE);
                withdrawMoney_card_Id.setText("");
            }
        }

        //--------------------FUNCTION FOR  SET CREDIT LIMIT--------------------//
        //ADD BUTTON
        if (e.getSource() == main_frame_set_credit_limit) {
            setcreditlimit_frame.setVisible(true);
            main_frame.setVisible(false);
        }
        //BACK BUTTON
        if (e.getSource() == setcreditlimit_back) {
            main_frame.setVisible(true);
            setcreditlimit_frame.setVisible(false);
        }
        //CLEAR BUTTON
        if (e.getSource() == setcreditlimit_clear) {
            setcreditlimit_new_Grace_Period.setText("");
            setcreditlimit_new_Credit_Limit.setText("");
            setcreditlimit_card_Id.setText("");
        }
        //SET CREDIT LIMIT BUTTON
        if (e.getSource() == setcreditlimit_set_the_credit_limit)
        {
            try
            {
                int cardID = Integer.parseInt(setcreditlimit_card_Id.getText());
                int CreditLimit = Integer.parseInt(setcreditlimit_new_Credit_Limit.getText());
                String GracePeriod = setcreditlimit_new_Grace_Period.getText();
                if (setcreditlimit_card_Id.getText().isBlank() ||
                        setcreditlimit_new_Credit_Limit.getText().isBlank() ||
                        setcreditlimit_new_Grace_Period.getText().isBlank() )
                {
                    JOptionPane.showMessageDialog(setcreditlimit_frame, "Please, fill out all the fields with correct Format.", "Error", JOptionPane.ERROR_MESSAGE);
                    setcreditlimit_new_Grace_Period.setText("");
                    setcreditlimit_new_Credit_Limit.setText("");
                    setcreditlimit_card_Id.setText("");
                }
                else
                {
                    boolean cardFound = false;
                    for (Bank_Card setCreditLimit : bankcard)
                    {
                        if (setCreditLimit.getcardID() == cardID && setCreditLimit instanceof Credit_Card)
                        {
                            Credit_Card creditcard = (Credit_Card) setCreditLimit; // Down casting
                             if(creditcard.getCreditLimit() == 0)
                             {
                                 if (CreditLimit <= 0 || Integer.parseInt(GracePeriod) <= 0 || GracePeriod.isBlank()) {
                                JOptionPane.showMessageDialog(setcreditlimit_frame, "Invalid input. Credit limit and grace period cannot be 0 or equal to 0.", "Error", JOptionPane.ERROR_MESSAGE);
                                setcreditlimit_new_Credit_Limit.setText("");
                                setcreditlimit_card_Id.setText("");
                            }
                             else if (CreditLimit <= 2.5 * creditcard.getbalanceAmount())
                                 {
                                     creditcard.setCreditLimit(CreditLimit, GracePeriod);
                                     JOptionPane.showMessageDialog(setcreditlimit_frame, "Credit limit for Card ID:\"" + cardID + "\" updated successfully.");
                                     setcreditlimit_new_Grace_Period.setText("");
                                     setcreditlimit_new_Credit_Limit.setText("");
                                     setcreditlimit_card_Id.setText("");
                                 }
                                 else
                                 {
                                     JOptionPane.showMessageDialog(setcreditlimit_frame, "Exceeding Criteria! Credit Limit can't be Issued.", "Error", JOptionPane.ERROR_MESSAGE);
                                     setcreditlimit_new_Credit_Limit.setText("");
                                 }
                                 cardFound = true;
                                 break;
                             }
                             else
                             {
                                 JOptionPane.showMessageDialog(setcreditlimit_frame, "Sorry, Credit limit can't be Issued again of the Card ID:\"" + cardID + "\"");
                                 setcreditlimit_card_Id.setText("");
                                 cardFound = true;
                                 break;
                             }
                        }
                    }
                    if (!cardFound)
                    {
                        JOptionPane.showMessageDialog(setcreditlimit_frame, "Credit Card with ID:\"" + cardID + "\" not found.", "Error", JOptionPane.ERROR_MESSAGE);
                        setcreditlimit_new_Grace_Period.setText("");
                        setcreditlimit_new_Credit_Limit.setText("");
                        setcreditlimit_card_Id.setText("");
                    }
                }
            }
            catch (Exception error)
            {
                JOptionPane.showMessageDialog(setcreditlimit_frame, "Please, fill out all the fields with correct Format.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
        //DISPLAY BUTTON
        if(e.getSource() == setcreditlimit_display_details)
        {
            try
            {
                for (Bank_Card display_credit_limit : bankcard)
                {
                    if (display_credit_limit instanceof Credit_Card)
                    {
                        setcreditlimit_new_Grace_Period.setText("");
                        setcreditlimit_new_Credit_Limit.setText("");
                        setcreditlimit_card_Id.setText("");
                        System.out.println("*-------------------------------------------------*"); // For Line Break
                        System.out.println("CREDIT CARD USER DETAILS AFTER ADDING CREDIT LIMIT:");
                        System.out.println("*-------------------------------------------------*");
                        System.out.println("Card ID: " + display_credit_limit.getcardID());
                        System.out.println("Balance Amount :" + display_credit_limit.getbalanceAmount());
                        System.out.println("Credit Limit: " + ((Credit_Card) display_credit_limit).getCreditLimit());
                        System.out.println("Grace Period: " + ((Credit_Card) display_credit_limit).getGracePeriod());
                        System.out.println("Client Name: " + display_credit_limit.getclientName());
                        System.out.println("Issuer Bank: " + display_credit_limit.getissuerBank());
                        System.out.println("Bank Account: " + display_credit_limit.getbankAccount());
                        System.out.println("CVC Number: " + ((Credit_Card) display_credit_limit).getcVcNumber());
                        System.out.println("Interest Rate: " + ((Credit_Card) display_credit_limit).getInterestRate());
                        System.out.println("Expiration Date: " + ((Credit_Card) display_credit_limit).getExpirationDate());
                    }
                }
            }
            catch(Exception error)
            {
                JOptionPane.showMessageDialog(setcreditlimit_frame, "Please enter your Credit Card ID in the Field.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        //--------------------FUNCTION FOR CANCEL CREDIT CARD--------------------//
        //ADD BUTTON
        if(e.getSource() == main_frame_Cancel_Credit_Card)
        {
            cancelCreditCardframe.setVisible(true);
            main_frame.setVisible(false);
        }
        //CLEAR BUTTON
        if(e.getSource() == cancelCreditcard_clear)
        {
            cancelCreditcard_creditCard_Id.setText("");
        }
        //BACK BUTTON
        if(e.getSource() == cancelCreditcard_back)
        {
            cancelCreditCardframe.setVisible(false);
            main_frame.setVisible(true);
        }
        //CANCEL CREDIT CARD BUTTON
        if(e.getSource() == cancelCreditcard_cancel)
        {
            try {
                int cardID = Integer.parseInt(cancelCreditcard_creditCard_Id.getText());
                boolean found_creditId = false;
                for (Bank_Card credit_card : bankcard)
                {
                    if(credit_card.getcardID() == cardID)
                    {
                        if(credit_card instanceof Credit_Card)
                        {
                            Credit_Card card = (Credit_Card) credit_card;
                            card.cancelCreditCard();
                            found_creditId = true;
                            JOptionPane.showMessageDialog(cancelCreditCardframe, "Credit Card with: " + cardID + " cancelled successfully.");
                            cancelCreditcard_creditCard_Id.setText("");
                        }
                    }
                }
                if (!found_creditId)
                {
                    JOptionPane.showMessageDialog(cancelCreditCardframe, "Credit Card ID:\"" + cardID + "\" not Found.", "Error", JOptionPane.ERROR_MESSAGE);
                    cancelCreditcard_creditCard_Id.setText("");
                }
            } catch (Exception error) {
                JOptionPane.showMessageDialog(cancelCreditCardframe, "Please Enter Credit Card ID in field.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        //DISPLAY BUTTON
        if(e.getSource() == cancelCreditcard_display)
        {
            try {
                for (Bank_Card card : bankcard) {
                    if (card instanceof Credit_Card) {
                        Credit_Card creditCard = (Credit_Card) card;
                        System.out.println("*------------------------------------*"); // For Line Break
                        System.out.println("CREDIT CARD USER DETAILS:");
                        System.out.println("*------------------------------------*");
                        System.out.println("Card ID: " + creditCard.getcardID());
                        System.out.println("Balance Amount: " + creditCard.getbalanceAmount());
                        System.out.println("Client Name: " + creditCard.getclientName());
                        System.out.println("Issuer Bank: " + creditCard.getissuerBank());
                        System.out.println("Bank Account: " + creditCard.getbankAccount());
                        System.out.println("CVC Number: " + creditCard.getcVcNumber());
                        System.out.println("Interest Rate: " + creditCard.getInterestRate());
                        System.out.println("Expiration Date: " + creditCard.getExpirationDate());
                        System.out.println("New Credit Limit: " + creditCard.getCreditLimit());
                        System.out.println("New Grace Period: " + creditCard.getGracePeriod());
                        System.out.println(); // For Line Break
                        cancelCreditcard_creditCard_Id.setText("");
                    }
                }
            } catch (NumberFormatException error) {
                JOptionPane.showMessageDialog(cancelCreditCardframe, "Please Enter Valid Credit Card ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    //Function to Check the Existing Card ID <CREDIT CARD>
    private boolean isCreditCardExits(int cardID)
    {
        boolean is_creditcard_exists = false; //Flag Declared
        for(Bank_Card cdc : bankcard)
        {
            if(cdc instanceof Credit_Card && cdc.getcardID() == cardID)
            {
                is_creditcard_exists = true;
                break;
            }
        }
        return is_creditcard_exists;
    }

    //Function to Check the Existing Card ID <DEBIT CARD>
    private boolean isDebitCardIdExists(int cardID)
    {
        boolean is_debitcard_exists = false; //Flag Declared
        for (Bank_Card dbc : bankcard)
        {
            if(dbc instanceof Debit_Card && dbc.getcardID() == cardID)
            {
                is_debitcard_exists = true;
                break;
            }

        }
        return is_debitcard_exists;
    }

    //MAIN METHOD
    public static void main(String[] args)
    {
        //CALLING CONSTRUCTOR OF CLASS BY MAKING NEW OBJECT OF CLASS
        new BankGUI();
    }
}