package by.jrr.VladtgBot.config;

import by.jrr.VladtgBot.bean.GameLinks;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CsvFileToGameLinks {

    static String linkToPartyGamesCsvFile = "src/main/resources/PartyGames.csv";
    static String linkToWarGamesCsvFile = "src/main/resources/WarGames.csv";

    public String getWarGames(){
        Map<String, String> mapping = new
                HashMap<String, String>();
        mapping.put("название", "title");
        mapping.put("обзор", "link");
        mapping.put("видео", "videolink");

        HeaderColumnNameTranslateMappingStrategy<GameLinks> strategy =
                new HeaderColumnNameTranslateMappingStrategy<GameLinks>();
        strategy.setType(GameLinks.class);
        strategy.setColumnMapping(mapping);

        CSVReader csvReader = null;
        try {
            csvReader = new CSVReader(new FileReader
                    (linkToWarGamesCsvFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        CsvToBean csvToBean = new CsvToBean();


        List<GameLinks> list = csvToBean.parse(strategy, csvReader);
        // print details of Bean object
        for (GameLinks e : list) {
            System.out.println(e);
        }
        return String.valueOf(list);
    }

    public String getPartyGames(){
        Map<String, String> mapping = new
                HashMap<String, String>();
        mapping.put("название", "title");
        mapping.put("обзор", "link");
        mapping.put("видео", "videolink");

        HeaderColumnNameTranslateMappingStrategy<GameLinks> strategy =
                new HeaderColumnNameTranslateMappingStrategy<GameLinks>();
        strategy.setType(GameLinks.class);
        strategy.setColumnMapping(mapping);

        CSVReader csvReader = null;
        try {
            csvReader = new CSVReader(new FileReader
                    (linkToPartyGamesCsvFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        CsvToBean csvToBean = new CsvToBean();


        List<GameLinks> list = csvToBean.parse(strategy, csvReader);
        // print details of Bean object
        for (GameLinks e : list) {
            System.out.println(e);
        }
        return String.valueOf(list);
    }


    public static void main(String[] args) throws FileNotFoundException {
        CsvFileToGameLinks csvFileToGameLinks = new CsvFileToGameLinks();
       // csvFileToGameLinks.getPartyGames();
        csvFileToGameLinks.getWarGames();
       /* Map<String, String> mapping = new
                HashMap<String, String>();
        mapping.put("название", "title");
        mapping.put("обзор", "link");
        mapping.put("видео", "videolink");


        HeaderColumnNameTranslateMappingStrategy<GameLinks> strategy =
                new HeaderColumnNameTranslateMappingStrategy<GameLinks>();
        strategy.setType(GameLinks.class);
        strategy.setColumnMapping(mapping);

        CSVReader csvReader = null;
        try {
            csvReader = new CSVReader(new FileReader
                    ("src/main/resources/PartyGames.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        CsvToBean csvToBean = new CsvToBean();


        List<GameLinks> list = csvToBean.parse(strategy, csvReader);
        // print details of Bean object
        for (GameLinks e : list) {
            System.out.println(e);
        }*/

    }

}
