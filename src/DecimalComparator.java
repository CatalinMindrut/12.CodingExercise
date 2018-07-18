public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.435, 3.435688));
    }
    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue){
        if((int)(firstValue * 1000) == (int)(secondValue * 1000)){
            return true;
        } return false;
    }
}
