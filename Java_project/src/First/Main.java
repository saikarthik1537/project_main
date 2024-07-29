package First;

public class Main {
	int a = 10;
	
	static int b = 20;
	public static void main(String[] args) {
		int c = 30;
		
		System.out.println("Local variable:" + c);
		
		Main demo = new Main();
		System.out.println("Instance variable:" + demo.a);
		
		System.out.println("Static Variable: " + Main.b);
		
		

        // If...else statement
        if (c > 25) {
            System.out.println("c is greater than 25");
        } else {
            System.out.println("c is less than or equal to 25");
        }

        // Switch statement
        switch (c) {
            case 10:
                System.out.println("c is 10");
                break;
            case 20:
                System.out.println("c is 20");
                break;
            case 30:
                System.out.println("c is 30");
                break;
            default:
                System.out.println("c is something else");
                break;
        }

        // For loop
        System.out.println("For loop:");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue; // Skip the rest of the loop when i is 2
            }
            if (i == 4) {
                break; // Exit the loop when i is 4
            }
            System.out.println("i: " + i);
        }

        // While loop
        System.out.println("While loop:");
        int i = 0;
        while (i < 5) {
            if (i == 2) {
                i++;
                continue; // Skip the rest of the loop when i is 2
            }
            if (i == 4) {
                break; // Exit the loop when i is 4
            }
            System.out.println("i: " + i);
            i++;
        }
     // Array iteration using different loops
        int[] arr = {1, 2, 3, 4, 5};

        // Using a for loop
        System.out.println("Array elements using for loop:");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

        // Using an enhanced for loop (foreach loop)
        System.out.println("Array elements using enhanced for loop:");
        for (int element : arr) {
            System.out.println(element);
        }

        // Using a while loop
        System.out.println("Array elements using while loop:");
        int k = 0;
        while (k < arr.length) {
            System.out.println(arr[k]);
            k++;
        }

        // Nested for loop example
        System.out.println("Nested for loop:");
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr.length; y++) {
                System.out.println("arr[" + x + "][" + y + "] = " + arr[x]);
            }
            
         // For loop over a string
            String text = "Hello, World!";
            System.out.println("For loop over a string:");
            for (int index = 0; index < text.length(); index++) {
                char ch = text.charAt(index);
                System.out.println("Character at index " + index + " is: " + ch);
            }
            
            
        }
        
        
	 
    }
}
