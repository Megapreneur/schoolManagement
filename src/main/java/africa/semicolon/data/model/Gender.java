package africa.semicolon.data.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;

public enum Gender {
    MALE("M"),
    FEMALE("F");

    private final String name;


    Gender(String name){
        this.name = name;
    }
}
