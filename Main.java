
import java.util.Random;

class Main {
  public static void main(String[] args) {

    Random r = new Random();
    int randomInt = r.nextInt(50)+1;
    System.out.println("Random number is: " + randomInt);
  
  if(randomInt < 25)
    {
    for(int i = randomInt; i >=0; --i);
  {
      System.out.println(i);
  }
    System.out.println("Ahoy Mateys!");
  }
  
  else if (randomInt >= 25 && randomInt <= 42)
  
    for(int i = randomInt; i >= 0; --i)
    {
      System.out.println(i);
    }
      System.out.println("Cannonball!");
  }

    else
    {
      for(int i = randomInt; i >= 0; --i)
    {
      System.out.println(i);
    }
      System.out.println("Blast off!");
  }
}