import java.util.Calendar;
import java.util.Date;

/**
 * Created by Admin on 20.04.16.
 */
public class DateTimeParse {
    public Date convertTime(String time){
        Date date = new Date();
        long timeInMilSec = 0;
        String[] splitTime = time.split(":");
        for (String s : splitTime){
            System.out.println("splitted time: " + s);
        }

        int hours = Integer.parseInt(splitTime[0]);
        System.out.println("hours: " + hours);
        int minutes = Integer.parseInt(splitTime[1]);
        System.out.println("minutes: " + minutes);

        timeInMilSec += hours * 3600 * 1000;
        timeInMilSec += minutes * 60 * 1000;
        /*timeInMilSec += new Date().getTime();*/
        System.out.println("time in mils: " + timeInMilSec);

        date = new Date(timeInMilSec);
        System.out.println("date: " + date.toLocaleString());

        return date;
    }

    public static void main(String[] args) {
        DateTimeParse dateTimeParse = new DateTimeParse();
        dateTimeParse.convertTime("00:00");

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getWeekYear());
        System.out.println("--------------------------------------------------------------");
        dateTimeParse.example();

    }

    public void example() {
        Calendar now = Calendar.getInstance();

        System.out.println("Current date : " + (now.get(Calendar.MONTH) + 1) + "-"
                + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR));

        System.out.println("Current week of month is : " + now.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Current week of year is : " + now.get(Calendar.WEEK_OF_YEAR));



        now.add(Calendar.WEEK_OF_YEAR, 1);
        System.out.println("date after one week : " + (now.get(Calendar.MONTH) + 1) + "-"
                + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR));
    }
}
