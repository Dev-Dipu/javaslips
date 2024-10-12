//Define a “Clock” class that does the following ;
//        a. Accept Hours, Minutes and Seconds
//b. Check the validity of numbers
//c. Set the time to AM/PM mode
//Use the necessary constructors and methods to do the above task


class Clock {
    int hours, minutes, seconds;
    String period; // AM or PM

    Clock(int hours, int minutes, int seconds) {
        if (isValidTime(hours, minutes, seconds)) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            setPeriod();
        } else {
            System.out.println("Invalid time entered!");
        }
    }

    private boolean isValidTime(int hours, int minutes, int seconds) {
        return (hours >= 0 && hours <= 23) &&
                (minutes >= 0 && minutes <= 59) &&
                (seconds >= 0 && seconds <= 59);
    }

    private void setPeriod() {
        if (hours < 12) {
            period = "AM";
        } else {
            period = "PM";
            if (hours > 12) {
                hours -= 12;
            }
        }
    }

    public void displayTime() {
        System.out.printf("Time: %d:%d:%d %s\n", hours, minutes, seconds, period);
    }
}


public class Slip9_a{
    public static void main(String[] args) {
        Clock clock = new Clock(15, 30, 45);
        clock.displayTime();
    }
}