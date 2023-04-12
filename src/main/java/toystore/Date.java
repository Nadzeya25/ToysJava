package toystore;


    import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

    public class Date {
        public static String dateNow() {
            String dateTime = DateTimeFormatter.ofPattern("MMM dd yyyy, hh:mm:ss a").format(LocalDateTime.now());

            return dateTime;        // 24 декабря 2021 г., 16:34:27
        }
    }

