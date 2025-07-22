package dev.reuise.webstyles;
import dev.reuise.core.State;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class StyleBuilder {
    private Map<State, StyleSheet> styleSheets;

    private StyleSheetFactory styleSheetFactory;

    private String id;

    public StyleSheet getStyleSheet(State state) {
        if (styleSheets == null)
            styleSheets = new HashMap();

        if (styleSheets.containsKey(state))
            return styleSheets.get(state);

        StyleSheet styleSheet = styleSheetFactory.createStyleSheet(state);
        styleSheets.put(state, styleSheet);
        return styleSheet;
    }

    public Collection<StyleSheet> getStyleSheets() {
        if (styleSheets == null)
            return null;

        return styleSheets.values();
    }

    public Set<State> getStates() {
        if (styleSheets == null)
            styleSheets = new HashMap();

        return styleSheets.keySet();
    }

    public StyleBuilder() {
    }

    public StyleBuilder(String id) {
        this.id = id;
    }

    public Style addRule(String rule, State state) {
        StyleSheet styleSheet = getStyleSheet(state);
        return styleSheet.addRule(rule, state);
    }

    public Style addRule(String rule) {
        return addRule(rule, null);
    }

    public StyleSheet addAtRule(String atRule, State state) {
        StyleSheet styleSheet = getStyleSheet(state);
        return styleSheet.addAtRule(atRule, state);
    }

    public StyleSheet addAtRule(String atRule) {
        return addAtRule(atRule, null);
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        this.styleSheetFactory = styleSheetFactory;
    }
}