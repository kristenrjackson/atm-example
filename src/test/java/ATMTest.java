import org.junit.Assert;
import org.junit.Test;

public class ATMTest {

    @Test
    public void shouldPINBeAccepted() {
        ATM myATM = new ATM("2345", 1000.00);
        boolean accepted = myATM.acceptPin("2345");
        Assert.assertEquals(true, accepted);
    }

    @Test
    public void isBalanceCorrect() {
        ATM myATM = new ATM("2345", 1000.00);
        double balance = myATM.getBalance();
        Assert.assertEquals(1000.00, balance, .001);
    }

    @Test
    public void wasDepositSuccessful() {
        ATM myATM = new ATM("1234", 500.00);
        myATM.deposit(50.0);
        double balance = myATM.getBalance();
        Assert.assertEquals(550.0, balance, .001);
    }
}
