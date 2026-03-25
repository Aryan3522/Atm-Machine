import transactions.Transactions;
import users.Auth;
import users.Users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public String greetings() {
        return "Hello ";
    }

    public static void main(String[] args) throws InterruptedException {
        //    amount to be credited
        ArrayList<Integer> creditAmount;
        //    amount to be debited
        ArrayList<Integer> debitAmount;

        Auth authentication = new Auth("Aryan", 6070984330131704L, 4522);
        Users user = new Users("Aryan", 6070984330131704L, 4522);
        Main greet = new Main();

        creditAmount = new ArrayList<>(Arrays.asList(5000, 2000, 3000));

        debitAmount = new ArrayList<>(Arrays.asList(1000, 2000, 5000));

//        add new debit amount
        debitAmount.add(1200);

//        add new credit amount
        creditAmount.add(1000);

        Transactions txn = new Transactions(6070984330131704L);

        //    set new Password
        //    user.setAtmPassword(3522);

        if (String.valueOf(authentication.getAtmNumber()).length() < 16) {
            System.out.println("Invalid ATM Number");
        } else {
            if (authentication.getAtmNo() == user.getAtmNumber()) {
                if (authentication.getAtmPass() == user.getAtmPassword()) {
                    System.out.println(greet.greetings() + user.getName() + " " + "Welcome Abroad!");
                    for (int amount : creditAmount) {
                        txn.credit(user, amount);
                        // System.out.println("Transaction id: " + txn.getTransactionId());

                        try {
                            System.out.println("Crediting amount: " + txn.getTransactionAmount(amount));
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            System.out.println("task interrupted");
                            throw e;
                        }
                    }
                    for (int amount : debitAmount) {
                        txn.debit(user, amount);
                        // System.out.println("Transaction id: " + txn.getTransactionId());

                        try {
                            System.out.println("Debiting amount: " + txn.getTransactionAmount(amount));
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            System.out.println("task interrupted");
                            throw e;
                        }
                    }
                    System.out.println("Your Remaining Balance is: " + user.getBalance());
                } else {
                    System.out.println("Incorrect Password");
                }
            } else {
                System.out.println("No User Found");
            }
        }
    }


}