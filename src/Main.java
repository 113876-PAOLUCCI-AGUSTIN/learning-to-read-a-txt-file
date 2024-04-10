/*
 *
 * Top 1,000 baby girl names in the U.S.
 * SOURCE: https://www.today.com/parents/babies/popular-baby-girl-names-rcna11278
 *
 */

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

        System.out.println("The TOP TEN is: ");
        for (int i = 0; i < 9; i++) {
            System.out.println((i+1)+") " + top1000BabyGirlsNamesUSAList.get(i));
        }

        System.out.println("The actual ArrayList size is: " +top1000BabyGirlsNamesUSAList.size()+".");
    }
}