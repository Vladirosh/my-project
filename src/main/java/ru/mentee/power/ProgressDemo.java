package ru.mentee.power;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ProgressDemo {
    static void main() {

        MenteeProgress progress = new MenteeProgress("Vlad", 2, 10);
        MenteeProgress vlad = progress;

        System.out.println(progress.summary());
        if (progress.readyForSprint()) {
            System.out.println("Status: sprint ready");
        } else {
            System.out.println("Status: backlog first");
        }
    }
}
