# Revenue Java Training - Cancer Diagnosis Predictor 

Welcome to the Revenue training course for Java! This Git repo contains a skeleton project ready for you to clone. Over the next few days, we'll build it up to be a fully fledged Java/Spring API. The aim of this course is to get you familiar with the basics of Java, working with Spring and sending and receiving data through web requests. 

The underlying theme of the app is that it acts as an API for doctors to access and store malignant cancer diagnoses, called screenings. Under the hood in the skeleton project is an in-memory database of about 500 cancer diagnoses taken from a well known dataset. This is the same dataset you'll be using in the AI hackathon at the end of your training. By the end of the course, you will be able to query this dataset and insert new records by using an API you built! 

Sounds exciting!

This course is perfect for complete **Java newbie's**. If you have previous experience in development, this will act as a great refresher. If not, we'll get you up to speed on the basics of how a Java app works. Each day you'll perform a number of **tasks** to build the application. Before you start a task, you should watch the related **YouTube** videos listed to give you a bit of background and help you complete the task. But don't rely solely on the videos or the hints in this guide. There's a wealth of information out there on the Internet, particularly from sites such as [Stack Overflow][stack_overflow]. 

Some things we'll cover over the next few days include:

  - Setting up you development environment.
  - Working with Git to clone, commit, push and merge.
  - Creating classes with variables, methods and interfaces and other Java stuff.
  - Using design patterns to solve the issue of mapping our data to Java from the database.
  - Building an API to GET and POST data to a database.
  - Writing some basic SQL.
  - Creating a front end for our app in Angular that interacts with our API.

Let's get started...

---
## Day 1

### Overview

Some tools we'll be using today include:

  - **Git** is used to store and manage our code. When we make a change, we want to commit it to Git so that it is saved somewhere safe. Others can then pull down our code and run or modify it. **Throughout the course, we will be committing our code to our own private repository**. To do this, we will create our own personal repository in [GitHub][create_an_innersource_account] and then push our skeleton project to it. At the end of each day, we'll push our code up to this repo.
  - **Intellij** is the IDE we will be using to write and run our code. An IDE is our development environment for writing code. It's easy to use and contains everything we need to create and deploy Java applications.
  - **Java** is the language we use to write our code. It is based around the idea of Objects. In our case, a patient that could potentially have a malignant cancer could be a ```Patient``` object who has a name, date of birth and gender, which make up the object. 
  - **Postman** is a tool we can use to test our API. It allows us to easily send an recieve data. We will be using this starting from around Day 2.

### Training Material

Watch the below videos before you attempt the first task:

* [What is Git][what_is_git] - Overview of what Git is and why we use it.
* [Git Hipster Analogy][git_hipster_analogy] - Another way to think about version control systems.
* [Basic Git Commands][basic_git_commands] - Basics such as clone, push, pull & branch which you'll need.
* [What is Java][what_is_java] - Overview of Java.
* [JRE & JDK][jre_and_jdk] - A bit more background on Java. Good to know...
* [Creating a Basic Intellij Java Project][creating_a_basic_intellij_java_Project] - Another nice to know to get you familiar with Intellij. We'll be importing our project however.
* [Packages][packages] - Classes are stored in packages. They help to logically organize our code.
* [Variables][variables] - Variables are used in all programming languages to store data.
* [Classes][classes] - Classes are a how we represent our data.
* [Methods][methods] - These allow us to perform operations on our classes.
* [Strings][strings] - Strings represent sentences and allow us to represent information.

### Tasks

With the videos watched, we can now move onto the fun part. What we'll be doing today is setting up our development environment, cloning this repo to our local environment and start creating some basic Java classes.

#### Task 1: Setup Git and Run App
1. Setup up Git on your local PC.
2. Fork this Git repository to your personal GitHub account and then clone it to somewhere on your computer.

![Fork](files/images/fork.png )

3. Import the project into Intellij.
4. Run the app. You should see a welcome message in the console screen.

![Welcome Screen](files/images/welcome_screen.png)

