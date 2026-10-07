/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalExam;

/**
 *
 * @author User
 */
public class SelectionSort {
    String playerId;
    String name;
    String teamName;
    double score;

    public SelectionSort(String playerId, String name, String teamName, double score) {
        this.playerId = playerId;
        this.name = name;
        this.teamName = teamName;
        this.score = score;
    }

    public String getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return String.format("Player ID: %-6s | Name: %-15s | Team: %-12s | Score: %.2f", playerId, name, teamName, score);
    }
}
