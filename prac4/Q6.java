class Bank {
    String bank_name;

    Bank(String name) {
        this.bank_name = name;
    }

    void calc_interest(int amt, int interest_rate) {
        int interest = (amt * interest_rate) / 100;
        System.out.println("Interest given by bank for a year is : " + interest);
    }

    void calc_interest(int amt, int interest_rate, int no_years) {
        int current_amt=amt;
        for (int i = 0; i < no_years; i++) {
            amt += ((amt * interest_rate) / 100);
        }
        System.out.println("Interest given by bank for " + no_years + " years is : " + (amt - current_amt));
    }

}

class Q6 {
    public static void main(String[] args) {
        Bank axis = new Bank("Axis");
        axis.calc_interest(5000, 2, 4);

    }
}
