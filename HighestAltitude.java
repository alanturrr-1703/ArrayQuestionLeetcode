public class HighestAltitude {
    public static void main(String[] args) {
        HighestAltitude h = new HighestAltitude();
        int[] gain = {4,-1,-5,2,9};
        h.largestAltitude(gain);
    }
    public int largestAltitude(int[] gain) {
        int[] altitudeVector = new int[gain.length + 1];
        altitudeVector[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            altitudeVector[i + 1] = altitudeVector[i] + gain[i];
        }
        return max(altitudeVector);
    }

    private int max(int[] arr) {
        int max = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (max < arr[j]){
                max = arr[j];
            }
        }
        return max;
    }
}
