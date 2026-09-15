package software.ulpgc.chess;

public class Main {
    static void main() {
        Bird.isMammal();
        Bird b1 = new Bird(Bird.Color.Red);
        Bird b2 = new Bird(Bird.Color.Yellow);
        System.out.println(b1.color());
    }
}
