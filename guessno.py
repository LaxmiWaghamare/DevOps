import random
def guess_number_game():
    secret_number = random.randint(1, 100)
    attempts = 0
    max_attempts = 5

    print("Welcome to the Guess My Number game!")
    print("I'm thinking of a number between 1 and 100. You have 5 attempts to guess it.")

    while attempts < max_attempts:
        try:
            guess = int(input("Enter your guess: "))
            attempts += 1

            if guess < secret_number:
                print("Too low! Try a higher number.")
            elif guess > secret_number:
                print("Too high! Try a lower number.")
            else:
                print(f"Congratulations! You've guessed the number ({secret_number}) in {attempts} attempts!")
                break

        except ValueError:
            print("Please enter a valid number.")

    if attempts == max_attempts:
        print(f"Sorry, you've run out of attempts! The number I was thinking of was {secret_number}.")
guess_number_game()
