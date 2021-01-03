package data_mining.after;

import data_mining.model.AnalysisResult;
import data_mining.model.RawData;

import java.io.File;

public abstract class DataMiner {

    public void mine(String path) {
        File file = openFile(path);
        RawData rawData = extract(file);
        AnalysisResult analysisResult = analyze(rawData);
        report(analysisResult);
        closeFile(file);
    }

    protected File openFile(String path) {
        System.out.println("Opening file ...");
        return new File(path);
    }

    protected abstract RawData extract(File file);

    protected AnalysisResult analyze(RawData rawData) {
        System.out.println("Analyzing ...");
        return new AnalysisResult();
    }

    protected void report(AnalysisResult analysisResult) {
        System.out.println("Reporting ...");
    }

    protected void closeFile(File file) {
        System.out.println("Closing file ...");
    }

}
