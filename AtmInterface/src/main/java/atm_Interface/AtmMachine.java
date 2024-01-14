/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm_Interface;

/**
 *
 * @author Kulan
 */
public class AtmMachine {
    private BankAccount userAccount;

    public AtmMachine(BankAccount account) {
        this.userAccount = account;
    }

    public void deposit(double amount) {
        userAccount.deposit(amount);
    }

    public void withdraw(double amount) {
        userAccount.withdraw(amount);
    }

    public double checkBalance() {
        return userAccount.getBalance();
    }
}