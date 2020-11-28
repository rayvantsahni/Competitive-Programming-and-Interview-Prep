import java.util.Scanner;

class ReverseWords
{
    private static void reverse(char[] arr, int left, int right) {
        if (left == right)
            return;

        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    private static void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void reverseWords(char[] message) {
        if (message.length == 0 || message.length == 1)
            return;

        int left = 0;
        int right = message.length - 1;
        reverse(message, left, right);

        int wordEnd = 0, wordStart = 0;
        for (int i = 0; i < message.length; i++) {
            if (i == message.length - 1 || message[i + 1] == ' ') {
                wordEnd = i;
                reverse(message, wordStart, wordEnd);
                wordStart = wordEnd + 2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a sentence without punctuations -");
        String sentence = scanner.nextLine();
        
	    char[] words = sentence.toCharArray();
	    reverseWords(words);
        System.out.println(String.valueOf(words));
    }
}
