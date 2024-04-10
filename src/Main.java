import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File(
                "C:\\top1000BabyGirlsNamesUSA.txt");

        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        ArrayList<String> top1000BabyGirlsNamesUSAList = new ArrayList<>();
        while (sc.hasNextLine())
            top1000BabyGirlsNamesUSAList.add(sc.nextLine());
        sc.close();
    }
}