package ru.sal4i.sdiscordwebhook.embed;

/**
 * Embed Image class
 */
public class Image {
    private final String url;

    public Image(String url) {
        this.url = url;
    }

    /**
     * @return Image URL
     */
    public String getUrl() {
        return url;
    }
}
