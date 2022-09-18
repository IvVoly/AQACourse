package lesson10;

/*1. Read about java.nio package(Path, Paths, Files, File) and try to use it to read the data from the first file
        and write this data to the second file. Delete the initial file from the disk.*/

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static List<String> readFileAndDelete() {
        String separator = FileSystems.getDefault().getSeparator();
        Path p = Paths.get("src" + separator + "lesson10" + separator + "TestTask10.txt");
        List<String> data = new ArrayList<>();
        try {
            data = Files.readAllLines(p);
            Files.delete(p);
        } catch (IOException e) {
            System.err.println("File not found");
        }
        return data;
    }

    public static void writeFile(List<String> data) {
        String separator = FileSystems.getDefault().getSeparator();
        Path p = Paths.get("src" + separator + "lesson10" + separator + "TestTask10second.txt");
        try {
            Files.write(p, data);
        } catch (IOException e) {
            System.err.println("File not found");
        }
    }

    public static void main(String[] args) {
        List<String> data = readFileAndDelete();
        writeFile(data);
    }
}

