1. Consider two tables, customers and orders, with the following structures:

      Customers Table:

         customer_id (Primary Key)

         first_name

         Last_name



     Orders Table:

         order_id (Primary Key)

         customer_id (Foreign Key)

         order_date

         Total_amount

Write an SQL query to retrieve the first and last names of customers along with the order date and total amount of their orders. Use an INNER JOIN to connect the two tables.?



2. Consider two tables, departments and employees, with the following structures:

       Departments Table:

            department_id (Primary Key)

            department_name



       Employees Table:

            employee_id (Primary Key)

            first_name

            last_name

            department_id (Foreign Key)

Write an SQL query to retrieve a list of all departments and the names of employees who belong to each department. Use a LEFT JOIN to include departments that have no employees.
