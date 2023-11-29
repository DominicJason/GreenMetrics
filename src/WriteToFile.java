import java.io.*;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        //Scanner myObj = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Last place went: ");
        String lastLocation = sc.next();
        System.out.println("Date: ");
        int date = sc.nextInt();
        System.out.println("Last location: " + " " + lastLocation + "\n" + "Date:" + " " + date);
        sc.close();


        try(FileWriter fw = new FileWriter("history_db.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(lastLocation + " " + date);
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
        }







    }


}



