package dev.simonverhoeven;

import org.jspecify.annotations.Nullable;

public class App {
    // Array of nullable texts
    private String @Nullable[] someTexts = new String[5];
    // Nullable array
    private @Nullable String[] someOtherTexts = null;
}
