public class HW6 {
    public static void main(String[] args) {
        int[] array = new int[100000];
        CreateArray(array);
//        ShowArray(array);
        int index = BinarySearch(array,5000);
        System.out.println("index: "  + index);

    }

    public static int[] CreateArray(int[] array) {

        for (int i = 0, current = 1; i < array.length; i++, current++) {
            array[i] = current;
        }
        return array;
    }

    public static void ShowArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int BinarySearch(int[] array,int element) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            int current = array[middle];

            if (current == element) {
                return middle;
            } else if (current < element) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}






