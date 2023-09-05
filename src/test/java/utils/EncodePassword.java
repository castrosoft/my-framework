package utils;

import java.util.Base64;

public class EncodePassword {
    public static String decode64(String encodedString) {
        Base64.Decoder decoder = Base64.getDecoder();
        return new String(decoder.decode(encodedString.getBytes()));
    }
}
