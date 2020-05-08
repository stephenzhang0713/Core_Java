import java.time.LocalDate;
import java.util.Locale;

/**
 * @Author: zhanghan
 * @Date: 2020/3/18 19:34
 * @Description: This is the first sample program in Core java Chapter 3
 */
public class FirstSample {
    public static void main(String[] args) {
        var hello = "hello";
        System.out.println("we will not use 'Hello,World!'");
        System.out.println(hello);
        System.out.println(LocalDate.now().toString());
        LocalDate newYearsEve = LocalDate.of(1999, 12, 31);
        int year = newYearsEve.getYear();
        int month = newYearsEve.getMonthValue();
        int day = newYearsEve.getDayOfMonth();
        System.out.println("Year:"+year+" month:"+month+" day:"+day);
        LocalDate aThousandDaysLater = newYearsEve.plusDays(1000);
        System.out.println(aThousandDaysLater.getYear()+" "+aThousandDaysLater.getMonthValue()+" "+aThousandDaysLater.getDayOfMonth());
    }
}
