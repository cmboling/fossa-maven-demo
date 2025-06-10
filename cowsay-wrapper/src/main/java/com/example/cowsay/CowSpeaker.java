package com.example.cowsay;

import com.github.ricksbrown.cowsay.Cowsay;

/**
 * A proprietary wrapper around the OSS cowsay library.
 * This demonstrates how proprietary code can wrap OSS dependencies.
 */
public class CowSpeaker {
    
    /**
     * Makes a cow say something using the underlying OSS cowsay library.
     * This is a forwarding call to com.github.ricksbrown.cowsay.
     * 
     * @param message The message for the cow to say
     * @return The cow ASCII art with the message
     */
    public String speak(String message) {
        // Forward the call to the OSS cowsay library
        String[] args = {message};
        return Cowsay.say(args);
    }
    
    /**
     * Makes a cow think something using the underlying OSS cowsay library.
     * 
     * @param message The message for the cow to think
     * @return The cow ASCII art with the thought bubble
     */
    public String think(String message) {
        // Forward the call to the OSS cowsay library with think mode
        String[] args = {"-t", message};
        return Cowsay.say(args);
    }
    
    /**
     * Convenience method to get a default cow message.
     * 
     * @return A cow saying "Hello from the wrapper!"
     */
    public String getDefaultMessage() {
        return speak("Hello from the proprietary wrapper!");
    }
}