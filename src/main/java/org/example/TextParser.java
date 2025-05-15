package org.example;

import java.io.File;
import java.util.List;

public class TextParser implements Parser
{
    public TextParser() {
    }

    public TextParser(File file)
    {
        System.out.println("Creating TextParser");
    }

    public List<Record> parse()
    {
        System.out.println("parsing text file and creating records");
        return null;
    }
}
