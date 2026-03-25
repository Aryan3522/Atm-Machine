package users;

import transactions.Transactions;

public class Users {
    private int id;
    private String name;
    private final long AtmNumber;
    private int AtmPassword;
    private long Balance;

    public Users(String name, long atmNumber, int atmPassword) {
        this.id = (int)(Math.random() + 4000);
        this.name = name;
        AtmNumber = atmNumber;
        AtmPassword = atmPassword;
        this.Balance = 1000;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAtmNumber() {
        return AtmNumber;
    }

    public int getAtmPassword() {
        return AtmPassword;
    }

    public void setAtmPassword(int atmPassword) {
        AtmPassword = atmPassword;
    }

    public long getBalance() {
        return Balance;
    }
    public void setBalance(long balance) {
        Balance = balance;
    }

    public static void main() {
    }
}
