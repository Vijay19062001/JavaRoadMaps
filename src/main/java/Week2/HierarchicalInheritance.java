package Week2;

import java.util.Scanner;

class CricketPlayer {
    String playerName;
    String teamName;

    void setPlayerData(String playerName, String teamName) {
        this.playerName = playerName;
        this.teamName = teamName;
    }

    void displayPlayerData() {
        System.out.println("Player Name: " + playerName);
        System.out.println("Team Name: " + teamName);
    }
}

class Batsman extends CricketPlayer {
    int hScore;
    float batAvg;

    void setBatsmanData(int hScore, float batAvg) {
        this.hScore = hScore;
        this.batAvg = batAvg;
    }

    void displayBatsmanData() {
        System.out.println("Highest Score: " + hScore);
        System.out.println("Batting Average: " + batAvg);
    }
}

class Bowler extends CricketPlayer {
    int wickets;
    float bowlEco;

    void setBowlerData(int wickets, float bowlEco) {
        this.wickets = wickets;
        this.bowlEco = bowlEco;
    }

    void displayBowlerData() {
        System.out.println("No. of Wickets: " + wickets);
        System.out.println("Bowling Economy: " + bowlEco );
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Batsman Input
        Batsman batsman = new Batsman();
        System.out.println("Enter Batsman Name: ");
        String batsmanName = input.nextLine();
        System.out.println("Enter Batsman Team: ");
        String batsmanTeam = input.nextLine();
        System.out.println("Enter Batsman's Highest Score: ");
        int batsmanScore = input.nextInt();
        System.out.println("Enter Batsman's Batting Average: ");
        float batsmanAvg = input.nextFloat();
        input.nextLine(); // Consume the newline

        batsman.setPlayerData(batsmanName, batsmanTeam);
        batsman.setBatsmanData(batsmanScore, batsmanAvg);

        // Bowler Input
        Bowler bowler = new Bowler();
        System.out.println("Enter Bowler Name: ");
        String bowlerName = input.nextLine();
        System.out.println("Enter Bowler Team: ");
        String bowlerTeam = input.nextLine();
        System.out.println("Enter Bowler's Number of Wickets: ");
        int bowlerWickets = input.nextInt();
        System.out.println("Enter Bowler's Bowling Average: ");
        float bowlerAvg = input.nextFloat();

        bowler.setPlayerData(bowlerName, bowlerTeam);
        bowler.setBowlerData(bowlerWickets, bowlerAvg);

        // Display Batsman and Bowler Data
        System.out.println("\nBatsman Details:");
        batsman.displayPlayerData();
        batsman.displayBatsmanData();

        System.out.println("\nBowler Details:");
        bowler.displayPlayerData();
        bowler.displayBowlerData();

        input.close();
    }
}
