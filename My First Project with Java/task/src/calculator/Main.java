package calculator;
import java.util.Scanner; // Importer la classe Scanner

public class Main {
    public static void main(String[] args) {

        // Initialisation des revenus sous forme de tableau de chaînes de caractères
        String[] incomeSources = {
                "$202", // Bubblegum
                "$118", // Toffee
                "$2250", // Ice Cream
                "$1680", // Milk Chocolate
                "$1075", // Doughnut
                "$80" // Pancake
        };

        // Noms des sources de revenus pour l'affichage
        String[] incomeNames = {
                "Bubblegum",
                "Toffee",
                "Ice Cream",
                "Milk chocolate",
                "Doughnut",
                "Pancake"
        };

        int earnedIncome = 0;

        System.out.println("Earned amount:");
        // Parcourir chaque source de revenu, la convertir en valeur entière et calculer le total
        for (int i = 0; i < incomeSources.length; i++) {
            // Enlever le symbole $ et convertir en entiers
            int value = Integer.parseInt(incomeSources[i].substring(1));
            earnedIncome += value;

            // Afficher le montant pour chaque source de revenu
            System.out.println(incomeNames[i] + ": " + incomeSources[i]);
        }

        // Afficher le revenu total
        System.out.println("Income: $" + earnedIncome);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Staff expenses:");
        int staffExpenses = scanner.nextInt();

        System.out.println("Other expenses:");
        int otherExpenses = scanner.nextInt();

        int totalExpense = staffExpenses + otherExpenses;

        int netIncome = earnedIncome;
        netIncome -= totalExpense;

        System.out.printf("Net income: $%d", netIncome);
    }
}
