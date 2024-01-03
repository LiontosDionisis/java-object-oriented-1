package gr.aueb.cf.bankapp.model;

/**
 * Normal Account.
 */
public class JointAccount {
    private int id;
    private String iban;
    private String firstname;
    private String lastname;
    private String ssn;
    private double balance;

    public JointAccount() {

    }

    public JointAccount(int id, String iban, String firstname, String lastname, String ssn, double balance) {
        this.id = id;
        this.iban = iban;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.balance = balance;
    }

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

    public String getSsn() {
        return ssn;
    }

    public double getBalance() {
        return balance;
    }

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

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /*
    Public API - Services
     */

    /**
     * Deposits a certain amount of money intro account's balance.
     * @param amount    the amount of money to be deposited.
     * @throws Exception
     */
    public void deposit(double amount) throws Exception {
        try {
            if (amount < 0) {
                throw new Exception("Negative amount error");
            }
            balance += amount;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }

    /**
     * Withdraws an amount from an account
     * @param amount        amount to be withdrawn
     * @param ssn           account's ssn
     * @throws Exception
     */

    public void withdraw(double amount, String ssn) throws Exception {
        try{
            if (amount > balance) {
                throw new Exception("Insufficient balance");
            }
            if (!isSsnValid(ssn)){
                throw new Exception("Wrong SSN");
            }
            balance -= amount;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

    }

    /**
     * Returns the account's balance.
     * @return
     */
    public double getAccountBalance() {
        return balance;     // return getBalance();
    }

    /**
     *
     * @return
     */
    public String accountToString() {
        return "(" + id + "\t" + iban + "\t" + firstname + "\t" + lastname +  "\t" +
                ssn + "\t" + balance + ")";
    }

    /*
    Not part of the Public API
     */
    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }
}
