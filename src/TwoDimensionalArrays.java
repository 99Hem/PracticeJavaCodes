import java.util.ArrayList;
import java.util.List;

public class TwoDimensionalArrays {

    public static void main(String args[]){
        List<Double> weights = new ArrayList<>();
        List<Double> lengths = new ArrayList<>();

        weights.add(4.0);
        weights.add(5.0);
        weights.add(6.0);

        lengths.add(12.0);
        lengths.add(10.0);
        lengths.add(9.0);

        int rowno = Math.min(weights.size(),lengths.size());
        double bulbs[][] = new double[rowno][2];
        for (int j = 0;j<rowno;j++){
            bulbs[j][0] = weights.get(j);
            bulbs[j][1] = lengths.get(j);
        }

        for (int i = 0; i < rowno; i++) {
            System.out.println("Bulb " + i + ": Weight = " + bulbs[i][0] + ", Length = " + bulbs[i][1]);
        }

        //double[][] bulbs = {{10,200},{30,40},{25,35},{15,25}};

        double minQualityScore = calculateWeight(bulbs[0]);
        int bestbuld = 0;
         for (int i =1;i<bulbs.length;i++){
             double qualityScore = calculateWeight(bulbs[i]);
             if(qualityScore < minQualityScore){
                 minQualityScore = qualityScore;
                 bestbuld = i;
             }
         }
         System.out.println(bestbuld);
    }
    public static double calculateWeight(double[] bulb){
        return bulb[0] * 0.6 + bulb[1] * 0.4;
    }
}
