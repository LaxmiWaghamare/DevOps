import pymysql
def Connection1(db):
    try:
        c1=pymysql.Connection1(host="localhost",
                               user="root",
                               password="root123",
                               database="db")
        print("Connection done!!")
        return 1
    except ConnectionError:
        print("Unabe to Connect")
def show_all_db():
    con=Connection1("Stud")
    query="Select*from SYBTCH"
    com_chanel=con.cursor()
    com_chanel.execute(query)
    result=com_chanel.fetchall()
    print(result)
show_all_db()
