import java.util.*;
class voteeligibility{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age:");
        int age=sc.nextInt();
        if(age>=18){
        System.out.println("You are eligible to vote");    
        }
        else if(age<0){
            System.out.println("Invalid input");
        }
        else{
            System.out.println("you are allowed to vote after"+(18-age)+"years");
        }
    }
}
