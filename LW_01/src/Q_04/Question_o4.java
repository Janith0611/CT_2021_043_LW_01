package Q_04;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question_o4 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String formattedDate = today.format(formatter);
        System.out.println(formattedDate);
    }
}
