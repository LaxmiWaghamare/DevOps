my_dictionary = {
    "name": "J-Hope",
    "age": 29,
    "city": "Busan",
    "country": "South Korea"
}
print("Original Dictionary:")
print(my_dictionary)

if "age" in my_dictionary:
    del my_dictionary["age"]
print("\nDictionary after using del:")
print(my_dictionary)
if "city" in my_dictionary:
    my_dictionary.pop("city")

print("\nDictionary after using pop:")
print(my_dictionary)
