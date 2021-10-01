package question7;

public class Main {
    public static void main(String[] args) {


        System.out.println(yearUp(2));

    }


    public static double yearUp(int number){

      if (number % 3==0 && number% 5==0){
          System.out.println("Year Up");
      } else if (number % 5==0) {
          System.out.println("Up");
      } else if(number% 3==0){
          System.out.println("Year");
        } else{
          System.out.println("these numbers arent divisible by either 3 or 5");
      }


        return number;
    }



}
