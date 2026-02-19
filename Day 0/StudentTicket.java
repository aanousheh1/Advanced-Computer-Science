
import java.util.Date;

public class StudentTicket extends StandardTicket {
    public StudentTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
    }

    private static final double STUDENT_DISCOUNT = 0.50;

    public double getTotalPrice() {
        int count = super.getTicketCount();
        double tax = super.getTax();
        double price = super.getBasePrice();
        double oldprice = (tax) * (count * price) + (count * price);
        double totalPrice = oldprice - (oldprice * STUDENT_DISCOUNT);
        return totalPrice;
    }

    @Override
    public void printTicketType() {
        System.out.println("Ticket Type: Student (Must Show ID)");
    }

}
