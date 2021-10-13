import java.util.Arrays;

public class WinnersSort {
    public static void main(String[] args) {

        int places[] = {5, 2, 3, 4, 1,};
        String sportsmans[] = {"Vasia", "Misha", "Kolia", "Dima", "Oleg"};

        System.out.println("No sorted arrays");
        System.out.println(Arrays.toString(places));
        System.out.println(Arrays.toString(sportsmans));

        winnersSort(places, sportsmans);

        System.out.println();
        System.out.println("Sorted arrays");
        System.out.println(Arrays.toString(places));
        System.out.println(Arrays.toString(sportsmans));

    }
    public static String [] winnersSort(int[] results, String[] sportsmans){
        sort(results, sportsmans, 0, results.length-1);
        return sportsmans;
    }

    public static void sort(int[] results, String[] sportsmans, int low, int high) {

        int i = low;
        int j = high;
        int x = results[low + (high - low) / 2];

        do {
            while (results[i] < x) i++;
            while (results[j] > x) j--;
            if (i <= j) {
                int tempResults = results[i];
                String tempSportsmans = sportsmans[i];
                results[i] = results[j];
                sportsmans[i] = sportsmans[j];
                results[j] = tempResults;
                sportsmans[j] = tempSportsmans;
                i++;
                j--;
            }
        } while (i <= j);

        if (low < j) sort(results, sportsmans, low, j);
        if (high > i) sort(results, sportsmans, i, high);
    }
}
