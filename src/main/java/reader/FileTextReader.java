package reader;

import exception.ReaderException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileTextReader {

    public String getText(File file) throws ReaderException {
        String text;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            text = new String(Files.readAllBytes(Paths.get("file")), StandardCharsets.UTF_8);
        } catch (IOException e){
            throw new ReaderException(e);
        }
        return text;
    }
}