*Hints*
* You can install [Git for Windows][git_for_windows] to use Git on your laptop.
* A fork is just a copy of a Git repository that doesn't affect the original!
* The URL for your cloned version of this project should look like this: https://github.com/TAG-Training/revenue-java-training.git
* If you have any problems forking or cloning, you can simply download this project and run it locally.
* It's a good idea to have a dedicated development folder on your PC. Perhaps C:/development/projects...
* Import the project as a Maven project. We'll come to what Maven is later.

#### Task 2: Create and Initialize Some Classes
With the app up and running, we can now write some basic code. In our project, we want to represent patient's and their cancer diagnoses. We can do this using classes. Each new patient will be an object which is an instance of our patient class. These classes will contain multiple fields to represent the information we need. Read the hints for more info on how to correctly name and populate these objects.

1. First thing first is to create a new branch in git for the code we're about to write.  
2. Create a basic class to represent a ```Patient```. Put this object in the patient package. Give it the following fields:
    1. Name 
    2. Id 
    2. Date of Birth
    3. Gender
3. Create another class to represent a ```Screening```. Again, store it in the screening package.
    1. Screening Id 
    2. Patient Id
    3. Date of Screening
    4. Malignant Result (True/False)
4. Add a constructor to each class.
5. Add getters and setters for each field.
6. In the ```main``` method in the ```TagTrainingSpringApplication``` class, create a new instance of each object using some dummy data.
7. Print out the patient's name and their diagnosis to the console using a ```String```.

![Joe Result](files/images/task_2_subtask_1_result.png)

8. Change the ```patientId``` field in ```Screening``` to be an instance of ```Patient```. You will need to update the constructor, getters & setters.
9. Rerun the app and verify the same info is printed to the console.
10. Update the patient's name using the setter on the ```Patient``` class. Verify the new name is printed.
11. Once everything's done, merge your changes into your main branch and push it up to GitHub!

*Hints*
* In most project you have a main branch and your own dev branch. Call the branch something identifiable, such as john_doe_dev, or day_1.
* Switching to a new branch is easy. Simply use ```git checkout -b <branch>```
* Packages help logically organize our code. You can either create a package called models for both classes or better yet a new package for each.
* [Naming] is important in Java. i.e. ```Patient``` class goes into the ```patient``` package. 
* ID fields are normally of type ```Integer```, i.e. 1, 2, 3...
* Date's can be represented using the ```LocalDate``` type.
* Gender can be easily represented using [Enums]. One is already provided!
* Constructors, getters and setters can be automatically [generated] by Intellij to save a lot of typing! (See below)

![Generate Code 1](files/images/generate_1.png)

That's it for Day 1!

[stack_overflow]: <https://stackoverflow.com/questions/tagged/java>
[what_is_git]: <https://www.youtube.com/watch?v=2ReR1YJrNOM>
[git_hipster_analogy]: <https://www.youtube.com/watch?v=uUuTYDg9XoI>
[create_an_innersource_account]: <https://github.com/join>
[basic_git_commands]: <https://www.youtube.com/watch?v=USjZcfj8yxE>
[what_is_java]: <https://www.youtube.com/watch?v=2Xa3Y4xz8_s>
[jre_and_jdk]: <https://www.youtube.com/watch?v=BXFHuaQNnLo>
[creating_a_basic_intellij_java_Project]: <https://www.youtube.com/watch?v=yefmcX57Eyg>
[variables]: <https://www.youtube.com/watch?v=so1iUWaLmKA>
[classes]: <https://www.youtube.com/watch?v=IUqKuGNasdM>
[methods]: <https://www.youtube.com/watch?v=cCgOESMQe44>
[strings]: <https://www.youtube.com/watch?v=3xuJIaP3C4g>
[git_for_windows]: <https://git-scm.com/download/win>
[packages]: <https://youtu.be/yefmcX57Eyg?t=4955>
[localdate]: <http://tutorials.jenkov.com/java-date-time/localdate.html>
[naming]: <https://www.javatpoint.com/java-naming-conventions>
[generated]: <https://www.jetbrains.com/help/idea/generating-code.html>
[enums]: <https://www.youtube.com/watch?v=LYKHxwQ0QH8>

---
## Day 2

### Overview

