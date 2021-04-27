package by.jrr.VladtgBot.config;

import by.jrr.VladtgBot.bean.ProductNastolkiBy;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CsvFileToBean {
    public static void main(String[] args) throws FileNotFoundException {

        Map<String, String> mapping = new
                HashMap<String, String>();
        mapping.put("title", "title");
        mapping.put("price", "price");
        mapping.put("age", "age");
        mapping.put("quantity", "quantity");
        mapping.put("link", "link");

        HeaderColumnNameTranslateMappingStrategy<ProductNastolkiBy> strategy =
                new HeaderColumnNameTranslateMappingStrategy<ProductNastolkiBy>();
        strategy.setType(ProductNastolkiBy.class);
        strategy.setColumnMapping(mapping);

        CSVReader csvReader = null;
        try {
            csvReader = new CSVReader(new FileReader
                    ("src/main/resources/nastolki.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        CsvToBean csvToBean = new CsvToBean();


        List<ProductNastolkiBy> list = csvToBean.parse(strategy, csvReader);
        // print details of Bean object
        for (ProductNastolkiBy e : list) {
            System.out.println(e);
        }

    }

}

