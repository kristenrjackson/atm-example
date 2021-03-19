public class ATM {
    public double balance;
    String pin;
    public boolean acceptPin(String inPin) {
        return pin.equals(inPin);
    }

    public ATM(String inPin, double inBalance){
        pin = inPin;
        balance = inBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double v) {
        balance += v;
    }

    public void withdrawal(double w) {
        balance -= w;
    }
}
