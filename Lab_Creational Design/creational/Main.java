package creational;

public class Main {

    public static void main(String[] args) {

        // Current usage
        BookMetadataExporter exporter = new CSVBookMetadataExporter();
        // BookMetadataExporter exporter = new XMLBookMetadataExporter();
        // BookMetadataExporter exporter = new JSONBookMetadataExporter();
        exporter.add(TestData.sailboatBook);
        exporter.add(TestData.GoFBook);
        exporter.add(TestData.cleanArchBook);
        exporter.add(TestData.dinosaurBook);
        exporter.add(TestData.dragonBook);
        exporter.export(System.out);

        // Expected usage
        // BookMetadataExporter exporter = new XMLBookMetadataExporter();
        // exporter.add(TestData.sailboatBook);
        // exporter.add(TestData.GoFBook);
        // exporter.export(System.out);
    }
}
