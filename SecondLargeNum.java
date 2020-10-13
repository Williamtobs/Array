import java.util.Arrays;

/**
 * 
 * @author Akeem William Tobi
 *
 */
public class SecondLargeNum {
	
	public static void findSecNum(int[] arr) {
		int lowerPost = 0;
		int SecLowerPost = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < arr[lowerPost]) {
				lowerPost = i;
			}
		}
		System.out.println("lowest number is " + arr[lowerPost]);
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		SecLowerPost = 1;
		for (int j = SecLowerPost; j > 0; j++) {
			if (arr[SecLowerPost] != arr[lowerPost]) {
				System.out.println("Second lowest number is " + arr[j]);
				break;
			}
			else if (arr[lowerPost] == arr[SecLowerPost]){
				SecLowerPost++;
				continue;
			}
			
		}	
		
	}
	public static void main(String[] args) {
		int[] arr = {30, 60, 40, 40, 50};
		findSecNum(arr);
	}

}
