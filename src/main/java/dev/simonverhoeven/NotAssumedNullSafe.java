package dev.simonverhoeven;

import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.NullUnmarked;
import org.jspecify.annotations.Nullable;

/// Within this class all values are assumed to be potentially null unless otherwise marked
@NullUnmarked
public class NotAssumedNullSafe {

    /// We explicitly state that the return will exclude null
    /// The annotated output is not needed, given the class itself is marked as NullUnmarked
    public @NonNull String method(@NonNull String input) {
        return "";
    }
}
