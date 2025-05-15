package org.example;

import java.io.File;

public class CSVBatchProcessor extends BatchProcessor
{
    @Override
    Parser createParser(File fileName) {
        return new CSVParser(fileName);
    }
}
