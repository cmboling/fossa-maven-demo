package com.example.app;

import com.example.cowsay.CowSpeaker;

/**
 * Main application that uses the proprietary cowsay wrapper library.
 * This demonstrates how an application depends on a proprietary library
 * which internally uses OSS dependencies.
 */
public class Main {
    
    public static void main(String[] args) {
        CowSpeaker speaker = new CowSpeaker();
        
        System.out.println("=== CowSay Application Demo ===\n");
        
        // Use the default message
        System.out.println("Default message:");
        System.out.println(speaker.getDefaultMessage());
        System.out.println();
        
        // Custom message
        String message = args.length > 0 ? String.join(" ", args) : "Hello from the application!";
        System.out.println("Custom message:");
        System.out.println(speaker.speak(message));
        System.out.println();
        
        // Thinking cow
        System.out.println("Thinking cow:");
        System.out.println(speaker.think("I wonder if FOSSA can see the OSS dependency..."));
        
        System.out.println("\n=== Demo Complete ===");
        System.out.println("This application uses com.example.cowsay.CowSpeaker,");
        System.out.println("which internally forwards calls to com.github.ricksbrown.cowsay");
    }
}