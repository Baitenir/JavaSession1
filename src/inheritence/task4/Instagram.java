package inheritence.task4;

import java.time.LocalDate;

public class Instagram extends Chat{
    String ownerName;

    public Instagram(String name, boolean isNew, LocalDate dateOfIssue, String designColor, String ownerName) {
        super(name, isNew, dateOfIssue, designColor);
        this.ownerName = ownerName;
    }


    @Override
    public String getChatName() {
        return super.getChatName();
    }

    public void getActions (){
        System.out.println("I make a new post");
    }


}
