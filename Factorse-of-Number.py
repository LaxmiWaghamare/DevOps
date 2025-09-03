# Function to find factors of a number
def find_factors(number):
    factors = []
    for i in range(1, number + 1):
        if number % i == 0:
            factors.append(i)
    return factors

# Input from the user
num = int(input("Enter a number: "))

if num < 1:
    print("Please enter a positive integer.")
else:
    result = find_factors(num)
    print(f"The factors of {num} are: {result}")
