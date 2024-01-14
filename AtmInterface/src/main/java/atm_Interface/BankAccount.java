/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm_Interface;
/**
 *
 * @author Kulan
 */
import javax.swing.JOptionPane;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 1000.0;
    }

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            JOptionPane.showMessageDialog(null,"+R"+amount+" into account\nDeposit of R" + amount + " Successful","Successful Transaction", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,"Invalid amount\nDeposit amount must be positive","Unsuccessful Transaction", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void withdraw(double amount) {
        if (amount < 0) {
           JOptionPane.showMessageDialog(null,"Invalid input(WITHDRAWAL AMOUNT MUST BE POSITIVE)","Unsuccessful Transaction", JOptionPane.ERROR_MESSAGE);
        } else if (amount <= balance) {
            this.balance -= amount;
            JOptionPane.showMessageDialog(null,"-R"+amount+" from account\nWithdrawal of R" + amount + " Successfull","Successful Transaction", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Insufficient balance","Unsuccessful Transaction", JOptionPane.ERROR_MESSAGE);
        }
    }

    public double getBalance() {
        return this.balance;
    }
}
