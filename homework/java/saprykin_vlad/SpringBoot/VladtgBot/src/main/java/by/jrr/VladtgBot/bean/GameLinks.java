package by.jrr.VladtgBot.bean;

import java.util.Objects;

public class GameLinks {
    private String title;

    private String link;

    private String videoLink;

    public GameLinks() {
    }

    public GameLinks(String title, String link, String videoLink) {
        this.title = title;
        this.link = link;
        this.videoLink = videoLink;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getVideoLink() {
        return videoLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameLinks gameLinks = (GameLinks) o;
        return Objects.equals(title, gameLinks.title) && Objects.equals(link, gameLinks.link) && Objects.equals(videoLink, gameLinks.videoLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, link, videoLink);
    }

    @Override
    public String toString() {
        return "Ваша игра" +
                "\nНазвание " + title  +
                "\nОбзор " + link +
                "\nВидео " + videoLink;
    }
}
