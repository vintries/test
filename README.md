# test

Steps to run the program:  ---  Java 8 must be installed on machine.

1: go to build directory ---  <path>/sol/build > 
  
  
2: execute command :  java -jar app.jar
    ex: <path>/sol/build > java -jar app.jar
  
  to specify fileName: please use jvm arg = file.name
  java -Dfile.name=pathToFile/ProgrammingAssignment.csv -jar app.jar 
  or just put ProgrammingAssignment.csv file in current directory.

  
3: please follow the program instructions.
  
4: for the unit test -- Junit is good to test this.

5: for the integration testing --- it can be exposed as REST service using spring boot - either consumer can send the collection or prog can load the data and keep it in cache and test case can be executed.
  
