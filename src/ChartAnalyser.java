public class ChartAnalyser {
    private static String [] chart = {"-", "-", "~", "-", "-", "-", "-", "~", "~", "-", "-", "~", "~"};

    public static double analyser () {
        double result = 0;
        int counter = 0;
        for (int i = 0; i < chart.length-1; i++) {
            if (!chart[0].equals(chart[i]) && !chart[i].equals(chart[i+1])){
                counter ++;
            }
        }
        result = (counter * 100) / chart.length;
        return result;
    }
}
