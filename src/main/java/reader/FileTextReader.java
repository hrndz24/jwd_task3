package reader;

import exception.ReaderException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class FileTextReader {

    private static Logger logger = LogManager.getLogger();
    public String getText(File file) throws ReaderException {
        String text;
        try {
            text = new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8);
        } catch (IOException e) {
            logger.warn(e);
            throw new ReaderException(e);
        }
        return text;
    }
}
