package hashing;

import java.util.*;

public class Driver {

    static String[][] library = new String[3][3];
    static int numself = 3;
    static int totalself = 3;

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book b1 = new Book(1,"harry potter");
        Book b2 = new Book(2,"untoldmsd story");
        Book b3 = new Book(3,"sachin graphy");
        Book b4 = new Book(4,"kings attack");

        b1.address = etbook(b1);
        b2.address = etbook(b2);
        b3.address = etbook(b3);
        b4.address = etbook(b4);

        Map<Integer, Book> map = new HashMap<>();
        map.put(b1.id,b1);
        map.put(b2.id,b2);
        map.put(b3.id,b3);
        map.put(b4.id,b4);

        System.out.println("enter the book id to search : ");
        int id = sc.nextInt();

        Book find = map.get(id);
        System.out.println(find);

    }

    public static String etbook(Book b){
        int add = (b.id%numself);
        for(int loc = 0;loc<totalself;loc++){
            if(library[add][loc] == null){
                library[add][loc] = "book " + b.id;
                return b.id + "#" +"s " + (add+1) + "#" + "l " + (loc+1);

            }
        }
        return null;
    }
}
