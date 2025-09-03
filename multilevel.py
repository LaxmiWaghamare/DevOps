class ClassA:
    def __init__(self, ClassA):
        self.name = name
# Intermediate class
 
class ClassB(ClassA):
    def __init__(self, name, ClassAname):
        self.name = name
        # invoking constructor of ClassA class
        ClassA.__init__(self, ClassAname)
 # Derived class
class ClassC(ClassB):
    def __init__(self, name, ClassBname, ClassAname):
        self.name = name
        # invoking constructor of ClassB class
        ClassB.__init__(self, ClassBname, ClassAname) 
    def print_name(self):
        print(“ClassA name :", self.ClassAname)
        print(“ClassB name :", self.ClassBname)
        print(“ClassC name :", self.ClassCname)
#  Driver code
s1 = ClassC("Abc", "hello", "Python")
print(s1.ClassAname)
s1.print_name()

