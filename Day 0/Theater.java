public class Theater {
    private String theaterName;
    private TheaterMember[] registeredMembers;

    public Theater(String theaterName, TheaterMember[] registeredMembers) {
        this.theaterName = theaterName;
        this.registeredMembers = registeredMembers;
    }

    public Theater(String theaterName, int initialCapacity) {
        this.theaterName = theaterName;
        this.registeredMembers = new TheaterMember[initialCapacity];
    }

    public TheaterMember[] getRegisteredMembers() {
        return registeredMembers;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setRegisteredMembers(TheaterMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public boolean isFull() {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                return false;
            }
        }
        return true;

    }

    public void increaseCapacity() {
        TheaterMember[] larger = new TheaterMember[registeredMembers.length * 2];
        for (int i = 0; i < registeredMembers.length; i++) {
            larger[i] = registeredMembers[i];
        }
        registeredMembers = larger;
    }

    public void registerMember(TheaterMember member) {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                registeredMembers[i] = member;
            }
            if (registeredMembers[i] != null && i == registeredMembers.length - 1) {
                TheaterMember[] larger = new TheaterMember[registeredMembers.length + 1];
                larger[i] = registeredMembers[i];
                larger[registeredMembers.length] = member;

            }
        }

    }

    public String toString() {
        String out = "== AMC Members ==";
        for (int i = 1; i < registeredMembers.length; i++) {
            out = out + i + ".) " + registeredMembers[i].toString() + "\n";
        }
        return out;
    }

    public boolean deleteMember(TheaterMember member) {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i].equals(member)) {
                registeredMembers[i] = null;
                return true;
            }
        }

        return false;

    }

}
