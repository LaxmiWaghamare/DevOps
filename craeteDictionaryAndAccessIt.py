my_dictionary = {
    "name": "Jimin",
    "age": 26,
    "city": "Busan"
}
print("Name:", my_dictionary["name"])
print("Age:", my_dictionary["age"])
print("City:", my_dictionary["city"])
key_to_check = "country"
if key_to_check in my_dictionary:
    print(f"{key_to_check}: {my_dictionary[key_to_check]}")
else:
    print(f"{key_to_check} is not in the dictionary.")
