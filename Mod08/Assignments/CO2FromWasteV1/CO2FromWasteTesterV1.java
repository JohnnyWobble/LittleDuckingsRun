/**
 * This will calculate the amount of CO2 produced from a given amount of waste
 *
 * @author Max Gordon
 * @version 12/3/19
 *
 */
import java.util.ArrayList;

public class CO2FromWasteTesterV1
{
   public static void main(String[] args)
   {
       ArrayList<CO2FromWasteV1> households = new ArrayList<CO2FromWasteV1>();
       households.add(new CO2FromWasteV1(5, true, true, true, false));
       households.add(new CO2FromWasteV1(1, true, true, false, false));
       households.add(new CO2FromWasteV1(13, false, true, false, true));
       households.add(new CO2FromWasteV1(8, false, false, false, false));
       households.add(new CO2FromWasteV1(7, false, false, true, true));
       households.add(new CO2FromWasteV1(2, true, false, false, true));

       for(CO2FromWasteV1 dataRecord : households)
       {
           dataRecord.calcGrossWasteEmission();
           dataRecord.calcWasteReduction();
           dataRecord.calcNetWasteReduction();
       }

       System.out.println("|       |        |                                         |             Pounds of CO2             |");
       System.out.println("|       |        |       Household Waste Recycled          |   Total    |             |     Net    |");
       System.out.println("| Index | People |  Paper   |  Plastic |  Glass  |  Cans   |  Emission  |  Reduction  |  Emission  |");
       System.out.println("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");

       CO2FromWasteV1 dataRecord;

       for(int index = 0; index < households.size(); index ++)
       {
           System.out.printf("|   %1d   |  %4d  |  %-6b  |  %-6b  |  %-5b  |  %-5b  |  %8.2f  |  %9.2f  |  %8.2f  |%n", 
           index, 
           households.get(index).getNumPeople(), 
           households.get(index).getPaper(), 
           households.get(index).getPlastic(), 
           households.get(index).getGlass(), 
           households.get(index).getCans(),
           households.get(index).getEmissions(),
           households.get(index).getReduction(),
           households.get(index).getNetEmissions()
           );

       }
   }
}
