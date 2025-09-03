tuple1 = (1, 2, 3, 4, 5)
tuple2 = (5, 4, 3, 2, 1)
# Addition of elements in tuples
addition_result = tuple(a + b for a, b in zip(tuple1, tuple2))
print("Addition of elements in tuples:", addition_result)
# Multiplication of elements in tuples
multiplication_result = tuple(a * b for a, b in zip(tuple1, tuple2))
print("Multiplication of elements in tuples:", multiplication_result)
