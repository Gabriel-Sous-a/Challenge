public class ChartAnalyser {
    private static String [] chart = {"-", "-", "~", "-", "-", "-", "-", "~", "~", "-", "-", "~", "~"};

    public static int analyser () {
        int result = 0;
        int counter = 0;
        for (int i = 0; i < chart.length-1; i++) {
            if ("-".equals(chart[i]) && !chart[i].equals(chart[i+1])){
                counter ++;
            }
        }
        result = (counter * 100) / chart.length;
        return result;
    }
}
