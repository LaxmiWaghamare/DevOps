try:
    random_list = input("Enter elements separated by spaces: ").split()
    random_list = [int(x) for x in random_list]
    print("Random List:", random_list)
except ValueError:
    print("Error: Please enter valid integer values separated by spaces.")

except Exception as e:
    print(f"An error occurred: {e}")
