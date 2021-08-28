IQ:
-->Can you tell me about your framework?

1) What is the type of your framework? BDD + POM ( Page Object Model Design Pattern)
2) Explain about the tools used in your framework?

  
  -Java
  -Selenium
  -Maven
  -pom.xml
  -jUnit
  -Cucumber
  -configuration file
  -Utilities
        -- Config class to read data from configuration file
        -- Driver -Singleton (By creating private constructor and create a method to get an instance of it)

IQ:
Tell me about your framework folder structure

   --src
    --main
    --test
        --java
                --pages : we are storing classes with separate pages and related WebElements
                --runner: We are storing class to run the tests
                --step_definitions:  We are implementing our steps in the feature file
                -- Utilities : Driver and Config, any other reusable methods 
        --resources:
                -features: these are the files where we keep our steps which are written in Gherkin language
   --target: all the results from the test are being stored in this folder (ex. html report)
   --pom.xml : file where we store and manage dependencies 
   --configuration.properties : important test data (passwords, username, browsers) in format of key & value

----
Types of framework:

 -- TDD (Test Driven Development)
   --> We create our test first
   --> Then we add the code

--BDD (Behavior Driven Development)
    --> this is an extension of TDD
    --> we write first test, but in gherkin language
    --> Then add the actual implementation of the test

---DDD (Data Driven Development)
  --> we are getting test data first from outside the framework  ( ex. excel, database), 
  --> we are runnig our tests using multiple data sets

---Hybrid framework:
    --> we combine different approaches from different types of framework

    : BDD + DDD; TDD+DDD; TDD +KDD(Keyword Driven Development)

-----------
What is the scenario ?  --> Test cases

CucumberOptions (from the runner class)

    plugin : we add report types,
    feature: path of the feature files
    glue: path of the step_definitons
    dryRun:
            --true : we are using this to get the steps definitions
            --false: this will run the tests and steps will ve executed

    tags : allow us to group my test
----------------------------------------

MAC: CMD+option+l
Windows: Ctrl + Alt + L

Cucumber Hooks
--> We are using for setup and tearDown method 
--> We are using for a proper reporting in cucumber
--> "Hooks" keyword which our program understand 

The flow of execution :
  @Before -->Test(Scenario) -->After 

1) Runner will hit the tag
2) Runner class will determine which feature file need to be executed 
3) Runner checks if the tags mach inside of the feature file
4) Runner is looking for step_definitons, and when it finds corresponding ones it will implement them 
5) Runner will execute step by step our flow 

--------
Summary for Hooks
Once ruuner class is triggered , the scenario tag is getting executed
The Hooks will run before and after each scenario
if test pass we just see the results, and no any image attched 
when test fail the image will be added to the step where it has a failure point

byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

We are casting our WEbdriver object to TakesScreenshot interface on order to be able to use method which come from interface 