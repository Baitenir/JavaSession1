package inheritence.task4;

import java.time.LocalDate;

public class WhatsApp extends Chat{
    public WhatsApp(String name, boolean isNew, LocalDate dateOfIssue, String designColor) {
        super(name, isNew, dateOfIssue, designColor);
    }

}
