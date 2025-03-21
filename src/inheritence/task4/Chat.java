package inheritence.task4;

import java.time.LocalDate;

public class Chat {
    protected String name;
    protected boolean isNew;
    protected LocalDate dateOfIssue;
    protected String designColor;

    public Chat(String name, boolean isNew, LocalDate dateOfIssue, String designColor) {
        this.name = name;
        this.isNew = isNew;
        this.dateOfIssue = dateOfIssue;
        this.designColor = designColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getDesignColor() {
        return designColor;
    }

    public void setDesignColor(String designColor) {
        this.designColor = designColor;
    }

    public String getChatName() {
        return "Name chat: " + name + ", color: " + designColor;
    }
    public boolean getIsNewChat(){
        return false; //todo i'll come back
    }
}