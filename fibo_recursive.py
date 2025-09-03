def fibo_recursive(n):
    if n <= 0:
        return []
    elif n == 1:
        return [0]
    elif n == 2:
        return [0, 1]
    else:
        fib_sequence = fibo_recursive(n - 1)
        fib_sequence.append(fib_sequence[-1] + fib_sequence[-2])
        return fib_sequence
n = int(input("Enter the value of 'n' for the sequence: "))

if n <= 0:
    print("Please enter a positive integer.")
else:
    fib_sequence = fibo_recursive(n)
    print(f"up to the {n}th term: {fib_sequence}")
