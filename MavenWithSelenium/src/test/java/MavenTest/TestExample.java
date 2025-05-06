package MavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://edso.in/");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        driver.close();
    }

}


// Dependency create under .m2 folder  >>> C:\Users\Ketan.Tekale\.m2


/*
Apache Maven : -

Maven is an automation and management tool developed by Apache Software Foundation.
It is written in Java Language to build projects written in C#, Ruby, Scala, and other languages.
It allows developers to create projects, dependency, and documentation using Project Object Model and plugins.
It has a similar development process as ANT, but it is more advanced than ANT.
Maven can also build any number of projects into desired output such as jar, war, metadata.
It was initially released on 13 July 2004. In the Yiddish language, the meaning of Maven is “accumulator of knowledge.”


How can Maven benefit my Automation process?
Maven helps the developer to create a java-based project more easily.
Accessibility of new feature created or added in Maven can be easily added to a project in Maven configuration.
It increases the performance of project and building process.
The main feature of Maven is that it can download the project dependency libraries automatically.


Phrases used in Maven ?
groupId:  Generally, groupId refers to domain id. For best practices company name is used as groupId. It identifies the project uniquely.
artifactId: It is basically the name of the Jar without version.
version: This tag is used to create a version of the project.
Local repository: Maven downloads all the required dependencies and stores in the local repository called .m2



Maven Build Life Cycle  >>
clean: deletes all artifacts and targets which are created already.
compile: used to compile the source code of the project.
test: test the compiled code and these tests do not require to be packaged or deployed.
package: package is used to convert your project into a jar or war etc.
install: install the package into the local repository for use of another project.


Maven simplifies the code handling and process of building the project.
Most of the projects follow maven structure.
Download all dependencies provided the dependencies are available in maven central repository.
If any of the dependency is not available in maven central repository, then you must add repository path in pom.xml explicitly.
There are many other build tools available in like ant. But it is better to use maven while dealing with different versions and different dependencies.
Maven even can manage the dependencies of dependencies.
Other tools may not provide such flexibility like maven.
*/

