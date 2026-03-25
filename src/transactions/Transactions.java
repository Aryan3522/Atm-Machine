package transactions;

import users.Users;

import java.util.concurrent.atomic.AtomicInteger;

public class Transactions {
    private int transactionId;
    private final long transactionAtm;
    private long transactionAmount;
    private static final AtomicInteger counter = new AtomicInteger(0);


    //    Constructor
    public Transactions(long transactionAtm) {
        this.transactionId = 100000 + (int) (Math.random() * 900000);
        this.transactionAtm = transactionAtm;
    }

    public int generateTransactionId() {
        return counter.incrementAndGet();
    }

    public long getTransactionAmount(int amount) {
        return amount;
    }

    public long getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(long transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public long getTransactionAtm() {
        return transactionAtm;
    }

    public void credit(Users user, long amount) {
        transactionId = generateTransactionId();
        if (amount <= 0) return;

        user.setBalance(user.getBalance() + amount);
    }

    public void debit(Users user, long amount) {
        transactionId = generateTransactionId();
        if (amount <= 0) return;

        user.setBalance(user.getBalance() - amount);
    }

    public int getTransactionId() {
        return transactionId;
    }
}
