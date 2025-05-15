package org.example;

import java.io.File;
import java.util.List;

public abstract class BatchProcessor
{
    public void processBatch(String fileName)
    {
        File file=openFile(fileName);
        Parser parser=null;
        parser=createParser(file);
//        if(format.equals("text"))
//            parser=new TextParser(file);
//        else if(format.equals("csv"))
//        parser=new CSVParser(file);

        List<Record> records=parser.parse();
        processRecords(records);
        writeSummary();
        closeFile(file);
    }

    abstract Parser createParser(File fileName);

    private File openFile(String fileName)
    {
        System.out.println("Opening file");
        return null;
    }

    private void processRecords(List<Record> records)
    {
        System.out.println("Processing records");
    }

    private void writeSummary()
    {
        System.out.println("Writing Summary");
    }

    private void closeFile(File file)
    {
        System.out.println("File Closed");
    }

}
