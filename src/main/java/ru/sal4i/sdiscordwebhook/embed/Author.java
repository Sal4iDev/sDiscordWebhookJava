package ru.sal4i.sdiscordwebhook.embed;

/**
 * Embed Author Class
 */
public class Author {
    private final String name;
    private final String url;
    private final String iconUrl;

    public Author(String name, String url, String iconUrl) {
        this.name = name;
        this.url = url;
        this.iconUrl = iconUrl;
    }

    /**
     * @return Author name
     */
    public String getName() {
        return name;
    }

    /**
     * @return Author URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * @return Author icon URL
     */
    public String getIconUrl() {
        return iconUrl;
    }

}
