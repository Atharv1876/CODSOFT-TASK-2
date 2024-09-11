import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("enter the marks");
    System.out.println("1) English");
    int a = sc.nextInt();
    System.out.println("2) Physics");
    int b = sc.nextInt();
    System.out.println("3) Chemistry");
    int c = sc.nextInt();
    System.out.println("4) Maths");
    int d = sc.nextInt();
    System.out.println("5) Biology");
    int e = sc.nextInt();
    int f = a+b+c+d+e;
    float x = f/5f;
    //conditions
    if(a>=35 && b>=35 && c>=35 && d>=35 && e>=35){
    System.out.println("total marks = "+f);
    System.out.println("average percentage = "+x+" %");
    if(x>=75){
      System.out.println("Congrats you pass with Grade A+");
    } else if(x>=60){
      System.out.println("Congrats you pass with Grade A");
    } else if(x>=45){
      System.out.println("Congrats you pass with Grade B");
    } else if(x>=35){
      System.out.println("Congrats you pass with Grade C");
    } else if(x<35){
      System.out.println("dont worry try again your grade is Grade D");
    }
  } else if (a<35){
    System.out.println("you failed in English subject therefore you are not pass");
  } if (b<35){
    System.out.println("you failed in Physics subject therefore you are not pass");
  }  if (c<35){
    System.out.println("you failed in Chemistry subject therefore you are not pass");
  }  if (d<35){
    System.out.println("you failed in Maths subject therefore you are not pass");
  }  if (e<35){
    System.out.println("you failed in Biology subject therefore you are not pass");
  } 

    }
}
