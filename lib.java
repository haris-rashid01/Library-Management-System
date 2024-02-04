package Library;

import java.util.Scanner;

class User {
    Scanner sc = new Scanner(System.in);
    public void username(){
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter you class section");
        char cl = sc.next().charAt(0);
    }
}
class Library{
    private String books;
    Scanner sc = new Scanner(System.in);
    public void avail(){
        String[] str1 = new String[]{"Harry potter", "Barbie", "Oppenheimer"};
        for (int i = 0; i<str1.length; i++){
            System.out.println("Present books are: " + str1[i]);
        }
        System.out.println("Enter 1, 2 or 3");
        int num = sc.nextInt();
        if (num==1){
            System.out.println("Your selected book is " +  str1[0]);
        }
       else if (num==2){
            System.out.println("Your selected book is " +  str1[1]);
        }
        else if (num==3){
            System.out.println("Your selected book is " +  str1[2]);
        }
        else {
            System.out.println("Wrong key");
        }
    }
}
class Main{
    public static void main(String[] args) {
        User user = new User();
        user.username();
        Library library = new Library();
        library.avail();
    }
}
