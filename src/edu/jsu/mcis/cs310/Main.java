package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String reverse(String message) {
        String reversed;
        StringBuilder reversing= new StringBuilder();
        reversing.append(message);
        reversing=reversing.reverse();
        reversed=reversing.toString();
        return reversed;
    }
    
}