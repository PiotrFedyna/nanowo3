import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner (System.in);
    boolean shouldContinue{
      while (shouldContinue)
      {
      System.out.println("aby dodać studenta wpisz 1");
        System.out.println("aby wyjśc 0");
        int usreChoice = scanner.nextInt();
        switch(userChoice)
        {
          case 1:
            System.out.println("dodano studenta powrót do menu\n");
            break;
          case 0: 
            System.out.println("");
            schouldContinue= false;
            break;
        }
      }
      
    }
}

} 
private static void case1() throws IOException
{
Scanner scanner = new Scanner(System.in)  ;
System.out.println("Podaj imie studenta:");
String Imie = scanner.nextLine ();
System.out.println("Podaj wiek studenta:");
int Wiek = scanner.nextInt();
Service1 s = new Service1();
s.addStudent(new Student(Imie,Wiek));
} 
