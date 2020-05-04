package model;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.XMLEvent;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class RSSFeedParser {
    static final String TITLE = "title";
    static final String LINK = "link";
    static final String DESCRIPTION = "description";
    static final String LASTBUILDDATE = "lastBuildDate";
    static final String ITEM = "item";
    static final String PUBDATE = "pubDate";
    static final String GEOLONG = "long";
    static final String GEOLAT = "lat";
    static final String EVENTDATE = "eventDate";
    static final String CATEGORY = "category";

    private final URL mURL;

    public RSSFeedParser(String feedUrl) {
        try {
            this.mURL = new URL(feedUrl);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public Feed readFeed() {
        Feed feed = null;
        try {
            boolean isFeedHeader = true;
            // Set header values intial to the empty string
            String title = "";
            String description = "";
            String link = "";
            String pubdate = "";
            String geoLong = "";
            String geoLat = "";
            String eventDate = "";
            String category = "";
            String lastBuildDate = "";
            // First create a new XMLInputFactory
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            // Setup a new eventReader
            InputStream in = read();
            XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
            // read the XML document
            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();
                if (event.isStartElement()) {
                    String localPart = event.asStartElement().getName()
                            .getLocalPart();
                    switch (localPart) {
                        case ITEM:
                            if (isFeedHeader) {
                                isFeedHeader = false;
                                feed = new Feed(title,link,description,lastBuildDate);
                            }
                            event = eventReader.nextEvent();
                            break;
                        case TITLE:
                            title = getCharacterData(event, eventReader);
                            break;
                        case LINK:
                            link = getCharacterData(event, eventReader);
                            break;
                        case DESCRIPTION:
                            description = getCharacterData(event, eventReader);
                            break;
                        case LASTBUILDDATE:
                            lastBuildDate = getCharacterData(event, eventReader);
                            break;
                        case PUBDATE:
                            pubdate = getCharacterData(event, eventReader);
                            break;
                        case GEOLAT:
                            geoLat = getCharacterData(event, eventReader);
                            break;
                        case GEOLONG:
                            geoLong = getCharacterData(event, eventReader);
                            break;
                        case EVENTDATE:
                            eventDate = getCharacterData(event, eventReader);
                            break;
                        case CATEGORY:
                            category = getCharacterData(event, eventReader);
                            break;
                    }
                } else if (event.isEndElement()) {
                    if (event.asEndElement().getName().getLocalPart() == (ITEM)) {
                        FeedMessage message = new FeedMessage();
                        message.setTitle(title);
                        message.setDescription(description);
                        message.setLink(link);
                        message.setPubDate(pubdate);
                        message.setGeoLong(geoLong);
                        message.setGeoLat(geoLat);
                        message.setEventDate(eventDate);
                        message.setCategory(category);
                        feed.getEntries().add(message);
                        event = eventReader.nextEvent();
                        continue;
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return feed;


    }

    private String getCharacterData(XMLEvent event, XMLEventReader eventReader)
            throws XMLStreamException {
        String result = "";
        event = eventReader.nextEvent();
        if (event instanceof Characters) {
            result = event.asCharacters().getData();
        }
        return result;
    }

    private InputStream read() {
        try {
            return mURL.openStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
