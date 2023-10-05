package my.solution.random;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomString {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final Random RANDOM = new Random();

    private static final List<String> stringList = new LinkedList<>();

    public static void main(String[] args) {
        for (int i = 0 ; i<10;i++){
            int length = ThreadLocalRandom.current().nextInt(0,12);
            stringList.add( getRandomWord(length) );
        }

        System.out.println(stringList);
    }

    private static   String getRandomWord(int length) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0 ; i<length;i++){
           stringBuilder.append( ALPHABET.charAt( RANDOM.nextInt(ALPHABET.length() )) ) ;
        }
        return stringBuilder.toString();
    }
}
