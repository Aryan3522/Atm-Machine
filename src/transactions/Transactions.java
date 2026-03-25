package transactions;

import users.Users;

public class Transactions {
    private final int transactionId;
    private final long transactionAtm;
    private long transactionAmount;


    //    Constructor
    public Transactions(long transactionAtm) {
        this.transactionId = 100000 + (int)(Math.random() * 900000);
        this.transactionAtm = transactionAtm;
    }

    public int getTransactionId() {
        return transactionId;
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

    public boolean credit(Users user, long amount) {
        if (amount <= 0) return false;

        user.setBalance(user.getBalance() + amount);
        return true;
    }

    public boolean debit(Users user, long amount) {
        if (amount <= 0) return false;

        user.setBalance(user.getBalance() - amount);
        return true;
    }
}
