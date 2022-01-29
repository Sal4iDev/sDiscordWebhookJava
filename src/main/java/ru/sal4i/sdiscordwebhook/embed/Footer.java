package ru.sal4i.sdiscordwebhook.embed;

/**
 * Embed Footer class
 */
public class Footer {
    private final String text;
    private final String iconUrl;

    public Footer(String text, String iconUrl) {
        this.text = text;
        this.iconUrl = iconUrl;
    }

    /**
     * @return Footer text
     */
    public String getText() {
        return text;
    }

    /**
     * @return Footer icon URL
     */
    public String getIconUrl() {
        return iconUrl;
    }
}
