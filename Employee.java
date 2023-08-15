public class BinaryConversion {
  public static void main(String[] args) {
    // The integer array to be converted to binary
    int[] numbers = {10, 20, 30, 40};

    // Iterate through the array and convert each element to binary
    for (int number : numbers) {
      System.out.println(Integer.toBinaryString(number));
    }
  }
}