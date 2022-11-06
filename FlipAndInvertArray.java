public class FlipAndInvertArray {
    public static void main(String[] args) {

    }
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            flip(image[i]);
            invert(image[i]);
        }
        return image;
    }

    private void invert(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 0){
                ints[i] = 1;
            } else {
                ints[i] = 0;
            }
        }
    }

    private void flip(int[] ints) {
        int start = 0;
        int end = ints.length - 1;
        for (int i = 0; i < ints.length / 2; i++) {
            int temp = ints[start + i];
            ints[start + i] = ints[end - i];
            ints[end - i] = temp;
        }
    }
}
