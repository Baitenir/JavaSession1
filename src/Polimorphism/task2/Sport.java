package Polimorphism.task2;

public class Sport {
    private String teamName;
    private String category;
    private int players;

    public Sport() {
    }

    public Sport(String teamName, String category, int players) {
        this.teamName = teamName;
        this.category = category;
        this.players = players;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public Sport[] getSport (Sport[] sports, String userSport){
        int count =0;
        for (Sport sport : sports) {
            if (sport.getCategory().equals(userSport)){
                count++;
            }
        }
        Sport[] result = new Sport[count];
        int index=0;
        for (Sport sport : sports) {
            if (sport.getCategory().equals(userSport)){
                result[index++] = sport;
            }
        }
        return result;

    }

    @Override
    public String toString() {
        return "Sport{" +
                "teamName='" + teamName + '\'' +
                ", category='" + category + '\'' +
                ", players=" + players +
                '}';
    }
}
