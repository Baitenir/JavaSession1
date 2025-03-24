package inheritence.task4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
      Instagram instagram = new Instagram("Gomes", false, LocalDate.of(2021,2,6), "red", "Kevin");
      Slack slack = new Slack("Tailer", true, LocalDate.of(2012,6,26), "white", "Stuart");
      Telegram telegram = new Telegram("Brad", false, LocalDate.of(2024,11,11), "blue", "Pavel");
      WhatsApp whatsapp = new WhatsApp("Alon", false, LocalDate.of(2017,7,9), "red", "Yan");

        Chat chat = new Chat();
        Chat[] chats = new Chat[] {instagram, slack, telegram, whatsapp};

        System.out.println("En jany chat: " + chat.getChat(chats).toString());


    }
}


//Chat деген класс тузунуз, полелери (name, isNew(boolean), dateOfIssue,
//designColor), methods:
//getChatName(){}; chat тын атын жана тусун чыгарып берсин.
//getIsNewChat(){}; эгерде акыркы 5 жылдын аралыгында чыкса true,
//болбосо false кайтарсын.
//Аларды мурастаган WhatsApp, Telegram, Instagram, Slack жана башкалар.
//Ар бир класста 2 ден уникалдуу полелери болсун жана parent class тын
//методторун переопределять этиши керек.
// Ар бир мурастап жаткан
//класстын озуно тиешелуу методу болсун, ошол гана класстын эмне
//кылып жатканын жана кандай озгочолуктору бар экенин кайтарып
//берчу.
//main ден ар бир класстын бир нече объектин тузуп баарын массивге
//салыныз.
//
// Метод тузунуз бизге параметрден келген чаттардын
//арасынан эн жаны чатты табып, анан чаттын атын жана “ эн жаны чат”
//деп консолго чыгарып берсин