Yesterday we focused on creating classes with some fields to hold our data. Today we will be exploring more of the features that Java provides to do some more intricate logic stuff with our classes. 

Some of these Java things we'll cover include:
  - **Conditional Logic** also known as if-else statements are used to make decisions if something is true or false. 
  - **Loops** give us the ability to iterate over these arrays and other collections to perform operations on them.
  - **Arrays** allow us to store multiple objects together.
  - **Methods** are a core part of classes in Java. They allow us to perform operations on our objects. 

### Training Material

Again, watch the below videos before you attempt each of the tasks:

* [Conditional Logic][conditional_logic] - What is conditional logic in Java.
* [If-Else Statements][if_else_statements] - Most commonly used way of making decisions in Java.
* [Logical Operators][logical_operators] - We use logical operators to make decisions in our conditional logic. i.e. is 1 == 1, true.
* [Switch][switch] - Similar to an if-else statement, but more appropriate in certain contexts. 
* [Arrays][arrays] - Way of storing multiple objects in a group.
* [Lists][lists] - A type of collection similar to an array but with additional functions.
* [Loops][loops] - How to loop over a list of objects.
* [For-each Loop][for_each_loop] - Handy way of looping over objects.
* [Equality][equality] - For when you're trying to find a match between two objects.
* [Null][null] - Objects that have no data are null.
* [Spring Intro][spring_intro] - Watch just the intro to get an idea of what Spring is and why we use it.
* [REST API][what_is_rest] - REST is what we use to send and receive information. In our case it will be screening results.
* [Spring REST][spring_rest] - Here's how to do it in Spring!
* [Autowring][autowiring] and a short [demo][autowiring_demo] - The spring framework comes with handy Java annotations that reduce the amount of code we need to write. 
* [Spring Annotations][list_of_annotations] - Bit of background on the annotations we will use. In particular, ```@Autowired```, ```@Service``` and ```@GetMapping```. 

### Tasks

We're going to be applying some of what we've learnt in the first few of the above videos to our project now. We use conditional logic to enhance some of the code we've already written. This can be used to prevent errors by checking if certain conditions are true. We can also leverage the power of collections. This allows us to process multiple objects, such as a list of ```Screening```, at once. 

Finally, we're going to add **Spring** to our project! This will allow us to make requests to our app from our browser/Postman using a URL and to get resources (like ```Screenings```) back in response. This is known as a REST API. Again, there's a lot going on under the hood with Spring but we'll just be wiring up the basics. Spring is designed to be very easy to work with and provides a number of **annotations**. These are single lines of code starting with the ```@``` symbol which do a lot of work for us. 

Let's start...

#### Task 1: Use Conditional Logic If/Else
1. First things first, check your project from yesterday is still working (printing a patients screening result) and create a new branch in Git for Day 2!
2. Create a new class called ```ScreeningService``` in the service package.
    1. Give the class a default constructor.
    2. Add a method in the new class that accepts a ```Screening``` & ```Patient``` as parameters. The method should return true or false depending on if the screening is for the specified patient.
3. In your main class, instantiate the ```ScreeningSerivce```. 
4. Pass in a screening and patient and capture the result. With the result, print a message stating if the screening matches the patient or not.

![Day 2 Task 1 Expected Output](files/images/day_2_task_1_expected_output.png)

#### Task 2: Use a Loop to Iterate over Objects
1. Create 2 or 3 new ```Patient``` objects 
2. Also create a few corresponding ```Screening``` objects for each patient.
3. Create a ```List``` of screenings and add each screening to that list.
4. Using a loop, iterate over the list of screenings and print out the patient's name and their screening result.

![Day 2 Task 2 Expected Output](files/images/day_2_task_2_expected_output.png)

#### Task 3: Flesh Out Service Class & Implement For-Each Loop
Now we're going to clean up our code by moving what we've written so far into separate classes. 
1. Start by creating a ```ScreeningDatabase```.  
2. Add a new public method to this class to return a list of all the screenings. Move all the patients and screenings to this class.
3. Update the ```ScreeningService``` class with a field (and its constructor) of type ```ScreeningDatabase```. 
4. Also give the ```ScreeningService``` a new method to return the list of screenings from the ```ScreeningDatabase``` object it has.
5. In your main class, create a new ```ScreeningDatabase``` object and pass it into the ```ScreeningService```.
6. Now in your main class, fetch the ```Screening``` list from the ```ScreeningService```.
7. Remove any redundant code and hit play! Check the loop still works as it did in **Task 2**.

