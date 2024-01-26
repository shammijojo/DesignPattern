package TemplateMethodPattern;

public abstract class Payment {

    public abstract void validate();
    public abstract void debit();
    public abstract void credit();

    public final void sendMoney() {
        validate();
        debit();
        credit();
    }

}
