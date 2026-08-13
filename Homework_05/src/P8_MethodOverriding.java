public class P8_MethodOverriding {
    public static void main(String[] args) {

        Account a1 = new Account(300,5,1);
        Account s1 = new SavingAccount(100, 2);
        Account c1 = new CurrentAccount(100, 2);

        a1.calculateInterest(); // general interest at given 5%
        s1.calculateInterest(); // saving interest fixed at 6%
        c1.calculateInterest(); // no interest in current

        System.out.println("P = " + a1.principal + ", R = " + a1.roiAnnual + ", T = " + a1.period);
    }
}


// Parent account
class Account{
    int principal;
    int roiAnnual; // rate of interest in percentage
    int period; // in years

    Account(int principal, int roiAnnual, int period){

        this.principal = principal; //not defining private so child can access
        this.roiAnnual = roiAnnual;
        this.period = period;
    }

    //calculating general interest based on roi you gave
    void calculateInterest(){
        int interest = (principal * roiAnnual * period) / 100;
        System.out.println("General interest calculated at " + roiAnnual + " annually: " + interest);
    }
}

// child Saving Account
class SavingAccount extends  Account{

    SavingAccount(int principal, int period) {
        // taking parents help to initialize the field
        super(principal, 6, period); // 6% for saving account
    }

    @Override
    void calculateInterest() {
        int interest = (principal * roiAnnual * period)/100;
        System.out.println("Saving Account interest calculated at 6% annually: " + interest);
    }
}

// child Current Account
class CurrentAccount extends Account{

    CurrentAccount(int principal, int period) {
        super(principal, 0, period); // 0% for saving account
    }

    @Override
    void calculateInterest() {
        int interest = (principal * roiAnnual * period)/100;
        System.out.println("Saving Account interest calculated at 6% annually: " + interest);
    }
}

