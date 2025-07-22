package dev.reuise.webstyles;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StyleProperty {
    private String name;
    private Set<DataType> dataTypes;

    public enum DataType {
        STRING, URL, INTEGER, NUMBER, LENGTH, PERCENTAGE
    }

    public StyleProperty(String name, Set<DataType> dataTypes) {
        this.name = name;
        this.dataTypes = dataTypes;
    }

    public StyleProperty(String name) {
        this(name, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean acceptsDataType(DataType type) {
        if (dataTypes == null || dataTypes.isEmpty())
            return false;
        return dataTypes.contains(type);
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == null)
            return false;
        if (getClass() != other.getClass())
            return false;
        return getName().equals(((StyleProperty) other).getName());
    }

    public String parseProperty(Object value) {
        if (value == null)
            return "";

        if (value instanceof String)
            return ((String) (value));

        if (value instanceof Double) {
            if (acceptsDataType(StyleProperty.DataType.LENGTH))
                return ((Double) (value)).toString() + "px";
            else if (acceptsDataType(StyleProperty.DataType.PERCENTAGE))
                return ((Double) (value)).toString() + "%";
            return ((Double) (value)).toString();
        }

        if (value instanceof Integer) {
            if (acceptsDataType(StyleProperty.DataType.LENGTH))
                return ((Integer) (value)).toString() + "px";
            else if (acceptsDataType(StyleProperty.DataType.PERCENTAGE))
                return ((Integer) (value)).toString() + "%";
            return ((Integer) (value)).toString();
        }

        if (value instanceof Object[]) {
            return Arrays.stream((Object[]) value)
                .map(this::parseProperty)
                .collect(Collectors.joining(" "));
        }

        return null;
    }
}
