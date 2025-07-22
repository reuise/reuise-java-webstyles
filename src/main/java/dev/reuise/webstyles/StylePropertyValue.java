package dev.reuise.webstyles;

public class StylePropertyValue {
    private StyleProperty property;
    private Object value;
    private boolean priority;

    public StylePropertyValue(StyleProperty property, Object value, boolean priority) {
        this.property = property;
        this.value = value;
        this.priority = priority;
    }

    public StylePropertyValue(StyleProperty property, Object value) {
        this(property, value, false);
    }

    public StyleProperty getProperty() {
        return property;
    }

    public void setProperty(StyleProperty property) {
        this.property = property;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    public String getCssText() {
        return property.getName()+":"+parseProperty(value)+(priority ? "!important" : "");
    }

    public String parseProperty(Object value) {
        return property.parseProperty(value);
    }
}
