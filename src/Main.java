// I have neither given nor received unauthorized aid on this piece of work.

public class Main {

    public static void main(String[] args) {

    }

    // 1. add
  public static int add(int a, int b){
      return a+b;
  }

    // 2. add
public static int add(int a){
    int b = 0;
    int c = 0;
    int d = 0;
    return add(a,b)+add(c+d) + add(0,0);
}
    // 3. morningGreeting
public static String morningGreeting(String gog){
        return "早上好, " + gog +"!";
}
    // 4. afternoonGreeting
    public static String afternoonGreeting(String pog) {
        return "下午好, " + pog + "!";
    }
    // 5. triple
public static String triple(String dog) {
    return dog + dog + dog;
        }
    // 6. half
public static int half(int bob){
        return bob/2;

}
    // 7. roundPositiveValueToNearestInteger
public static int roundPositiveValueToNearestInteger(int joe){

    return Math.round(joe);
}

    // 8. roundNegativeValueToNearestInteger
public static int roundNegativeValueToNearestInteger(int a){
        int temp = Math.abs(a);
                return Math.round(temp);
}
}
