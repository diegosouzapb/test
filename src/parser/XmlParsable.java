package parser;

import parser.domain.XmlObject;

import java.io.File;

public class XmlParsable implements Parsable {

    @Override
    public XmlObject parse(File file) {
        return new XmlObject();
    }
}
