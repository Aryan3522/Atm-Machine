package users;

public class Auth extends Users {
    private long AtmNo = 6070984330131704L;
    private int AtmPass;

    public Auth(int id, String name, long atmNumber, int atmPassword) {
        super(name, atmNumber, atmPassword);
        this.AtmNo = atmNumber;
        this.AtmPass = atmPassword;
    }

    public int getAtmPass() {
        return AtmPass;
    }

    public void setAtmPass(int atmPass) {
        AtmPass = atmPass;
    }

    public long AtmNum(){
        return AtmNo;
    }

    public long getAtmNo() {
        return AtmNo;
    }

    public void setAtmNo(long atmNo) {
        AtmNo = atmNo;
    }
}
