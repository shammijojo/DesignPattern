package TemplateMethodPattern;

public class MerchantPayment extends Payment{
    @Override
    public void validate() {
        System.out.println("Merchant payment : Validated");
    }

    @Override
    public void debit() {
        System.out.println("Merchant payment : Debited");
    }

    @Override
    public void credit() {
        System.out.println("Merchant payment : Credited");
    }
}
