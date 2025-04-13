package question3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class question3 {

    public static void main(String[] args) {
        try {
            
            File q3 = new File("textfile.txt"); 
            Scanner myReader = new Scanner(q3);
            Map<String, Integer> wordCount = new HashMap<>();
            
            // -----------------------1-----------------------------------
            while (myReader.hasNext()) {
                String word = myReader.next().trim(); // trim --> 移除字符串前后两边的空格、Tab、换行符等“空白字符”。
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1); // getOrDefault --> 如果没有找到指定的键，则返回默认值（0）。
            }

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue()); 
            }

            myReader.close(); 

            // -----------------------2: SORT-----------------------------------
            List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCount.entrySet());
            sortedList.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue()); 

            // print
            System.out.println("Sorted word frequencies:");
            for (Map.Entry<String, Integer> entry : sortedList) {
                System.out.println(entry.getKey() + ": " + entry.getValue()); 
            }

            // // -----------------------3-----------------------------------
            FileWriter writer = new FileWriter("sort.txt");
            for (Map.Entry<String, Integer> entry : sortedList) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n"); 
            }
            writer.close(); 
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
