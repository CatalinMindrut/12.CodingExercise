public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(1,9,13));
    }
    public static boolean hasTeen (int a, int b, int c){
        if(((a >= 13) && (a <= 19)) || ((b >= 13) && (b <= 19)) || ((c >= 13) && (c <= 19))){
            return true;
        } else {
            return false;
        }
    }

    //Shorter answer
    public static boolean newHasTeen(int a, int b, int c) {
            return ((a >= 12 && a <= 19) || (b >= 12 && b <= 19) || (c >= 12 && c <= 19));
    }

}
