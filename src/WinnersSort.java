import java.util.Arrays;

public class WinnersSort {
    public static void main(String[] args) {

        int places[] = {5, 2, 3, 4, 1,};
        String sportsmans[] = {"Vasia", "Misha", "Kolia", "Dima", "Oleg"};

        System.out.println("No sorted arrays");
        System.out.println(Arrays.toString(places));
        System.out.println(Arrays.toString(sportsmans));

        sort(places, sportsmans,0,places.length-1);

        System.out.println();
        System.out.println("Sorted arrays");
        System.out.println(Arrays.toString(places));
        System.out.println(Arrays.toString(sportsmans));

    }

    public static void sort(int[] places, String[] sportsmans, int low, int high) {

        int i = low;
        int j = high;
        int x = places[low + (high - low) / 2];

        do {
            while (places[i] < x) i++;
            while (places[j] > x) j--;
            if (i <= j) {
                int temp = places[i];
                String temp2 = sportsmans[i];
                places[i] = places[j];
                sportsmans[i] = sportsmans[j];
                places[j] = temp;
                sportsmans[j] = temp2;
                i++;
                j--;
            }
        } while (i <= j);

        if (low < j) sort(places, sportsmans, low, j);
        if (high > i) sort(places, sportsmans, i, high);
    }
}