**Extra points**
If you've finished the above, congrats! Here's one last challenge:
1. Add a second method to the ```ScreeningService``` class that takes a name, loops over all the screenings and returns the matching ```Screening```. If no match is found, return null.
2. In your main class, call this new method to get a ```Screening``` back for a name.
3. If the ```Screening``` you get back is not null, print the name and the screening result. Else, print a message stating that no screening was found.

#### Task 4: Implement Basic Spring GET Endpoint 
Finally, we're going to leverage **Spring** to Autowire our Service and Database classes! This mean that we no longer use the ```new``` keyword to create our utility classes, such as the database. Instead, Spring makes them available to us to use on-demand. These are called **beans** (for some reason). 

However, we have to first do a little bit of prep work to our code. This will allow us to fully leverage Spring and to start making requests from our browser. Our first task is to create a controller. This will take requests from our web browser and gives us back a result. In our case we want to get a screening result for a patient.

Let's begin...

1. In the screening package, create a new ```ScreeningController``` class. Annotate it with ```@RestController```. 
2. Update the ```ScreeningDatabase``` class to be a bean by adding the ```@Component``` annotation.  
3. Autowire the ```ScreeningDatabase``` into the ```ScreeningService``` class. 
4. Update the ```ScreeningService``` to itself be a service bean using the ```@Service``` annotation. You can also remove it's constructor.
5. Now, autowire the ```ScreeningService``` into the new ```ScreeningController```.
6. Now add a new method to the ```ScreeningController``` called _getScreenings_ which returns a list of ```Screening```. This is our first API method which returns all the screenings we have.
7. Update this new method to call the ```ScreeningService``` get screenings method and return the list of ```Screening```.
8. Add the Spring ```@GetMapping("/screenings")``` annotation to our new method. This is our URL to access the endpoint.
9. Run the Spring app and test it out! Try hitting ```http://localhost:8080/screenings``` from **Postman** or **Chrome** and all the screenings should be returned in JSON.
10. Don't forget to merge your Day 2 changes into your master branch and push to GitHub!

![Day 2 Task 4 Expected Output](files/images/day_2_task_4_expected_output.png)

*Hints*
* Your main class by the end of task 4 should only have the line ```SpringApplication.run(TagTrainingSpringApplication.class, args);```
* Install a JSON formatter in Chrome to prettify your JSON.
* Spring uses a library called Jackson to automatically formot our objects as JSON. 

[conditional_logic]: <https://www.youtube.com/watch?v=ln_vMXXXeDI>
[if_else_statements]: <https://www.youtube.com/watch?v=yvWnj_HfG6s>
[logical_operators]: <https://www.youtube.com/watch?v=p0UCTkqU2mg>
[switch]: <https://www.youtube.com/watch?v=O4KGYGQvHmw>
[lists]: <https://www.youtube.com/watch?v=YQQio9BGWgs>
[loops]: <https://www.youtube.com/watch?v=3jMaKlNBjug>
[arrays]: <https://www.youtube.com/watch?v=xzjZy-dHHLw>
[for_each_loop]: <https://www.youtube.com/watch?v=t8mmNbgKA8w>
[equality]: <https://www.youtube.com/watch?v=9CVcmxYWm5U>
[null]: <https://www.youtube.com/watch?v=kot131zufIQ>
[spring_intro]: <https://www.youtube.com/watch?v=vtPkZShrvXQ>
[what_is_rest]: <https://www.youtube.com/watch?v=6sUbt-Qp6Pg>
[spring_rest]: <https://spring.io/guides/gs/rest-service/>
[autowiring]: <https://www.youtube.com/watch?v=k0aChfMjA-4>
[autowiring_demo]: <https://www.youtube.com/watch?v=k0aChfMjA-4>
[list_of_annotations]: <https://springframework.guru/spring-framework-annotations/>

---
## Day 3

