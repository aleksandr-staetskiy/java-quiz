package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String q1 = "What color are apples?\n(a) red/green\n(b) orange\n(c) Magento?";
        String q2 = "What color are kursiki?\n(a) red/green\n(b) orange\n(c) love?";

        Question [] questions = {
           new Question(q1, "a"), new Question(q2, "c"),
        };

        test(questions);
    }

    public static void test(Question [] questions) {
        int score = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String userAnswer = input.nextLine();
            if (userAnswer.equals(questions[i].answer)) {
                score++;
            }
        }
        System.out.println("You got " + score + " of " + questions.length);
    }
}