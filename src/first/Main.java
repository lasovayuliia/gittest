package first;

import first.second.Second;

public class Main {
    public static void main(String args[]){
        System.out.println("This text is");
        System.out.println("from main class");
        Second.print("This text is", "from second");
    }
}
