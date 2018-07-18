public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(bark(true, 23));
    }
    public static boolean bark(boolean barking, int hourOfDay){
        if(hourOfDay <0 || hourOfDay > 23 && barking){
            return false;
        } else if (hourOfDay >0 && hourOfDay <=8 && barking || hourOfDay > 22 && hourOfDay <=23 && barking){
            return true;
        } else {
            return false;
        }
    }
}
