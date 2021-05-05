package by.jrr.VladtgBot.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AbstractParser {

    protected static Document getPage(String url) throws IOException {
        Document page = Jsoup.parse(new URL(url), 15000);
        return page;
    }

    protected static String getFromString(String stringAge, Pattern pattern) throws Exception {
        Matcher matcher = pattern.matcher(stringAge);
        if (matcher.find()) {
            return matcher.group();
        }
        throw new Exception("error");
    }
}
