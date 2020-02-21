package reader;

import exception.ReaderException;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class FileTextReader {

    public String getText(File file) throws ReaderException {
        String text;
        try {
            text = new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new ReaderException(e);
        }
        return text;
    }
}
