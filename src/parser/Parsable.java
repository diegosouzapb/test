package parser;

import java.io.File;

public interface Parsable<E> {

    E parse(File file);

}
