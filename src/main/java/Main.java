public class Main {

    public static void main(String[] args) {

        String text = "SmF2YSDQvdC1INGC0L7RgNC80L7Qt9C40YIhCg==";

        System.out.println("Text before encode: " + text);

        String decodeText = DecodeString.decodeString(text);
        System.out.println("Text after encode: " + decodeText);

    }


}
