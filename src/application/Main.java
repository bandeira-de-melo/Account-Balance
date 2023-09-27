package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account Holder Name: ");
        String accountHolder = sc.next();
        System.out.println("Is there an initial deposit (y/n) ? ");
        char hasInitialDeposit = sc.next().charAt(0);

        double amount;


        if(hasInitialDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            amount = sc.nextDouble();
            account = new Account(accountNumber, accountHolder, amount);
        } else account = new Account(accountNumber, accountHolder);


        System.out.println("Account data:");

        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.makeDeposit(depositValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.print("Enter a withdraw value:");
        double withdrawValue = sc.nextDouble();
        account.makeWithDraw(withdrawValue);
        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();
    }
}