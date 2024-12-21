package dev.simonverhoeven;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/// Within this class all values are assumed to be null safe unless otherwise marked
@NullMarked
public class AssumedNullSafe {

    /// We explicitly state that the return might be null
    /// The annotated input is not needed, given the class itself is marked as NullMarked
    public @Nullable String method(@NonNull String input) {
        return null;
    }
}
