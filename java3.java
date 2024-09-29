class SavingsAccount {
    static double annualInterestRate;
   double savingsBalance;

    SavingsAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.savingsBalance = initialBalance;
        } else {
            this.savingsBalance = 0; 
        }
    }

  void calculateMonthlyInterest() {
        double monthlyInterest = savingsBalance * (annualInterestRate / 100) / 12;
        savingsBalance += monthlyInterest;
    }

    static void setAnnualInterestRate(double rate) {
        annualInterestRate = rate;
    }

double getSavingsBalance(){
        return savingsBalance;
    }

    public static void main(String[] args) {
        SavingsAccount a = new SavingsAccount(1000);
        SavingsAccount.setAnnualInterestRate(5); 
        a.calculateMonthlyInterest();
        System.out.println("Updated balance: " + a.getSavingsBalance());
    }
}