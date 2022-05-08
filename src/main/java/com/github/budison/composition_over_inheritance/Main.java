package com.github.budison.composition_over_inheritance;

public class Main {

    public static void main(String[] args) {
        Programmer kevin = new Programmer();
        kevin.work();
        Manager lazyManager = new Manager(kevin);
        lazyManager.work();
    }
}	
