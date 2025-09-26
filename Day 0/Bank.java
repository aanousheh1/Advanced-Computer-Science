public class Bank {
    private int numberOfLoanOfficers;
    private int numberOfTellers;

    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;

    }

    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }

    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    }

    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    public int getTotalEmployees() {
        int totalEmployees = computeTotalEmployees(); 
        return totalEmployees;
    }

    public int computeTotalEmployees() {
        int computeTotalEmployees = numberOfLoanOfficers + numberOfTellers;
        return computeTotalEmployees;

    }
    
    public String toString() {
        return numberOfLoanOfficers + "+" + numberOfTellers + "=" + computeTotalEmployees();
    }

    public boolean equals(Bank other) {
        if (this.numberOfLoanOfficers == other.numberOfLoanOfficers 
            && this.numberOfTellers == other.numberOfTellers) {
            return true;
        } else {
            return false;
        }
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficers) {
        if (isLoanOfficers) {
            numberOfLoanOfficers = numberToHire + numberOfLoanOfficers;
        } else {
            numberOfTellers = numberToHire + numberOfTellers;
        }
    }




}
