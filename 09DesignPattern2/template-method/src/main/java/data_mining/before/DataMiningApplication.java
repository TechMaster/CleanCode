package data_mining.before;

public class DataMiningApplication {

    public static void main(String[] args) {
        DocDataMiner docDataMiner = new DocDataMiner();
        docDataMiner.mine("/path/to/doc");

        CsvDataMiner csvDataMiner = new CsvDataMiner();
        csvDataMiner.mine("/path/to/csv");

        PdfDataMiner pdfDataMiner = new PdfDataMiner();
        pdfDataMiner.mine("/path/to/pdf");
    }

}
