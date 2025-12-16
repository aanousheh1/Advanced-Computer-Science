public class TheaterMember {
    private String name;
    private boolean[] loyaltyCredits;

    public TheaterMember(String name) {
        this.name = name;
        this.loyaltyCredits = new boolean[10];
    }

    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }

    public String getName() {
        return name;
    }

    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void grantLoyaltyCredit() {
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == false) {
                loyaltyCredits[i] = true;
            }
        }
    }

    public int countLoyaltyCredits() {
        int count = 0;
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == true) {
                count += 1;
            }
        }
        return count;
    }

    public String determineMembershipStatus() {
        int count = 0;
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == true) {
                count += 1;
            }
        }
        if (count >= 6) {
            return "Gold Member";
        }
        if (count >= 3 && count <= 5) {
            return "Silver Member";
        } else {
            return "Plus Member";
        }

    }

    public String loyaltyHistory() {
        String out = "[";
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] == true) {
                out = out + "X";
                if (i < loyaltyCredits.length - 1) {
                    out = out + ", ";
                }

            }
            if (loyaltyCredits[i] == false) {
                out = out + "-";
                if (i < loyaltyCredits.length - 1) {
                    out = out + ", ";
                }
            }

        }
        out = out + "]";
        return out;
    }

    public String toString() {
        return name + "(" + determineMembershipStatus() + "), Loyalty History:\n" + loyaltyHistory();
    }

    public boolean equals(TheaterMember other) {
        for (int i = 0; i < loyaltyCredits.length; i++) {
            if (loyaltyCredits[i] != other.loyaltyCredits[i]) {
                return false;
            }
        }
        if (!this.name.equals(other.name)) {
            return false;
        }

        return true;
    }

}
