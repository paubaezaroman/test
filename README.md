This is a very basic framework for HUDL company.

********************************************************************
0. This is the System and toolset used:
    - MacMini M1
    - Chrome browser and ChromeDriver 99.0.4844.51
        from MAC: download latest driver for MAC M1 chip and remove from quarantine running this from terminal:
        xattr -d com.apple.quarantine /Users/paubaezaroman/Automation/JavaFramework/browserDriver/chromedriver

    - IDE --> IntelliJ community edition
        - Plugin: Cucumber for Java
        - Plugin: Gherkin

    - JAVA JDK 11
    - MAVEN
    - Selenium 3.141.59

********************************************************************

1. For compilation:

- run this command from the terminal: mvn clean compile

- Reimport the project


********************************************************************

2. To run tests:

- Amend the line 7 of this file "test/src/main/resources/features/Login.feature" with the correct user email and password

- Run this Runner class: src/main/java/com/test/TestRunner.java

or

- Right Button and Run Feature on --> src/main/resources/features/Login.feature

or

- mvn test

********************************************************************

3. To check the report:

    It is under target folder: cucumber.html
    
    You can also check evidences under the folder target/TestEvidences
    
    !!!Note: I have left an example of the report and upload target folder in case you are not able to run.
