package org.example;

import java.io.File;

public class TextBatchProcessor extends BatchProcessor {
    @Override
    Parser createParser(File file) {
        return new TextParser(file);
    }
}
