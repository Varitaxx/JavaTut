package _test.printf;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String name = "Peter";
        int alter = 32;
        double gehalt = 56000.14;

        System.out.println("Unser Mitarbeiter " + name + " ist " + alter + "Jahre alt und verdient: " + gehalt + " im Jahr");
        System.out.printf("Unser Mitarbeiter %s ist %d Jahre alt und verdient %.2f im Jahr \n", name,alter,gehalt);

        System.out.printf("Unser Mitarbeiter %S ist %08d Jahre alt und verdient %.2f im Jahr \n", name,alter,gehalt);
        System.out.printf(Locale.US, "Unser Mitarbeiter %S ist %08d Jahre alt und verdient %.2f im Jahr \n", name,alter,gehalt);



    }
}
