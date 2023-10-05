package my.solution.random;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomString {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final Random RANDOM = new Random();

    public List<String> getStringList( int quantity){
        List<String> stringList = new LinkedList<>();
        for (int i = 0 ; i<quantity;i++){
            int length = ThreadLocalRandom.current().nextInt(0,12);
            stringList.add( getRandomWord(length) );
        }
        return stringList;
    }

    private static   String getRandomWord(int length) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0 ; i<length;i++){
           stringBuilder.append( ALPHABET.charAt( RANDOM.nextInt(ALPHABET.length() )) ) ;
        }
        return stringBuilder.toString();
    }
}
