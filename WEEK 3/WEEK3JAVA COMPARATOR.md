# WEEK3:JAVA COMPARATOR

import java.util.\*;

import java.util.Comparator;



class Checker implements Comparator<Player> {



&#x20;   @Override

&#x20;   public int compare(Player a, Player b) {



&#x20;       if (a.score != b.score) {

&#x20;           return b.score - a.score;   // Higher score first

&#x20;       }



&#x20;       return a.name.compareTo(b.name); // Alphabetical order if scores are equal

&#x20;   }

}

// Write your Checker class her

class Player{

&#x20;   String name;

&#x20;   int score;

&#x20;   

&#x20;   Player(String name, int score){

&#x20;       this.name = name;

&#x20;       this.score = score;

&#x20;   }

}



class Solution {



&#x20;   public static void main(String\[] args) {

&#x20;       Scanner scan = new Scanner(System.in);

&#x20;       int n = scan.nextInt();



&#x20;       Player\[] player = new Player\[n];

&#x20;       Checker checker = new Checker();

&#x20;       

&#x20;       for(int i = 0; i < n; i++){

&#x20;           player\[i] = new Player(scan.next(), scan.nextInt());

&#x20;       }

&#x20;       scan.close();



&#x20;       Arrays.sort(player, checker);

&#x20;       for(int i = 0; i < player.length; i++){

&#x20;           System.out.printf("%s %s\\n", player\[i].name, player\[i].score);

&#x20;       }

&#x20;   }

}

## OUTPUT:

Input (stdin)

5

amy 100

david 100

heraldo 50

aakansha 75

aleksa 150

Expected Output

aleksa 150

amy 100

david 100

aakansha 75

herald



