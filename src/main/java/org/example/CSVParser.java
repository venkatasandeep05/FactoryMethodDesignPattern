package org.example;

import java.io.File;
import java.util.List;

public class CSVParser implements Parser {
    public CSVParser(File file)
    {
        System.out.println("Creating CSV Parser");
    }

    @Override
    public List<Record> parse() {
        System.out.println("Parsing csv file");
        return null;
    }
}
