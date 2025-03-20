package inheritence.task4;

import java.time.LocalDate;

public class Telegram extends Chat{

    public Telegram(String name, boolean isNew, LocalDate dateOfIssue, String designColor) {
        super(name, isNew, dateOfIssue, designColor);
    }
}