### Overview
For the final day of Java training, well be adding some additional features to our API to retrieve and create screenings. To do this, we'll be leveraging the power of Spring. Spring has many powerful tools for manipulating data, particularly for creating APIs. The annotations it provides (some of which you used yesterday) will allow us to easily read and insert data. We'll also be implementing a simple Design Pattern to access our data, as well as implementing an interface and doing some basic interactions with a database using SQL.  

In the background of our Spring app is a pre-populated, in-memory database of screenings. This is what we're going to be interacting with today to get and store data through our API. The database contains about 500 screenings with each one being uniquely identified by an *id*. This id belongs to a single patient. Our Spring app interacts with the database using the power of SQL. We'll only have to write a few lines to get things up and running.     

If you want to play around with the in-memory database, you can! To do so:

1. Login to the database using the following url: http://localhost:8080/h2-console
2. You should see the following login form. If the box for JDBC url isn't populated with the below, simply copy ```jdbc:h2:mem:malignantScreeningDB``` in and then connect.

![H2 Login](files/images/h2_login.png)

3. Once in, click the ```SCREENING_RESULTS``` column on the left and start typing some SQL into the form! The example below lists all the screenings in the database. Don't worry about breaking anything. Whenever you restart the Spring app, the DB is reloaded from scratch. 

![H2 SQL](files/images/h2_sql.png)

### Training Material

Below are several videos to watch related to Spring, Maven, HTTP, API's and databases, all of which we're going to cover in the tasks for today:

* [Maven][what_is_maven] - Maven is what we use to manage dependencies in our project. Lombok is one of these.
* [Lombok][what_is_lombok] - Lombok reduces the amount of repetitive code we need to write. Such as getters/setters and even constructors.
* [JSON][what_is_json] - JSON is a way of formatting our objects in a standard format so they can be used by other programs. This is useful in our case when we want to send a screening to our frontend!
* [Design Patterns][design_patterns_intro] - Design patterns are proven coding solutions to common occurring problems in software design. We'll be using the DAO (Data Access Object) pattern to get our Screenings from a database, map them to our Java object and send them back to the client. 
* [Interfaces][interfaces] - Part of implementing our DAO requires creating an interface. This is like a Java contract which is implemented by our classes.
* [What is CRUD][what_is_crud] - Acronym for Create, Read, Update and Delete used commonly with APIs. In our case we are going to Read and Create screenings. Link also contains some good examples of JSON and how it's used in CRUD operations.
* [Intro to Databases/SQL][intro_to_sql] - We'll be writing a small bit of SQL to get data from our local database.
* [SELECT statements in SQL][sql_select] - SELECT's are used to **GET** the data we want from the database.
* [INSERTS statements in SQL][sql_insert] - INSERT's are used to add data to a database.
* [Exceptions][exceptions] - Java throws exceptions when it hits a problem. One of the problems we can face in our app is no data existing for a particular patient when we run some SQL. We can catch these runtime errors and handle them cleanly in our program using exception handling.

#### Task 1: Implement Lombok & Clean Up Code
Our first task will be to update our existing ```Screening``` class with the 30 odd fields that exist for a malignant screening in our data set. Up until now, we've just had 4. As you can see from the [file][malignant_dataset_file], which represents malignant screenings for a number of patient's, there are quite a lot of fields we will need in our class! If we were to write (or generate) a getter/setter for each field, the class would run to 100's of lines.

![Dataset Pic](files/images/dataset_pic.png)

To get around this, we can use a code generation tool called [Lombok][project_lombok]. Lombok will create getters/setters on the class at runtime, saving us from having to explicitly write them. Now instead of having a bloated class file, we simply have Lombok do all the work using 2 simple annotations at the top of the class! 

Let's do this now:

1. Install the Lombok plugin for Intellij and enable annotation processing. 

![Lombok Plugin](files/images/lombok_plugin.png)

2. Now add the [Lombok dependency][lombok_dependency] to the pom.xml so we can use Lombok in our project.

![Lombok POM](files/images/lombok_pom.png)

