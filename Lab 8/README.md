1. Write a Java program to establish a connection to a MySQL database using JDBC.

Expected Output:

            ********* Connection Successfully Establish.

           Connection :  com.mysql.cj.jdbc.ConnectionImpl@5f049eal



2. Write a Java program to create a table Employee in the database using a statement interface and check if the table has been created or not. The add few records from MySQL command line client and execute a simple SELECT query to retrieve data from a table.

[Hint : The "Employee" table is designed to include an "eid" column as the primary key, which will auto-increment its values. It also contains "name" and "address" columns of type varchar, and a "salary" column of type int. All columns in the table are set to be non-nullable.]

Expected Output:

Connection :  com.mysql.cj.jdbc.ConnectionImpl@5f049eal

Table creation done successfully

      Id : 1

      Name : Priya

      Address : Kolkatta

      Salary : 30000

      =====================================

      Id : 2

      Name : Riya

      Address : Bangalore

      Salary : 50000

      ====================================
