/*Implement a superclass Appointment and subclasses Onetime , Daily , and Monthly. An
appointment has adescription (for example, “see the dentist”) and a date. Write a
method occursOn(int year, int month, int day) that checks whether the appointment occurs
on that date. For example, for a monthly appointment, you must check whether the day of the
month matches. Then fill an array of Appoint­ment objects with a mixture of appointments.
Have the user enter a date and print out all appointments that occur on that date.*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Appointment {
    private String description;
    Date date;

    public Appointment(String description, int day, int month, int year) throws ParseException {
        this.setDescription(description);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.setDate(simpleDateFormat.parse(String.format("%d/%d/%d", day, month, year)));
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString() {
        return String.format("Appointment is: %s. Date is: ", this.getDescription(), this.getDate()
                .toString());
    }

    public boolean occursOn(int year, int month, int day) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = simpleDateFormat.parse(String.format("%d/%d/%d", day, month, year));

        return this.getDate().equals(date);
    }
}