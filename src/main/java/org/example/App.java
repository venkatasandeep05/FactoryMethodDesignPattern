package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BatchProcessor batchProcessor=createBatchProcessor("text");
        batchProcessor.processBatch("temp-file");
        System.out.println("Batch Process work is completed");
    }

    private static BatchProcessor createBatchProcessor(String arg) {
        if(arg.equals("csv"))
            return new CSVBatchProcessor();
        else if(arg.equals("text"))
            return new TextBatchProcessor();
        else
            return null;
    }
}
