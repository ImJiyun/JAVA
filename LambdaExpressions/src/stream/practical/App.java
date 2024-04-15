package stream.practical;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws IOException {
        // stream: a pipeline that consists of a source, intermediate operations, then a terminal operation

        // IntStream.range(1, 10) -> source
        // forEach -> terminal operation (loop)
        IntStream.range(1, 10).forEach(x -> System.out.println(x)); // 1 ~ 9

        // Integer Stream with skip
        IntStream.range(1, 10) // source
                .skip(5) // skip 5 elements of the stream // intermediate operation
                .forEach(x -> System.out.println(x)); // 6 ~ 9 // terminal operation



        // Integer stream with sum
        int val = IntStream
                .range(1, 5) // intermediate operation
                .sum(); // terminal operation
        System.out.println(val); // 10

        // Stream.of, sorted and findFirst
        Stream.of("Hello", "bottle", "America") // source
                .sorted() // intermediate operation, returns a Stream object
                .findFirst()// terminal operation
                .ifPresent(x -> System.out.println(x)); // prevent a null

        // Stream from Array, sort, filter and print
        String[] items = {"car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy"};
        Stream.of(items)
                .filter(x -> x.startsWith("t")) // intermediate operation
                .sorted() // intermediate operation
                .forEach(x -> System.out.print(x + ", ")); // terminal operation

        System.out.println();

        // Average of squares of an int array
        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average() // terminal operation
                .ifPresent(n -> System.out.println(n));

        // Stream from a list, filter and print
        List<String> listOfItems = Arrays.asList("Computer", "Toothpaste", "Box", "Pencil", "Car");
        listOfItems.stream()
                .map(x -> x.toLowerCase())
                .filter(x -> x.startsWith("c"))
                .sorted()
                .forEach(x -> System.out.println(x));

        // Read file
        Stream<String> lines = Files.lines(Paths.get("files/wordFile.txt"));
        lines.filter(l -> l.length() > 6)
                .sorted()
                .forEach(x -> System.out.print(x + ", "));
        lines.close();

        List<String> words = Files.lines(Paths.get("files/wordFile.txt"))
                .filter(x -> x.contains("th"))
                .collect(Collectors.toList()); // convert Stream data to a collection list
        words.forEach(x -> System.out.println(x + ", "));

        Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"));
        int rowCount = (int) rows
                .map(x -> x.split(","))
                .filter(x -> x.length > 3)
                .count(); // terminal operation

        System.out.println(rowCount + " good rows.");

        rows.map(x -> x.split(","))
                .filter(x -> x.length > 3)
                .filter(x -> Integer.parseInt(x[1].trim()) > 15)
                .forEach(x -> System.out.println(x[0].trim() + " " + x[2].trim() + " " + x[3].trim()));
        rows.close();

    }
}
