import java.util.Scanner;
public class FrogSimulation {
private int goalDistance;
private int maxHops;


public FrogSimulation(int dist, int numHops) {
    goalDistance = dist;
    maxHops = numHops;
}


private int hopDistance() { 
    Scanner s = new Scanner(System.in);
    System.out.println("How far?");
    return s.nextInt();
}


public boolean simulate() { 
    int hops = 0;
    int distance = 0;
    while (hops < maxHops) {
        hops++;
        distance += hopDistance();
        if (distance >= goalDistance) return true;
        if (distance < 0) return false;
    }
    return false;
}


public double runSimulations(int num) {  
    double count = 0;
    for (int i = 1; i < num; i++) {
        if (simulate()) count++;
    }
    return count / (double) num;
}
}