//Create a program that displays the current date and time in various formats (e.g., dd-MM-yyyy, MM/dd/yyyy, HH:mm:ss).

package Exercise10;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {


        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyy");
        String  formattedDate = localDate.format(dateTimeFormatter);
        System.out.println(formattedDate);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("M/d/yyy");
        String formattedDate1 = localDate.format(dateTimeFormatter1);
        System.out.println(formattedDate1);

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dtfTime = DateTimeFormatter.ofPattern("d/M/yyyy 'T 'HH:mm:ss");
        String formattedDateTime = localDateTime.format(dtfTime);
        System.out.println(formattedDateTime);
    }
}
