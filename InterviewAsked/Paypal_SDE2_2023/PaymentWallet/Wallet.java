package InterviewAsked.Paypal_SDE2_2023.PaymentWallet;

public class Wallet {
    private double totalBalance;

    public Wallet (double totalBalance){
        this.totalBalance = totalBalance;
    }

    public void addAmount(double amount) {
        totalBalance += amount;
    }

    public boolean checkSufficentAmmount(double amount){
        return totalBalance >= amount;
    }

    public String isTransaction(double amount) {
        String response;
        if (checkSufficentAmmount(amount)) {
            totalBalance -= amount;
            response = "Your transaction is Successfull\n Remaining Amount: "+totalBalance;
        } else {
            response = "You have no enough amount to process transaction";
        }
        return response;
    }

    public double getBalance() {
        return totalBalance;
    }
}
/* 
Payment wallet. 
Add balance, check if transaction is possible, deduct balance. 
Client code/Stub code is given which calls certain classes, catches 
certain exceptions and expects certain output. Goal is to implement these classes
*/