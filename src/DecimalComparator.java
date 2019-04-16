public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue) {

        firstValue *= 1000;
        secondValue *= 1000;

        int intFirstValue = (int) firstValue;
        int intSecondValue = (int) secondValue;

        if (intFirstValue != intSecondValue) {
            return false;
        }

        return true;

    }
}
