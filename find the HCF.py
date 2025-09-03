# Function to find the HCF (GCD) of two numbers
def find_hcf(a, b):
    while b:
        a, b = b, a % b
    return a

# Input from the user
num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))

if num1 < 0 or num2 < 0:
    print("Please enter positive integers.")
else:
    hcf = find_hcf(num1, num2)
    print(f"The HCF of {num1} and {num2} is {hcf}")
