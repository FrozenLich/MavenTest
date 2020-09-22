import java.util.Scanner;

public class WordsCount {

    public static void main(String[] args) {
        System.out.println("Hello Maven");
    }

    public static int count(String s) {
        String ex = s.trim();
        String[] wordsList = ex.split(" ");

//        if(ex.length() == 0)
//            System.out.println("The words count is 0");
//        else
//            System.out.println("The words count is " + wordsList.length);
        return ex.length() == 0 ? 0 : wordsList.length;
    }
}