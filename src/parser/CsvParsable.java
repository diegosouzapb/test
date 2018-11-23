package parser;

import java.io.File;

public class CsvParsable implements Parsable {

    @Override
    public CsvParsable parse(File file) {
        return new CsvParsable();
    }
}
