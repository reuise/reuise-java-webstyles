package dev.reuise.webstyles;
import dev.reuise.core.State;
import java.util.Map;
public interface StyleSheet {
    StyleSheet getAtRule(String atRule);

    StyleSheet getRule(String rule, State state);

    void setRule(String rule, StyleSheet style);

    void setAtRule(String atRule, StyleSheet styleSheet);

    void appendRule(String rule, Style style);

    Map<String, StyleSheet> getRules();

    Map<String, StyleSheet> getAtRules();

    String getStateQuery();

    StyleSheet addRule(String rule, State state);

    StyleSheet addRule(String rule);

    StyleSheet addAtRule(String rule, State state);

    StyleSheet addAtRule(String rule);

    String getStateKey();

    String getCssText();
}