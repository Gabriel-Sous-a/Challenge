public class multiplyBox {
    private static int[] boxDigits = {1, 4, 7, 8};

    public static int multiply() {
        int total = 1;
        for (int i = 1; i < boxDigits.length; i++) {
            total = total * boxDigits[i];
        }
        return total;
    }
}
