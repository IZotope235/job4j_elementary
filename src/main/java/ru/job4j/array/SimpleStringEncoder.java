package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 0; i < input.length(); i++) {
            if (i == input.length() - 1) {
                result.append(symbol);
                if (counter > 1) {
                    result.append(counter);
                }
            } else if (symbol == input.charAt(i + 1)) {
                counter++;
            } else {
                result.append(symbol);
                    if (counter > 1) {
                        result.append(counter);
                    }
                    symbol = input.charAt(i + 1);
                    counter = 1;
            }
        }
        return result.toString();
    }
}
