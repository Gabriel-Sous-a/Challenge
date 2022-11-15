public class multiplyBox {
    private static int[] boxDigits = {};

    public static int multiply() {
        int total = 1;
        if (boxDigits.length == 0){
            return 0;
        }
        for (int i = 0; i < boxDigits.length; i++) {

            total = total * boxDigits[i];
        }
        return total;
    }
}
