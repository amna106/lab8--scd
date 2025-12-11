package lab8;

public class GenericSubtraction {
	    public static <T extends Number> void subtractArray(T[] arr) {
	        System.out.print("Result : [");
	        for (int i = 1; i < arr.length; i++) {
	            double result = arr[i].doubleValue() - arr[i - 1].doubleValue();
	            System.out.print(result);

	            if (i < arr.length - 1)
	                System.out.print(", ");
	        }
	        System.out.println("]");
	    }
	    public static void main(String[] args) {
	        Integer[] intArray = {5, 7, 3, 9, 19};
	        Double[] doubleArray = {5.5, 6.0, 2.5, 8.0};
	        Float[] floatArray = {3.5f, 1.2f, 7.3f};
	        System.out.println("Integer Array Subtraction:");
	        subtractArray(intArray);
	        System.out.println("Double Array Subtraction:");
	        subtractArray(doubleArray);	        
	        System.out.println("Float Array Subtraction:");
	        subtractArray(floatArray);
	    }
}
