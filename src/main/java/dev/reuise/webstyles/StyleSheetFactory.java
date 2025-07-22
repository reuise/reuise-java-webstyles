package dev.reuise.webstyles;
import dev.reuise.core.State;
public interface StyleSheetFactory {
    StyleSheet createStyleSheet(State state);
}