3. In the ```Screening``` class, delete every field and constructor.
4. Copy the pre-made fields from [here][result_fields] and paste them as fields into your empty ```Screening``` class.
5. Now add the Lombok ```@Getter``` and ```@Setter``` annotation to the ```Screening``` class. 
6. Do the same in the ```Patient``` classes, except use the ```@Data``` annotation. Delete the existing explicit getters/setters/constructors as they are not needed anymore.

Now we just need to clean up our code to factor in our changes to the ```Screening``` class!
1. We deleted the constructor earlier from the ```Patient``` object. Add a Lombok ```AllArgsConstructor``` annotation in addition to the ```@Data``` annotation to replace it.
2. Delete the ScreeningDatabase class. We're going to use the in-memory database in the next task to replace this.
3. Update the ```ScreeningService``` ```isPatientScreening``` method to compare the ```Screening``` id to the ```Patient``` id using equality. Notice that we are comparing a primitive to a class!
4. In the same class, up the ```getScreenings``` method to return ```Null``` for now.
5. Run the app and check there are no errors.

Our objects should now be wired with Lombok! The amount of what is called *BoilerPlate* code has been significantly reduced and our classes look much cleaner. Next, we need to populate our ```Screening``` fields with data from the in-memory database! 

We'll do this now in Task 2...

*Hints*
* We just need to do 2 things to setup [Lombok in Intellij][intellij_lombok]. That is enable annotation processing in settings and add the Lombok plugin for Intellij.
* You can find the Maven dependency for Lombok here https://mvnrepository.com/artifact/org.projectlombok/lombok/1.18.12. Simply copy and paste this into your dependency section in your pom.xml (Project Object Model) file.

#### Task 2: Write SQL & Read Data from Database
Now we're ready to implement the population of screenings from our local database. Running in the background of our Spring app is an in memory database with 100's of [screenings][list_of_sql_screenings]. What we're going to do now is implement a few changes so that we can get this data!

First we need to create our contract for accessing the Screening data from our local database.
1. Create a new interface ```ScreeningDao``` in the screening package.
2. Give the interface 2 methods.
    1. Get a ```Screening``` for a patient id.
    2. Get all the ```Screenings```.
3. Create a new class called ```ScreeningDaoImpl``` that implements the ```ScreeningDao``` (can use Intellij again to generate methods). Wire it up as a Spring bean. 
4. Lastly, delete the ```ScreeningSerivce``` ```getScreenings``` method. We're now just going to use our DAO above to get data.
5. Lastly, lastly, replace the ```ScreeningSerivce``` with ```ScreeningDaoImpl``` update any references.
6. Press play and check everything is still working!

Now we're going to write some SQL to get screenings from the local database. 
1. First autowire the ```JdbcTemplate``` Bean into our ```ScreeningDaoImpl```. This bean is provided by Spring to easily execute our SQL.
2. Uncomment the class ```ScreeningRowMapper```. This was disabled up until now as the Screening class didn't have the correct fields we needed to map.
3. Create a new *String* to represent an SQL statement to get all the fields from the table *screening_results*.
4. Add [this][screening_jdbc_all] line to your method which will use the JDBCTemplate to attempt to execute your SQL you just wrote and return a list of ```Screenings```. 
5. Do the same for a single patient id. Use [this][screening_jdbc_single] Java code to execute your SQL to return just a single ```Screening```.
6. Update the ```ScreeningController``` with a new endpoint to accept a single patient id and return the Screening from the DAO using the above method. You can use the ```@PathVariable``` annotation in the method signature.
7. Run the app and check that both the endpoints are now working! 

**To Test the Endpoints**: Try a patient id (from the [data set][malignant_dataset_file]) that does exist and one that does not. You should get an error for the one that does not exist. This is an exception and we will be updating our code to better handle this later. Also, try the endpoint to get all Screenings. It should return every ```Screening``` from the database as one big blob of JSON.

![GET Screening](files/images/get_screening.png)

*Hints*
* Intellij can implement the methods from an interface automatically for you. Click the red ballon after you have added the ```implements ScreeningDao``` line to the ```ScreeningDatabase``` and click *Implement Methods*.
* The ```ScreeningRowMapper```  maps the SQL screening result to our Java ```Screening``` objects.

