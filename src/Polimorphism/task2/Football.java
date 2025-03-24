package Polimorphism.task2;

public class Football extends Sport{

    public Football(String teamName, String category, int players) {
        super(teamName, category, players);
    }

    public void kickball(){
        System.out.println("football players kicked the ball!");
    }



}
