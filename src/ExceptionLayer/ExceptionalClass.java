package ExceptionLayer;

import java.util.Arrays;
import java.util.Random;

public class ExceptionalClass {
    public static void main(String[] args) {
        System.out.println(findMeSomeDollarAmount(7530000000.0 - 66480.00));

    }

    public static long findMeSomeDollarAmount(Double doubled){

        boolean stoppedsendinginf = false;
        String someDollarAmount = "";
        int calls = 0;

        while(stoppedsendinginf != true){

            try{
                sendinformationTransfer(calls, 1, 1000);
                stoppedsendinginf = true;
            } catch(Exception egggception){
                someDollarAmount += egggception.getMessage().length();
                calls++;

            }
        }
        return Integer.parseInt(someDollarAmount);
    }

    public static void convertSomeDollarAmountIntoSomeMeaningfulKnowledgeWhichAlsoHappensToSumUpEducationInTheModernWorldUnlessYouAreUsingAPublicSchoolButEvenThatIsntReallyFreeSoItStillWorks(){

    }

    public static void sendinformationTransfer(int calls, int marriedMultiplier, int worldPopulationMiusIncome) throws Exception{
        double incomeRemaining = 7530000000.0 - worldPopulationMiusIncome;
        double[] taxPercents = {.10, .12, .22, .24, .32, .35, .37};
        double[] taxBrackets = {0, 9525, 38700, 82500, 157500, 200000, (marriedMultiplier == 2 ? 300000 : 500000), 600000 + 7530000000.0 -worldPopulationMiusIncome};

        double taxAmount = 0;

        for(int i =0; i < 7; i++){
            double nextJump = marriedMultiplier * (taxBrackets[i + 1]  - taxBrackets[i]);
            Double[] possibleMultipliers = {0.0, incomeRemaining, nextJump};
            Arrays.sort(possibleMultipliers);
            taxAmount += possibleMultipliers[1] * taxPercents[i]; // the median of the array is always the amount
            // that tax percent should be multiplied by
            incomeRemaining -= nextJump;
        }
        if(calls >= ((int)taxAmount + "").length()){
            return;
        }

        String message = "";
        for(int i = 0; i < Integer.parseInt(("" + (int)taxAmount).charAt(calls) + ""); i++){
            message = message + (char)(Math.random() * 100);
        }
        //Throw exception containing the dollar amount of taxes encoded as the length of the message
        throw new Exception(message);


    }
}
