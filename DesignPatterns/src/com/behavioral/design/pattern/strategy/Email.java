package com.behavioral.design.pattern.strategy;

public class Email implements ShareStrategy {
    public void share() {
        System.out.println("I'm emailing the photo");
    }
}