# springboot-restapi-on-employee-resource

Tools used:
Spring Tool Suit IDE, Git, Github,MySql (localhost),Java 17(JDK),postman(api testing).


explanation:

created a Employee class model(Entity) (in com.javaguides.springboot.model packege).
created a EmployeeRepository interface by implementing JPA repository (in com.javaguides.springboot.repository package).
created a EmployeeService interface (in com.javaguides.springboot.service package).
declered five methods in EmployeeService.
created a EmployeeServiceImpl class provide implementation to  EmployeeService methods(in com.javaguides.springboot.service.impl package).
created a EmployeeController class( in com.javaguides.springboot.controller package).
created a ResourceNotFoundException class to handle exception when employeeresource not found in database with given id(in com.javaguides.springboot.exception package).
developed rest api for five methods
1.to create or insert employee object into database.
2.to get list of employees objects from database
3.to get employee object by entering id
4.to update employee object states by id
5.to delete employee object states by id

Note: used lambdok to avoid boilerplate code of getter,setter,hashcode,constructor with feild methods in model class.


