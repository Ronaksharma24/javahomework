package week4;

public class testBank {

    public static void main(String[] args) {
        CreditCard1 obj = new CreditCard1();
        obj.cardlimit();
        obj.cardAPR();
        obj.cardFees();
        obj.cardCashback();
        System.out.println("----------------------------------------------------");

        CreditCard2 obj1 = new CreditCard2();
        obj1.cardlimit();
        obj1.cardAPR();
        obj1.cardFees();
        obj1.balanceTransfer();
        System.out.println("----------------------------------------------------");
        CreditCard3 obj2 = new CreditCard3();
        obj2.cardlimit();
        obj2.cardAPR();
        obj2.cardFees();
        obj2.noAnnualfee();

        System.out.println("----------------------------------------------------");
        NewCard obj3 = new NewCard();
        obj3.noAnnualfee();

    }
}