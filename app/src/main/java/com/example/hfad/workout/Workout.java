package com.example.hfad.workout;

public class Workout {
    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener", "5 push-up\n10 1-legged squats\n15 Pull-ups"),
            new Workout("Core Agony", "15 push-up\n10 2-legged squats\n15 100 Pull-ups"),
            new Workout("The Wimp Special", "30 push-up\n10 2-legged squats\n15 200 Pull-ups"),
            new Workout("Strength and Length", "500 meter run\n21 x 1.5 pood kettleball swing")
    };

    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
