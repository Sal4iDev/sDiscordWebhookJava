package ru.sal4i.sdiscordwebhook.embed;

/**
 * Embed Thumbnail class
 */
public class Thumbnail {
    private final String url;

    public Thumbnail(String url) {
        this.url = url;
    }

    /**
     * @return Thumbnail URL
     */

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Thumbnail[" +
                "url=" + url + ']';
    }

}