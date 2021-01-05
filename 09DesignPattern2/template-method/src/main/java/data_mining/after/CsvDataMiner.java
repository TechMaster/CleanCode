package data_mining.after;

import data_mining.model.RawData;

import java.io.File;

/**
 * Concrete class
 */
public class CsvDataMiner extends DataMiner {

    @Override
    protected RawData extract(File file) {
        System.out.println("Extracting CSV file ...");
        return new RawData();
    }

}
