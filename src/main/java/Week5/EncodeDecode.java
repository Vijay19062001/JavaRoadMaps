package week5;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncodeDecode {

    public static void main (String[] args) throws UnsupportedEncodingException{

        final String data = "It's a java Developer Team";
        //Encode

        String encodedText = Base64.getUrlEncoder().encodeToString(data.getBytes(StandardCharsets.UTF_8));

        System.out.println(encodedText);

        //Decode

        byte[] decodedArr = Base64.getUrlDecoder().decode(encodedText);
        String decodedText = new String(decodedArr);

        System.out.println(decodedText);


    }


    private static void BasicEncodingDecoding() throws UnsupportedEncodingException{
        final String data = "It's a java Developer Team";
        //Encode

        String encodedText = Base64.getEncoder().encodeToString(data.getBytes(StandardCharsets.UTF_8));

        System.out.println(encodedText);

        //Decode

        byte[] decodedArr = Base64.getDecoder().decode(encodedText);
        String decodedText = new String(decodedArr);

        System.out.println(decodedText);
    }
}
