package .github.appmod.appcat;

public class Numberof1bite {
    
}
public class Numberof1bite {
    
    // Function to count number of 1 bits
    public static int hammingWeight(int n) {
        int count = 0;

        // Loop until n becomes 0
        while (n != 0) {
            n = n & (n - 1); // remove lowest set bit
            count++;
        }

        return count;
    }

    // Main function
    public static void main(String[] args) {
        int n = 11; // example input

        int result = hammingWeight(n);

        System.out.println("Number of 1 bits in " + n + " is: " + result);
    }
}
