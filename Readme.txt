The tests are created using Maven, Eclipse IDE, TestNG and dependencies on Windows 7 machine

The tests include Creating single hotel and Creating Multiple hotels. The tests do not have any assertions for hotel creation as the click on Create button is not working in Restful Booking Platform

Follow the below instructions to execute the tests:

1)Install Apache Maven
2)Add new system variable "M2_HOME" and value the path of Apache Maven folder (Example: C:\Program Files\Apache\Maven)
3)Add value "%M2_HOME%/bin" to the system Path variable
4)Import the UiTest project into Eclipse
5)Open command prompt in UiTest folder
6)Run mvn test command

To run the tests from Eclipse IDE:

1)Right click on pom.xml in the Project directory
2)Select Run as > Maven test