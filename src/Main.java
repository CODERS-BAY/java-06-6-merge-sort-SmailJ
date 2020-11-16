/*

NEED HELP
it just put the smallest number in front of everything and stops than

 */

public class Main {

    public static void main(String[] args) {
        Main ms = new Main();
        int[] newnumbers = ms.sort(0, numbers.length - 1);
        for (int i = 0; i < newnumbers.length; i++) {
            System.out.print(newnumbers[i] + ", ");
        }
    }

    public static int[] numbers = { 16, 23, 14, 7, 21, 20, 6, 1, 17, 13, 12, 9, 3, 19 };

    public int[] sort(int l, int r) {

        if (l < r) {
            int q = (l + r) / 2;

            sort(l, q);
            sort(q + 1, r);
            merge(l, q, r);
        }
        return numbers;
    }

    private void merge(int l, int q, int r) {
        int[] newnumbers = new int[numbers.length];
        int i, j;
        for (i = l; i <= q; i++) {
            newnumbers[i] = numbers[i];
        }
        for (j = q + 1; j <= r; j++) {
            newnumbers[r + q + 1 - j] = numbers[j];
        }
        i = l;
        j = r;
        for (int k = l; k <= r; k++) {
            if (newnumbers[i] <= newnumbers[j]) {
                numbers[k] = newnumbers[i];
                i++;
            } else {
                numbers[k] = newnumbers[j];
                j--;
            }
        }
    }
}