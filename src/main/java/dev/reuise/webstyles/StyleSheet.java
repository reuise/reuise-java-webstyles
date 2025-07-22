package dev.reuise.webstyles;
import dev.reuise.core.State;
import java.util.Map;
public interface StyleSheet {
    StyleSheet getAtRule(String atRule);

    Style getRule(String rule, State state);

    void setRule(String rule, Style style);

    void setAtRule(String atRule, StyleSheet styleSheet);

    void appendRule(String rule, Style style);

    Map<String, Style> getRules();

    Map<String, StyleSheet> getAtRules();

    String getStateQuery();

    Style addRule(String rule, State state);

    Style addRule(String rule);

    StyleSheet addAtRule(String rule, State state);

    StyleSheet addAtRule(String rule);

    String getStateKey();

    String getCssText();
}