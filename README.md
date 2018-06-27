CUSTOMER ONBOADRING APPLICATION

STACK - JAVA, SPRING, MONGO
DEPLOYMENT - APACHE TOMCAT

clone the project

From terminal run the command
----> mvn spring-boot:run
Spring application will start localhost:8080

Test Scenarios
- Check if New Customer can be created
- Check if existing customer data can be opened
- Check if existing customer data can be opened using customer first Name
- Check if all customer data can be Retrieved.
- Check if a customer data can be deleted using customer first Name
- Check if all customer data can be deleted

TestCases
- Verify if getting the welcome message on accessing localhost:8080
- Verify able to create new Customer with /newCustomer by providing customer
firstname&amp;Lastname&amp;mobilenumber&amp;location and Status should be 200
- Verify if create new Customer /newCustomer is successful values should have added in the
database.
- Verify able to get customer data with /getCustomer providing customer firstName and
status should be 200
- Verify able to get all customer data with /getAllCustomer
- Verify able update customer details with /UpdateCustomer providing any changes
required in firstname&amp;Lastname&amp;mobilenumber&amp;location
- Verify if UpdateCustomer is successful values in the database should be updated
- Verify able to delete a customer with /deleteCustomer providing customer firstName
- Verify if deleteCustomer is successful customer data is deleted from database.
- Verify able to delete all the customer with /deleteAllCustomer
- Verify if deleteAllCustomer is successful all customer data should be deleted from
database.
- Verify &quot;PAGE NOT FOUND&quot; result is found on providing incorrect string. 404 Not Found
- Verify if incorrect POST is sent to the server 500 Internal Server Error is thrown

How to Run and above test cases with result

http://localhost:8080/
WELCOME TO CUSTOMER ONBOARDING

http://localhost:8080/admin
PAGE NOT FOUND

http://localhost:8080/newCustomer?firstName=Dilip&amp;lastName=Prakash&amp;mobileNumber=
9986919157&amp;location=India
(Customer First Name:Dilip Last Name:PrakashmobileNumber:9986919157location:India)

http://localhost:8080/getCustomer?firstName=Dilip
({&quot;id&quot;:&quot;5b1f8c1650f8c9dca48a9a16&quot;,&quot;firstName&quot;:&quot;Dilip&quot;,&quot;lastName&quot;:&quot;Prakash&quot;,&quot;mobileNum
ber&quot;:9986919157,&quot;location&quot;:&quot;India&quot;})

http://localhost:8080/getAllCustomer
[{&quot;id&quot;:&quot;5b1f8c4150f8c9dca48a9a17&quot;,&quot;firstName&quot;:&quot;Dilip&quot;,&quot;lastName&quot;:&quot;Prakash&quot;,&quot;mobileNum
ber&quot;:9986919157,&quot;location&quot;:&quot;India&quot;},
{&quot;id&quot;:&quot;5b1f8c7150f8c9dca48a9a18&quot;,&quot;firstName&quot;:&quot;Bee&quot;,&quot;lastName&quot;:&quot;Inc&quot;,&quot;mobileNumber&quot;:9
0909090,&quot;location&quot;:&quot;USA&quot;}]

http://localhost:8080/UpdateCustomer?firstName=Dilip&amp;lastName=Prakash&amp;mobileNumb
er=9090900990&amp;location=India
Customer First Name:Dilip Last Name:PrakashmobileNumber:9090900990location:India

http://localhost:8080/deleteCustomer?firstName=Dilip
Deleted Dilip

http://localhost:8080/deleteAllCustomer
Deleted All records
