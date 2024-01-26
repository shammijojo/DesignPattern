package TemplateMethodPattern;

public class FriendPayment extends Payment {
    @Override
    public void validate() {
        System.out.println("Friend payment : Validated");
    }

    @Override
    public void debit() {
        System.out.println("Friend payment : Debited");
    }

    @Override
    public void credit() {
        System.out.println("Friend payment : Credited");
    }
}
