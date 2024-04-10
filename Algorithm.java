import java.util.Arrays;

public class Algorithm {

    static int binarySearch(int[] arr, int val){

        int guess;
        int checkIdx;
        int startIdx = 0;
        int endIdx = arr.length-1;

        int iter = 0;

        System.out.println("\nНовый поиск! Массив: "+ Arrays.toString(arr)+" Искомое число: "+String.valueOf(val));

        while(startIdx <= endIdx)
        {
            System.out.println(" Итерация #" + String.valueOf(iter++));
            checkIdx = (endIdx + startIdx) / 2;
            guess = arr[checkIdx];

            if(val == arr[checkIdx])
            {
                System.out.println(" Искомое число найдено! Позиция: " + String.valueOf(checkIdx));
                return checkIdx;
            }
            else
            {
                if(guess < val)
                    startIdx = checkIdx+1;
                else
                    endIdx = checkIdx - 1;

                System.out.println(" Определены новые границы: [" + String.valueOf(startIdx) + " " + String.valueOf(endIdx) + "]");
            }
        }

        System.out.println(" Искомое число НЕ найдено(((");
        return -1;
    }
}
