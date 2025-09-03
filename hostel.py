students = []

# Function to add a new student
def add_student():
    name = input("Enter student name: ")
    age = input("Enter student age: ")
    gender = input("Enter student gender: ")
    room_no = input("Enter student room number: ")
    student = {'name': name, 'age': age, 'gender': gender, 'room_no': room_no}
    students.append(student)
    print("Student added successfully!")

# Function to search for a student by name
def search_student():
    name = input("Enter student name: ")
    for student in students:
        if student['name'] == name:
            print(f"Name: {student['name']}\nAge: {student['age']}\nGender: {student['gender']}\nRoom No.: {student['room_no']}")
            return
    print("Student not found.")

# Function to update a student's information
def update_student():
    name = input("Enter student name: ")
    for student in students:
        if student['name'] == name:
            print("Select the field you want to update:")
            print("1. Name")
            print("2. Age")
            print("3. Gender")
            print("4. Room No.")
            choice = input("Enter your choice: ")
            if choice == '1':
                new_name = input("Enter new name: ")
                student['name'] = new_name
            elif choice == '2':
                new_age = input("Enter new age: ")
                student['age'] = new_age
            elif choice == '3':
                new_gender = input("Enter new gender: ")
                student['gender'] = new_gender
            elif choice == '4':
                new_room_no = input("Enter new room number: ")
                student['room_no'] = new_room_no
            else:
                print("Invalid choice.")
            print("Student information updated successfully!")
            return
    print("Student not found.")

# Function to delete a student from the system
def delete_student():
    name = input("Enter student name: ")
    for student in students:
        if student['name'] == name:
            students.remove(student)
            print("Student deleted successfully!")
            return
    print("Student not found.")

# Function to display all students in the system
def display_all_students():
    for student in students:
        print(f"Name: {student['name']}\nAge: {student['age']}\nGender: {student['gender']}\nRoom No.: {student['room_no']}\n")

# Main function to run the program
def main():
    while True:
        print("\n\nWelcome to Hostel Management System\n")
        print("1. Add Student")
        print("2. Search Student")
        print("3. Update Student Information")
        print("4. Delete Student")
        print("5. Display All Students")
        print("6. Exit")

        choice = input("\nEnter your choice: ")

        if choice == '1':
            add_student()
        elif choice == '2':
            search_student()
        elif choice == '3':
            update_student()
        elif choice == '4':
            delete_student()
        elif choice == '5':
            display_all_students()
        elif choice == '6':
            print("Thank you for using Hostel Management System!")
            break
        else:
            print("Invalid choice. Please enter a valid choice.")

if __name__ == '__main__':
    main()
