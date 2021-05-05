package by.jrr.VladtgBot.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EconomicParser extends AbstractParser {

    protected final int TIMEOUT_MILLISECONDS = 15000;

    private static String fileName = "EconomicGameBoards";
    private static String fileFormat = ".csv";
    private static String filePath = "src/main/resources/";
    private static Pattern playersPattern = Pattern.compile("(?!\\\\S)Количество игроков (?!\\\\S)[0-9+#-]+");
    private static Pattern agePattern = Pattern.compile("(?!\\\\S)Возраст игроков (?!\\\\S)[0-9+]+");
    private static final String MAIN = "http://www.nastolki.by/%D1%8D%D0%BA%D0%BE%D0%BD%D0%BE%D0%BC%D0%B8%D1%87%D0%B5%D1%81%D0%BA%D0%B8%D0%B5-page-";

    public static void main(String[] args) throws Exception {
        System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");
        int pageNumbers = 5;
        FileWriter csvWriter = new FileWriter(filePath + fileName + fileFormat);

        csvWriter.append("title");
        csvWriter.append(",");
        csvWriter.append("price");
        csvWriter.append(",");
        csvWriter.append("age");
        csvWriter.append(",");
        csvWriter.append("quantity");
        csvWriter.append(",");
        csvWriter.append("link");
        csvWriter.append("\n");


        for (int i = 1; i <= pageNumbers; i++) {

            Document page = getPage(MAIN + i + "/");

            Element tableCont = page.select("#content > div > div.catalog-view-display.catalog-products.spacer.clearfix").first(); // find table

            Elements itemCells = tableCont.select("div > div > div.catalog-product-title");

            for (Element element : itemCells) {

                String gameLink = element.select(" a").attr("href");


                System.out.println(gameLink);
                Document innerPage = getPage(gameLink);
                Element descriptionSection = innerPage.select("#content").first();

                String gameTitle = descriptionSection.select("div > div.product-page-top > h1").text();
                System.out.println(gameTitle);
                String gamePrice = descriptionSection.select("#product_price").text();
                System.out.println(gamePrice);

                String gameGeneralInfoTable = descriptionSection.select("div.product-page-blocks.gap-left.gap-right.clearfix > div.product-description.product-page-block > div > table").text();
                System.out.println(gameGeneralInfoTable);
                String gameAge = getFromString(gameGeneralInfoTable, agePattern);
                String gamersQuantity = getFromString(gameGeneralInfoTable, playersPattern);

                System.out.println(gameAge);
                System.out.println(gamersQuantity);

                csvWriter.append(gameTitle);
                csvWriter.append(",");
                csvWriter.append(gamePrice);
                csvWriter.append(",");
                csvWriter.append(gameAge);
                csvWriter.append(",");
                csvWriter.append(gamersQuantity);
                csvWriter.append(",");
                csvWriter.append(gameLink);
                csvWriter.append("\n");

            }
        }
        csvWriter.flush();
        csvWriter.close();
    }

}
