package gr.aueb.cf.bankapp.model;

/**
 * In this Account you have the ability to withdraw amounts larger than your balance.
 */

public class OverdraftAccount {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    /*
    Constructors
     */
    public OverdraftAccount(){}
    public OverdraftAccount(int id, String iban, String firstname, String lastname, double balance, String ssn) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
        this.ssn = ssn;
    }

    /*
    Getters
     */
    public int getId() {
        return id;
    }

    public String getIban() {
        return iban;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public double getBalance() {
        return balance;
    }

    /*
    Setters
     */
    public void setId(int id) {
        this.id = id;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /*
    SSN Checker
     */

    /**
     * Checks if the ssn is valid.
     * @param ssn       ssn to be checked.
     * @return
     */
    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }

    /*
    Public APIs
     */

    /**
     * Deposits a chosen amount.
     * @param amount        amount to be deposited.
     * @throws Exception
     */
    public void deposit(double amount) throws Exception {
        try {
            if (amount < 0) {
                throw new Exception("Amount is negative ERROR");
            }
            balance += amount;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Withdraws an amount.
     * @param amount        amount to be withdrawn.
     * @param ssn           Account's SSN.
     * @throws Exception
     */
    public void withdraw(double amount, String ssn) throws Exception {
        double owedMoney = balance - amount;
        try{
            if (!isSsnValid(ssn)) {
                throw new Exception("Incorrect SSN");
            }
            if (amount > balance){
                System.out.println("New balance: " + owedMoney);
            }

        } catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * Returns Account's info.
     * @return
     */
    public String accountToString() {
        return "(" + id + "\t" + iban + "\t" + firstname + "\t" + lastname +  "\t" +
                ssn + "\t" + balance + ")";
    }
}
