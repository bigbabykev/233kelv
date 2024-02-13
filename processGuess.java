private void processGuess(int guess) {
    if (guess < 0) return;
    System.out.println("You guessed " + guess);
    if (guess == number) {
        win();
        pickNewRandom = true;
    } else {
        if (strikes > 0 && strikes < maxStrikes) { 
            if (guess < number) {
                System.out.println("Hint: Go higher!");
            } else {
                System.out.println("Hint: Go lower!");
            }
        }
        System.out.println("That's wrong");
        strikes++;
        if (strikes >= maxStrikes) {
            lose();
            pickNewRandom = true;
        }
    }
    saveState();
}


