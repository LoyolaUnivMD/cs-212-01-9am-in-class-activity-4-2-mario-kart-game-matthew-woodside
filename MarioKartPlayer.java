// Programmer(s): Matthew Woodside
// Course: CS212
// Due Date: 2/2/2024
// In Class Assignment: 4.2
// Problem Statement: Very simple Mario Kart program that allows the users to play
// Data In: Names
// Data Out: Name of players, name of characters, speed
// Credits: Nintendo
public class MarioKartPlayer {

    // Data fields
    private String player_name;
    private String character;
    private int speed;

    // General Constructor
    public MarioKartPlayer(String player_name, String character, int speed){
        this.player_name = player_name;
        this.character = character;
        this.speed = speed;
    }

    // Default Constructor
    public MarioKartPlayer(){
        this.player_name = "not defined";
        this.character = "not defined";
        this.speed = 0;
    }

    // Method to increase speed
    public void boost(){
        speed = speed + 25;
    }

    // Method to display information
    public void displayInfo(){
        System.out.println("Name: " + player_name);
        System.out.println("Character: " + character);
        System.out.println("Speed: " + speed);
    }
}
