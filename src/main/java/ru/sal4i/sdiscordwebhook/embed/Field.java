package ru.sal4i.sdiscordwebhook.embed;

/**
 * Embed Field class
 */
public class Field {
    private final String name;
    private final String value;
    private final boolean inline;

    public Field(String name, String value, boolean inline) {
        this.name = name;
        this.value = value;
        this.inline = inline;
    }

    /**
     * @return Field name
     */

    public String getName() {
        return name;
    }

    /**
     * @return Field value
     */

    public String getValue() {
        return value;
    }

    /**
     * @return Is Field inline?
     */

    public boolean isInline() {
        return inline;
    }

    @Override
    public String toString() {
        return "Field[" +
                "name=" + name + ", " +
                "value=" + value + ", " +
                "inline=" + inline + ']';
    }
}