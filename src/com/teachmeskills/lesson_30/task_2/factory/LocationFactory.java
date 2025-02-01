package com.teachmeskills.lesson_30.task_2.factory;

import com.teachmeskills.lesson_30.task_2.model.Location.Location;
import com.teachmeskills.lesson_30.task_2.model.Location.impl.City;
import com.teachmeskills.lesson_30.task_2.model.Location.impl.Desert;
import com.teachmeskills.lesson_30.task_2.model.Location.impl.Forest;

public interface LocationFactory {
    public static Location createLocation(String location){
        return switch (location.toLowerCase()){
            case "city" -> new City();
            case "desert" -> new Desert();
            case "forest" -> new Forest();
            default -> throw new IllegalArgumentException("Invalid location: " + location);
        };
    }
}
