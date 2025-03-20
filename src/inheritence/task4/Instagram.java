package inheritence.task4;

import java.time.LocalDate;

public class Instagram extends Chat{
    public Instagram(String name, boolean isNew, LocalDate dateOfIssue, String designColor) {
        super(name, isNew, dateOfIssue, designColor);
    }
}
