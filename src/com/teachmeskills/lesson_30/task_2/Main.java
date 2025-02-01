package com.teachmeskills.lesson_30.task_2;

import com.teachmeskills.lesson_30.task_2.factory.CharacterFactory;
import com.teachmeskills.lesson_30.task_2.factory.LocationFactory;
import com.teachmeskills.lesson_30.task_2.model.Location.Location;
import com.teachmeskills.lesson_30.task_2.model.character.Character;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Choose your character: archer, warrior, wizard.");
            String character = sc.next();
            System.out.println("Choose your location: city, forest, desert.");
            String location = sc.next();
            try {
                Character yourCharacter = CharacterFactory.createCharacter(character);
                Location yourLocation = LocationFactory.createLocation(location);
                System.out.println(yourCharacter.characterName() + yourLocation.locationName());
            }catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
