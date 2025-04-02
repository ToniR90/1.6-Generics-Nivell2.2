package org.example;

public class GenericMethod <T>{

    public void printGenericArgs(T ... args){
        for(T arg : args){
            System.out.println("Arguments: " + arg);
        }
    }
}
