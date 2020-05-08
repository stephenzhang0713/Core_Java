import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @Author: zhanghan
 * @Date: 2020/3/20 20:47
 * @Description:
 */
public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        //set to start of month
        date = date.minusDays(today-1);
        DayOfWeek weekday = date.getDayOfWeek();
        //1 =Monday,......,7= sunday
        int value = weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 0; i < value; i++) {
            System.out.print("  ");
        }
        while (date.getMonthValue() == month){
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth() == today) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue()!=1) {
            System.out.println();
        }

    }
}
