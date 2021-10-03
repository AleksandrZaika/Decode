import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class DecodeString {

    public static String decodeString(String encodeText) {
        byte[] decodeBytes = Base64.getDecoder().decode(encodeText);
        return new String(decodeBytes, StandardCharsets.UTF_8);
    }
}
