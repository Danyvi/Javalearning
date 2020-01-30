package academy.learnprogramming;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats a lot of people";
    }
}

class IndependanceDay extends Movie {
    public IndependanceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over Planet Earth ";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze ";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "The Rebellion against the Empire";
    }
}

class ForgettableMovie extends Movie {
    public ForgettableMovie() {
        super("Forgettable movie");
    }

    // No plot method
}






public class Main {

    public static void main(String[] args) {
        // Polymorphism aspect (movie.plot() is how polymorphism works)
        for (int i=1; i<11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }

    }

    // with this method we are returning a base class (the super class Movie)
    // all these classes inherit from Movie
    // Because the way inheritance works we can use that "IS A RELATIONSHIP"
    // Jaws IS a movie, Independance Day IS a movie ... and so on.
    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was : " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new IndependanceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new ForgettableMovie();

        }
        return null;
    }
}
