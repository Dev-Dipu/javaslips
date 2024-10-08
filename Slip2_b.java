//Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totalruns, bat_avg).
//Create an array of n player objects .Calculate the batting average for each player using static
//method avg(). Define a static sort method which sorts the array on the basis of average. Display
//the player details in sorted order.

import java.util.Arrays;
import java.util.Scanner;

class CricketPlayer{
    String name;
    int noinnings, nonotout, totalruns;
    double batavg;

    CricketPlayer(String name, int noinnings, int nonotout, int totalruns){
        this.name = name;
        this.noinnings = noinnings;
        this.nonotout = nonotout;
        this.totalruns = totalruns;
        this.batavg = 0.0;
    }
    static void calcAvg(CricketPlayer player){
        player.batavg = (double) player.totalruns / player.noinnings;
    }

    static void sortPlayers(CricketPlayer[] players){
        Arrays.sort(players, (p1, p2) -> Double.compare(p2.batavg, p1.batavg));
    }

    void display() {
        System.out.println("Name: " + name + ", Innings: " + noinnings + ", Not Out: " + nonotout +
                ", Total Runs: " + totalruns + ", Batting Average: " + batavg);
    }

}




public class Slip2_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int n, noinnings, nonotout, totalruns;
        System.out.println("no of players you want to create?");
        n = sc.nextInt();
        CricketPlayer[] players = new CricketPlayer[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter name: ");
            name = sc.next();
            System.out.print("no of innings: ");
            noinnings = sc.nextInt();
            System.out.print("no of notouts: ");
            nonotout = sc.nextInt();
            System.out.print("totalruns: ");
            totalruns = sc.nextInt();
            players[i] = new CricketPlayer(name, noinnings, nonotout, totalruns);
        }

        for (CricketPlayer player: players){
            CricketPlayer.calcAvg(player);
        }

        CricketPlayer.sortPlayers(players);

        System.out.println("Players details in sorted order");
        for (CricketPlayer player: players){
            player.display();
        }

    }
}
