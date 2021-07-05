import java.util.Scanner;

class Box {
    double height, weight, depth;

    Box (double h, double w, double d) {
        height = h;
        weight = w;
        depth = d; 
    }

    void displayVol () {
        System.out.println("Volume  : "+(height*weight*depth));
    }
}

public class BoxVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        Box firstBox = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        firstBox.displayVol();
        
        Box secondBox = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        secondBox.displayVol();
    }
}