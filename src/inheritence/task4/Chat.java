package inheritence.task4;

import java.time.LocalDate;

public class Chat {
    String name;
    boolean isNew;
    LocalDate dateOfIssue;
    String designColor;

    public Chat() {
    }

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
        return LocalDate.now().getYear() - getDateOfIssue().getYear() == 5 || LocalDate.now().getYear() - getDateOfIssue().getYear() == 4 || LocalDate.now().getYear() - getDateOfIssue().getYear() == 3 || LocalDate.now().getYear() - getDateOfIssue().getYear() == 2 || LocalDate.now().getYear() - getDateOfIssue().getYear() == 1;
    }

    public Chat getChat (Chat[] chats){
        for (Chat chat : chats) {
            if (chat.getDateOfIssue().getYear() == LocalDate.now().getYear()) {
                return chat;
            }
        }
        for (Chat chat : chats) {
             if (chat.getDateOfIssue().getYear() == LocalDate.now().getYear() - 1) {
                return chat;
            }
        }
        for (Chat chat : chats) {
            if (chat.getDateOfIssue().getYear() == LocalDate.now().getYear() - 2) {
                return chat;
            }
        }
        for (Chat chat : chats) {
            if (chat.getDateOfIssue().getYear() == LocalDate.now().getYear() - 3) {
                return chat;
            }
        }
        for (Chat chat : chats) {
            if (chat.getDateOfIssue().getYear() == LocalDate.now().getYear() - 4) {
                return chat;
            }
        }
        for (Chat chat : chats) {
            if (chat.getDateOfIssue().getYear() == LocalDate.now().getYear() - 5) {
                return chat;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Chat{ " +
                "name= '" + name + '\'' +
                ", isNew= " + isNew +
                ", dateOfIssue= " + dateOfIssue +
                ", designColor= '" + designColor + '\'' +
                '}';
    }
}