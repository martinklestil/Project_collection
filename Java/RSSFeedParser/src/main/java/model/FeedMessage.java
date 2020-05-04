package model;

public class FeedMessage {

    String title;
    String description;
    String link;
    String guid;
    String pubDate;
    String geoLong;
    String geoLat;
    String eventDate;
    String category;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    public String getGuid() {
        return guid;
    }

    public String getPubDate() {
        return pubDate;
    }

    public String getGeoLong() {
        return geoLong;
    }

    public String getGeoLat() {
        return geoLat;
    }

    public String getEventDate() {
        return eventDate;
    }

    public String getCategory() {
        return category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public void setGeoLong(String geoLong) {
        this.geoLong = geoLong;
    }

    public void setGeoLat(String geoLat) {
        this.geoLat = geoLat;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FeedMessage{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", link='" + link + '\'' +
                ", guid='" + guid + '\'' +
                ", pubDate='" + pubDate + '\'' +
                ", geoLong='" + geoLong + '\'' +
                ", geoLat='" + geoLat + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
