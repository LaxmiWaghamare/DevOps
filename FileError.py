file_name = "nonexistent_file.txt"  
try:
    with open(file_name, 'r') as file:
       
        content = file.read()
        print("File content:", content)
        
except FileNotFoundError:
    print(f"Error: The file '{file_name}' does not exist.")
    
except IOError as e:
    print(f"An I/O error occurred: {e}")
