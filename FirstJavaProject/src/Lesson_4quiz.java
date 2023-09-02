public class Lesson_4quiz {

    public static void main(String[] args) {

        int min = 0;
        int max = 100;
        int myNumber = 13;

        int guess;
        do {
            guess = (min + max) / 2;
            System.out.println("I'm guessing ");
            System.out.println(guess);

            if (guess < myNumber) {
                min = guess;
            } else {
                max = guess;
            }
        }
            while (guess != myNumber);

        }
    }


