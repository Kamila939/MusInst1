import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Musicalinstruments guitar = new Guitar();
        Musicalinstruments piano = new Piano();
        Musicalinstruments musicalinstruments = new Musicalinstruments();
        musicalinstruments.maxSound();
        guitar.maxSound();
        piano.maxSound();
    }
}
