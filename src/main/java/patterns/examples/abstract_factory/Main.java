package patterns.examples.abstract_factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, MediaItemFactory> mediaCreators = new HashMap<>();
        mediaCreators.put("book", new BookFactory());
        mediaCreators.put("movie", new MovieFactory());

        Collection<MediaItem> items = generateMediaItems(mediaCreators);


        for (MediaItem item : items) {
            item.print();
        }
    }

    private static Collection<MediaItem> generateMediaItems(Map<String, MediaItemFactory> mediaCreators) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Collection<MediaItem> items = new ArrayList<>();
        String input = "";
        do {
            System.out.println("Enter book, movie, or quit");
            input = readLine(bufferedReader);
            if (mediaCreators.containsKey(input)){
                MediaItem mediaItem = mediaCreators.get(input).create();
                items.add(mediaItem);
            }
        } while(!input.equals("quit"));
        return items;
    }

    private static String readLine(BufferedReader bufferedReader) {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
