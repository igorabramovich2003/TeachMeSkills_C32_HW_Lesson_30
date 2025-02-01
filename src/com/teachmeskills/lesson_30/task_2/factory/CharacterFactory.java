package com.teachmeskills.lesson_30.task_2.factory;

import com.teachmeskills.lesson_30.task_2.model.character.Character;
import com.teachmeskills.lesson_30.task_2.model.character.impl.Archer;
import com.teachmeskills.lesson_30.task_2.model.character.impl.Warrior;
import com.teachmeskills.lesson_30.task_2.model.character.impl.Wizard;

public interface CharacterFactory {
    public static Character createCharacter(String character) {
        return switch (character.toLowerCase()){
            case "archer" -> new Archer();
            case "warrior" -> new Warrior();
            case "wizard" -> new Wizard();
            default ->  throw new IllegalArgumentException("Invalid character: " + character);
        };
    }
    }
