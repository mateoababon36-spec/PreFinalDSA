/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalExam;

/**
 *
 * @author User
 */
public class SelectionSortTest {

    public static void main(String[] args) {
        SelectionSort[] players = {
            new SelectionSort("P001", "John", "turtle", 95.50),
            new SelectionSort("P002", "Alucard", "Bat", 88.75),
            new SelectionSort("P003", "Leomord", "hourse", 92.00),
            new SelectionSort("P004", "Alpha", "Wolves", 97.25),
            new SelectionSort("P005", "Layla", "Dog", 85.50),
            new SelectionSort("P006", "Miya", "Cat", 91.25),
            new SelectionSort("P007", "Aldous", "Eagles", 89.50),
            new SelectionSort("P008", "Sun", "Monke", 99.00)
        };

        System.out.println("==============================================");
        System.out.println("        PLAYERS BEFORE SORTING");
        System.out.println("==============================================");

        for (SelectionSort player : players) {
            System.out.println(player);
        }

        System.out.println("\n==============================================");
        System.out.println("        PLAYERS AFTER SORTING");
        System.out.println("==============================================");

        for (SelectionSort player : players) {
            System.out.println(player);
        }
  
        System.out.println("\n==============================================");
        System.out.println("             TOP 3 PLAYERS");
        System.out.println("==============================================");

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + players[i]);
        }
    }
}
