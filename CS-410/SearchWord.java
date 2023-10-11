/* -------------------------------------------------
 * Author: Prakhar Rampalli
 * Written: 09/29/23
 * Last Updated: 10/09/23
 *
 * Compilation: javac SearchWord.java
 * Execution: java SearchWord
 *
 * Description: A program that searches a large text file for a specified string and count the number of hits for that string.
 * Sample Output:
 * Enter keyword:
 * Word 1: Father
 * Word 2: Heaven
 * Word 3: God
 * Word 4: The
 * Word 5: Canaan
 * Word 6: Thou
 * Count for word The is: 3827
 * Count for word Canaan is: 158
 * Count for word Thou is: 651
 * Count for word God is: 3528
 * Count for word Heaven is: 5
 * Count for word Father is: 243
 * Time to complete search of all 6 strings is: 157 milliseconds.
 -------------------------------------------------*/
import java.util.*;
import java.io.*;
import java.util.concurrent.*;
public class SearchWord{
    public static void main(String[]args){
        // create a file instance for text file
        java.io.File textFile = new java.io.File("C:\\Users\\user\\Desktop\\ASV.txt"); // create a file

        Scanner input = new Scanner(System.in); // create a scanner
        System.out.println("Enter keyword: ");
        ArrayList<String> searchWords = new ArrayList<>();
        for (int i = 0; i < 6; i++){
            System.out.print("Word " + (i + 1) + ": ");
            searchWords.add(input.next());
        } 

        // Create Tasks using ArrayList
        List<Runnable> tasks = new ArrayList<>();
        // Create Thread using ArrayList
        List<Thread> threads = new ArrayList<>();
        for(int i = 0; i < 6; i++){                                                             // goes to all tasks
            Runnable task = new FindTextWord(textFile, searchWords.get(i));                     // initializing runnable task with FindTextWord
            Thread thread1 = new Thread(task);                                                  // placing task as a parameter in Thread
            thread1.start();		                                                                // start thread
            tasks.add(task);                                                                    // create a new task
            threads.add(thread1);                                                               // create a new thread
        }
        long startMilliseconds = System.currentTimeMillis();                                    // start time of thread in millisecond

        try{
            for(int i = 0; i < 6; i++){
                threads.get(i).join();                                                          // waits for thread to finish
            }
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        long endMillisecond = System.currentTimeMillis();                                       // end time of thread in millisecond
        long elapsed = endMillisecond - startMilliseconds;                                      // elapsed time = ending - starting time

        System.out.println("Time to complete search of all 6 strings is: " + elapsed + " milliseconds.");
    }
     // Create a runnable task for searching the word
    static class FindTextWord implements Runnable{
        File fileText;
        String word;
        int totalCount = 0;
 
        public FindTextWord(File fileText, String word){                                       // constructor
            this.fileText = fileText;
            this.word = word;
        }

        public void run(){
            try{
                FileReader fileInput = new FileReader(fileText);                              // used for reading file
                BufferedReader read = new BufferedReader(fileInput);                          // used for reading data in a file
                String line;                                                                  // for BufferedReader
                while((line = read.readLine()) != null){                                      // checks to see if the lines of text in the file is not null
                    if((line.contains(word))){                                                // checks to see if the line contains the input word
                        totalCount++;
                    }
                }
            }    
            catch(IOException e){
                System.out.println(e);
            }
            System.out.println("Count for word " + word + " is: " + totalCount );
        }
    }
}
