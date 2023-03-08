package JumpStatement;

public class BreakAndContinue {
    public static void main(String[] args) {

        // jumping statement are Break and Continue
        // break will exit you before you reach to the ending point
        // and continue will start you to reach again to the ending point

      for (int i=1; i<=10; i++){
          if (i==6){
              break;
          }
          System.out.println(i);

      }

      for (int kabul =1; kabul<=30; kabul++){
          if (kabul==10){
              continue;
          }
          System.out.println(kabul);

      }
// note to skip different using continue jumping statement also we are using || operator
        // for example

        for (int var = 1; var<=30; var++){
            if (var==3 || var==5 || var==7 || var==9){
                continue;
            }
            System.out.println(var);
        }



    }
}
