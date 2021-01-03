package data_mining.before;

import data_mining.model.AnalysisResult;
import data_mining.model.RawData;

import java.io.File;

public class CsvDataMiner {

    public void mine(String path) {
        File file = openFile(path);
        RawData rawData = extractCsv(file);
        AnalysisResult analysisResult = analyze(rawData);
        report(analysisResult);
        closeFile(file);
    }

    private File openFile(String path) {
        System.out.println("Opening file ...");
        return new File(path);
    }

    private RawData extractCsv(File file) {
        System.out.println("Extracting CSV file ...");
        return new RawData();
    }

    private AnalysisResult analyze(RawData rawData) {
        System.out.println("Analyzing ...");
        return new AnalysisResult();
    }

    private void report(AnalysisResult analysisResult) {
        System.out.println("Reporting ...");
    }

    private void closeFile(File file) {
        System.out.println("Closing file ...");
    }

}
