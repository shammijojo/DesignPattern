package TemplateMethodPattern;

public class Main {

    public static void main(String[] args) {
        Payment merchantPayment = new MerchantPayment();
        Payment friendPayment = new FriendPayment();
        merchantPayment.sendMoney();
        friendPayment.sendMoney();
    }
}
