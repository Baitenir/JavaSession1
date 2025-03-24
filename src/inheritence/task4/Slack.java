package inheritence.task4;

import java.time.LocalDate;

public class Slack extends Chat{
    String ownerName;

    public Slack(String name, boolean isNew, LocalDate dateOfIssue, String designColor, String ownerName) {
        super(name, isNew, dateOfIssue, designColor);
        this.ownerName = ownerName;
    }
    public String getChatName() {
        return super.getChatName();
    }

    public void getActions (){
        System.out.println("I make a new group");
    }
}
