package inheritence.task4;

import java.time.LocalDate;

public class Slack extends Chat{
    public Slack (String name, boolean isNew, LocalDate dateOfIssue, String designColor){
        super(name, isNew, dateOfIssue, designColor);
    }
}
