package ru.sal4i.sdiscordwebhook;

import ru.sal4i.sdiscordwebhook.embed.Image;
import ru.sal4i.sdiscordwebhook.embed.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Embed class
 */
public class EmbedObject {
    private final List<Field> fields = new ArrayList<>();
    private String title;
    private String description;
    private String url;
    private Color color;
    private Footer footer;
    private Thumbnail thumbnail;
    private Image image;
    private Author author;

    public EmbedObject() {
    }

    public EmbedObject(String title) {
        this.title = title;
    }

    public EmbedObject(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public EmbedObject(String title, String description, String url) {
        this.title = title;
        this.description = description;
        this.url = url;
    }

    public EmbedObject(String title, String description, String url, Color color) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.color = color;
    }

    public EmbedObject(String title, String description, String url, Color color, Footer footer) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.color = color;
        this.footer = footer;
    }

    public EmbedObject(String title, String description, String url, Color color, Footer footer, Thumbnail thumbnail) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.color = color;
        this.footer = footer;
        this.thumbnail = thumbnail;
    }

    public EmbedObject(String title, String description, String url, Color color, Footer footer, Thumbnail thumbnail, Image image) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.color = color;
        this.footer = footer;
        this.thumbnail = thumbnail;
        this.image = image;
    }

    public EmbedObject(String title, String description, String url, Color color, Footer footer, Thumbnail thumbnail, Image image, Author author) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.color = color;
        this.footer = footer;
        this.thumbnail = thumbnail;
        this.image = image;
        this.author = author;
    }

    /**
     * @return Embed title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title new title
     * @return this EmbedObject with new Title
     */
    public EmbedObject setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * @return Embed description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description new description
     * @return this EmbedObject with new Description
     */
    public EmbedObject setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * @return Embed Url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url - new Url
     * @return this EmbedObject with new Url
     */
    public EmbedObject setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * @return Embed color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color new color
     * @return this EmbedObject with new Color
     */
    public EmbedObject setColor(Color color) {
        this.color = color;
        return this;
    }

    /**
     * @return Embed thumbnail
     */
    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    /**
     * @param url new Thumbnail URL
     * @return this EmbedObject with new Thumbnail
     */
    public EmbedObject setThumbnail(String url) {
        this.thumbnail = new Thumbnail(url);
        return this;
    }

    /**
     * @return Embed image
     */
    public Image getImage() {
        return image;
    }

    /**
     * @param url new Image URL
     * @return this EmbedObject with new Image
     */
    public EmbedObject setImage(String url) {
        this.image = new Image(url);
        return this;
    }

    /**
     * @return Embed footer
     */
    public Footer getFooter() {
        return footer;
    }

    /**
     * @param text footer text
     * @param icon footer icon
     * @return this EmbedObject with new Footer
     */
    public EmbedObject setFooter(String text, String icon) {
        this.footer = new Footer(text, icon);
        return this;
    }

    /**
     * @return Embed author
     */
    public Author getAuthor() {
        return author;
    }

    public EmbedObject setAuthor(String name, String url, String icon) {
        this.author = new Author(name, url, icon);
        return this;
    }

    /**
     * @return Embed fields
     */
    public List<Field> getFields() {
        return fields;
    }

    /**
     * @param name   new Field name
     * @param value  new Field value
     * @param inline Will the field be inline?
     * @return this EmbedObject with new Field added
     */
    public EmbedObject addField(String name, String value, boolean inline) {
        this.fields.add(new Field(name, value, inline));
        return this;
    }

    @Override
    public String toString() {
        return "EmbedObject{" +
                "fields=" + fields +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", color=" + color +
                ", footer=" + footer +
                ", thumbnail=" + thumbnail +
                ", image=" + image +
                ", author=" + author +
                '}';
    }

}
