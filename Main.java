import java.util.LinkedHashSet;

public class Main {

  public static void main(String[] args) {
    // Test cases
    String input1 = "banana";
    String input2 = "hello";
    String input3 = "world";

    System.out.println("Input: " + input1 + ", Unique characters: " + uniqueCharacters(input1));
    System.out.println("Input: " + input2 + ", Unique characters: " + uniqueCharacters(input2));
    System.out.println("Input: " + input3 + ", Unique characters: " + uniqueCharacters(input3));
  }
  public static String uniqueCharacters(String input) {
    String solution = "";
    LinkedHashSet<String> uniqueChars = new LinkedHashSet<>();
    for(char c : input.toCharArray()){
      uniqueChars.add(String.valueOf(c));
    }

    solution = uniqueChars.toString().replace("[","").replace("]", "").replace(",","").replace(" ", "");

    return solution;
  }

}