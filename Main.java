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
    StringBuilder result = new StringBuilder();
    boolean[] visited = new boolean[26]; // Assuming only lowercase English letters

    for (char c : input.toCharArray()) {
        if (!visited[c - 'a']) { // If the character hasn't been visited before
            result.append(c);
            visited[c - 'a'] = true; // Mark the character as visited
        }
    }

    return result.toString();
  }

}