import java.util.*;
class uservalid{
   public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter username:");
        String a=sc.nextLine();
        System.out.print("Reenter username:");
        String b=sc.nextLine();
        if(a.equals(b)){
            System.out.println("user is valid");
        }else{
            System.out.println("user is invalid");
        }
    }
}
