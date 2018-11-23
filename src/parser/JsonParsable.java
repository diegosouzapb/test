package parser;

import parser.domain.JsonObject;

import java.io.File;

public class JsonParsable implements Parsable {

    @Override
    public JsonObject parse(File file) {
        return new JsonObject();
    }

}
