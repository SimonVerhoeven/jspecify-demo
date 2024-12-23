package dev.simonverhoeven;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.util.Arrays;

public class App {
    // Array of nullable Strings
    private final String[] arrayOfNullableTexts;
    // Nullable array
    private String @Nullable [] nullableArray = null;
    // Nullable array
    private @NonNull String @Nullable [] nullableArrayOfNullableStrings = null;

    public App() {
        arrayOfNullableTexts = new String[]{null, "", null, null, null};
        nullableArray = new String[]{null, "", null, null, null};
    }

    public String[] getArrayOfNullableTexts() {
        System.out.println(Arrays.toString(nullableArray));
        return arrayOfNullableTexts;
    }
}
