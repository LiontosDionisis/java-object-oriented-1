package gr.aueb.cf.bankapp;

import gr.aueb.cf.bankapp.model.OverdraftAccount;
import gr.aueb.cf.bankapp.model.JointAccount;

public class Main {
    public static void main(String[] args) throws Exception {
        OverdraftAccount o1 = new OverdraftAccount(1, "GR0543", "Dimitris", "Papadopoulos", 50000.0, "0543123");
        OverdraftAccount o2 = new OverdraftAccount(2, "GR0654", "Michalis", "Genitakis", 5343.0, "0654123");
        JointAccount j1 = new JointAccount(3,"GR0345", "Kwnstantinos", "Michail", "878967868", 1000.0);
        JointAccount j2 = new JointAccount(4,"GR0876", "Loukas", "Papamichail", "87543547868", 1500.0);

        try{
            o1.deposit(3000);
            System.out.println("Amount has been deposited to o1\n");

            o2.withdraw(7000, "0654123");
            System.out.println("Withdrawal complete!\n");

            j2.withdraw(2000,"87543547868");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
