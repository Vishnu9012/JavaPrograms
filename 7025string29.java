import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

 class String29{
    public static void main(String[] args) {
        try {
            String filePath = "your_text_file_path.txt"; 
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line;
            StringBuilder content = new StringBuilder();

            
            while ((line = reader.readLine()) != null) {
                content.append(line).append(" ");
            }

            reader.close();

            
            String[] words = content.toString().toLowerCase().split("\\s+");

            Map<String, Integer> wordCount = new HashMap<>();

            for (String word : words) {
                
                word = word.replaceAll("[^a-zA-Z]", "");

                if (!word.isEmpty()) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }

            
            String mostRepeatedWord = "";
            int maxCount = 0;

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    mostRepeatedWord = entry.getKey();
                }
            }

            System.out.println("Most Repeated Word: " + mostRepeatedWord);
            System.out.println("Count: " + maxCount);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
