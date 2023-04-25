package InterviewAsked.Paypal_SDE2_2023.PaymentWallet;

public class test {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(1000);
        // Buy 500 Tshirt
        String status = wallet.isTransaction(500);
        System.out.println(status);

        // Buy charger 600
        status = wallet.isTransaction(600);
        System.out.println(status);
        
        // Add Amount 100
        wallet.addAmount(100);

        // Buy charger 600
        status = wallet.isTransaction(600);
        System.out.println(status);
        System.out.println(wallet.getBalance());
    }
}
