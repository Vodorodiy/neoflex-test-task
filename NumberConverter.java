public class NumberConverter implements Convertible {

    public String convertDecimalToBinary(String number) {
        try {
            return Integer.toBinaryString(Integer.parseInt(number));
        } catch (NumberFormatException exception){
            return "Wrong number";
        }
    }


    public String convertBinaryToDecimal(String number) {
        try {
            return String.valueOf(Integer.parseInt(number, 2));
        } catch (NumberFormatException exception){
            return "Wrong number";
        }

    }

    public String convertDecimalToHex(String number) {
        try {
            return Integer.toHexString(Integer.parseInt(number));
        } catch (NumberFormatException exception){
            return "Wrong number";
        }

    }

    public void run(NumeralBase base, String number) {
        switch (base) {
            case BINARY -> System.out.println(convertDecimalToBinary(number));
            case DECIMAL -> System.out.println(convertBinaryToDecimal(number));
            case HEX -> System.out.println(convertDecimalToHex(number));
            default -> System.out.println("Unknown numeral base");
        }
    }
}
