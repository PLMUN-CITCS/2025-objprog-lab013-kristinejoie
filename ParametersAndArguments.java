public class ParametersAndArguments {

    public static void main(String[] args) {
        // Declare variables
        int roomWidth = 10;
        int roomHeight = 15;
        
        // Call the method and store the result
        int area = calculateArea(roomWidth, roomHeight);
        
        // Print the result
        System.out.println("The calculated area is: " + area);
    }

    // Define the calculateArea method
    public static int calculateArea(int width, int height) {
        int area = width * height;
        return area;
    }
}