#### Task 3: Insert Data into Database
In the previous task we selected, or **Read**, screenings. Now we are going to **Create** them. 

1. Add a new method signature to the ```ScreeningController``` that's purpose is to update a screening.  
2. Give it an annotation of ```@PostMapping("screenings")```. 
3. Also give it a ```@RequestBody``` of ```Screening```. This means that we expect a JSON version of a screening to be sent in the request to our app. 
4. Update the ```ScreeningDao``` with a new save method. It should take a ```Screening``` as a parameter.
5. Implement this method in the ```ScreeningDaoImpl```. Using the ```jdbcTemplate.update()```, write SQL to insert a new row into ```screening_results``` with the values ```id```, ```diagnosis```, ```symmetry_mean``` and ```group_id```.

Now we're ready to send some JSON to our new endpoint!
1. In **PostMan**, create a new request with a method type of **Post**. 
2. Get a JSON ```Screening``` from the single screening endpoint and paste it into the *Body -> raw JSON* tab of the request in PostMan. 
3. **Modify** some of the values on the request, particularly  the screening *id*.
4. Send it and verify your new screening exists by fetching the screening for the new patient id.

![POST Screening](files/images/post_screening.png)

That's it, you've now created an API using Spring!

#### Task 4: Exceptions
For our final task, we're going to implement a small bit of exception handling. This is to catch errors in our Java program when we don't get any results back after running our SQL.

1. In the ```ScreeningDaoImpl``` get for patient id method, implement an empty try/catch block.
2. Wrap your ```jdmbcTemplate.queryForObject()``` code in the try block.
3. In the catch block, you want to catch the Exception type ```EmptyResultDataAccessException```.
4. Print a helpful message in the catch block. 

For extra points, you can implement logging! Logs are what we analyze on live systems to see where errors occurred.
1. At the top of the ```ScreeningDaoImpl``` class, add the annotation ```@Slf4j```. This is our logging library.
2. In the catch method, replace the message with ```log.info("..."")``` for example.
3. Run the app and try a patient id that doesn't exist. Verify the log message shows on the console output.

Done! We have now implemented **C** and **R** from **CRUD** in our Screening API. 

[malignant_dataset_file]: <https://github.com/TAG-Training/revenue-java-training/blob/day_3/files/malignant_cancer_dataset.csv>
[project_lombok]: <https://projectlombok.org/>
[lombok_dependency]: <https://mvnrepository.com/artifact/org.projectlombok/lombok/1.18.12>
[design_patterns_intro]: <https://youtu.be/NU_1StN5Tkk?t=101>
[interfaces]: <https://www.youtube.com/watch?v=kTpp5n_CppQ>
[what_is_maven]: <https://www.youtube.com/watch?v=dqJanLvjDqc>
[what_is_lombok]: <https://www.vogella.com/tutorials/Lombok/article.html>
[what_is_json]: <https://www.youtube.com/watch?v=iiADhChRriM>
[intellij_lombok]: <https://www.baeldung.com/lombok-ide>
[result_fields]: <https://github.com/TAG-Training/revenue-java-training/blob/day_3/files/result_fields>
[dao_pattern]: <https://www.tutorialspoint.com/design_pattern/data_access_object_pattern.htm>
[what_is_crud]: <https://www.codecademy.com/articles/what-is-crud>
[intro_to_sql]: <https://www.youtube.com/watch?v=27axs9dO7AE>
[sql_select]: <https://www.w3schools.com/sql/sql_select.asp>
[sql_insert]: <https://www.w3schools.com/sql/sql_insert.asp>
[list_of_sql_screenings]: <https://github.com/TAG-Training/revenue-java-training/blob/day_3/src/main/resources/db/data.sql>
[screening_jdbc_single]: <https://github.com/TAG-Training/revenue-java-training/blob/day_3/files/get_single_screening_query>
[screening_jdbc_all]: <https://github.com/TAG-Training/revenue-java-training/blob/day_3/files/get_all_screenings_query>
[request_mapping_example]: <https://www.baeldung.com/spring-requestmapping#1-requestmapping---by-path>
[exceptions]: <https://www.youtube.com/watch?v=xNVlq9IEBEg>
