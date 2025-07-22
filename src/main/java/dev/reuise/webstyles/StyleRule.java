package dev.reuise.webstyles;
public class StyleRule {
    private String rule;

    private Style style;

    public StyleRule(String rule, Style style) {
        this.rule = rule;
        this.style = style;
    }

    public String getRule() {
        return rule;
    }

    public Style getStyle() {
        return style;
    }
}