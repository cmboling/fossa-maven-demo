package com.example.cowsay;

public class CowSpeaker {
    public static String say(String message) {
        return String.format("  <%s>\n   \\   ^__^\n    \\  (oo)\\_______\n       (__)\\       )\\/\\\n           ||----w |\n           ||     ||", message);
    }
}
