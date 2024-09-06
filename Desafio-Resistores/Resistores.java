import java.util.Map;

public class Resistores {

    private static final Map<Integer, String> colorMap = Map.of(
        0, "preto", 1, "marrom", 2, "vermelho", 3, "laranja", 
        4, "amarelo", 5, "verde", 6, "azul", 7, "violeta", 
        8, "cinza", 9, "branco"
    );

    public static String getResistorColors(String input) {
        double resistorValue = parseValue(input);
        int[] digits = extractDigits(resistorValue);

        return String.format("%s %s %s dourado", 
                             colorMap.get(digits[0]), 
                             colorMap.get(digits[1]), 
                             colorMap.get(digits[2]));
    }

    private static double parseValue(String input) {
        String value = input.replaceAll("[kM]", "").replace(" ohms", "");
        double resistorValue = Double.parseDouble(value);
        
        if (input.contains("k")) resistorValue *= 1000;
        else if (input.contains("M")) resistorValue *= 1_000_000;

        return resistorValue;
    }

    private static int[] extractDigits(double resistorValue) {
        String stringValue = String.valueOf((int) resistorValue);
        int firstDigit = Character.getNumericValue(stringValue.charAt(0));
        int secondDigit = Character.getNumericValue(stringValue.charAt(1));
        int multiplier = stringValue.length() - 2;
        
        return new int[] { firstDigit, secondDigit, multiplier };
    }

    public static void main(String[] args) {
        System.out.println(getResistorColors("47 ohms"));   
        System.out.println(getResistorColors("4.7k ohms"));    
        System.out.println(getResistorColors("1M ohms"));    
    }
}
