---
layout: with-sidebar
index: 1
name: PA0
released-on: "2024-04-01"
---

# CSE 12 Programming Assignment 0 (Optional)

### Computer Setup

This optional assignment will teach you how to setup Java and VSCode, get the starter code from GitHub, and how to run VSCode projects from your own computer. If you already have the JDK installed from a previous quarter and a way to edit, compile and run Java programs, then you can skip this assignment. If you plan on using the lab computers in the CSE basement, you can also skip this assignment.

Any IDE can be used, however, the course staff is most familiar with VSCode and may not be able to help you with IDE issue if you choose to use a different IDE such as IntelliJ or Eclipse. 

There is no submission or grade for this assignment. You should complete the installation and setup of your Java tools prior to starting PA1 which will be released on Wednesday, April 3rd.

If you run into any problems, please reach out to a tutor during tutor hours using [https://autograder.ucsd.edu/](https://autograder.ucsd.edu/){:target="_blank"} to get 1-on-1 help (make sure to select CSE12 - SPR24), or stop by instructor/TA office hours.

What if you already have a different version of Java? In general, you will most likely be fine, but if you run into problems compiling and running your code, we will suggest uninstalling your old version and reinstalling the latest JDK.

## Using the CSE Basement Lab Computers

Log into your cs12sp24 account.
- If the lab computer is in Windows then restart and choose CentOS.
- If you’re logged into the lab machine with your regular UCSD credentials, first log out. Then, log in to the machine with your CSE 12 account. The username starts with "cs12sp24". If you don’t know what it is, use the ACMS account lookup tool: [https://sdacs.ucsd.edu/~icc/index.php](https://sdacs.ucsd.edu/~icc/index.php){:target="_blank"}.

## Download Java & VSCode

### Step 1: Installing Java and VSCode
General instructions for setting up your environment and installing Java and VSCode can be found in this [document](https://drive.google.com/file/d/18sR1b6DkCc1rRY_KDiTwJQ85_HAeai-D/view). 

### Step 2: Installing Extension Pack for Java
The [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack) adds support for Java and JUnit, and you need to install it on you system by going into the Extensions Tab in VSCode.

## Getting the Code

The starter code can be found at the following [Github repository](https://github.com/ucsd-cse12-sp24/cse12-pa0-starter){:target="_blank"}. If you are not familiar with Github, here are two easy ways to get your code.

1. Download as a ZIP folder 

After going to the Github repository, you should see a green button that says *Code*. Click on that button. Then click on *Download ZIP*. This should download all the files as a ZIP folder. You can then unzip/extract the zip bundle and move it to wherever you would like to work.

2. Using git clone (requires terminal/command line)

    After going to the Github repository, you should see a green button that says *Code*. Click on that button. You should see something that says *Clone with HTTPS*. Copy the link that is in that section. In terminal/command line, navigate to whatever folder/directory you would like to work. Type the command `git clone _` where the `_` is replaced with the link you copied. This should clone the repository on your computer and you can then edit the files on whatever IDE you see fit.
    
If you are unsure or have questions about how to get the starter code, feel free to make a Piazza post or ask a tutor for help.

## Running a Java Code in VSCode 

Open VScode and wait for it to prompt you to Open a Folder. A new window will open for you to select a folder to open. To open the given starter code, navigate to the folder `pa0-starter` or `pa0-starter-master` (depending on how you have downloaded the code, but make sure that the folder you are using should be just 1 level above the src folder), and open it. This is how your directory structure should look like:

<img width="367" alt="Screenshot 2024-03-31 at 11 46 09 AM" src="https://github.com/ucsd-cse12-sp24/website-draft-cse12-sp24/assets/34093007/18d2feaa-02ab-43ec-9c71-7083cffa49c6">

There are a few options to run the file. 

* First option is to open the VSCode terminal, and use command line to compile and execute the Java file.

  <img width="620" alt="Running through Terminal" src="https://github.com/ucsd-cse12-sp24/website-draft-cse12-sp24/assets/34093007/a822b342-6e0c-42d8-932e-d6671aa54aae">

To compile and execute, type the following commands in the terminal. Make sure you run these commands from the **src** directory

- Compile: `javac main/HelloWorld.java`
- Execute: `java main/HelloWorld`

Note: We are using main/ before because the file is inside the main folder in the src directory

<img width="620" alt="Screenshot 2024-03-31 at 11 49 24 AM" src="https://github.com/ucsd-cse12-sp24/website-draft-cse12-sp24/assets/34093007/146e4528-328b-40cc-8eff-d89e942ad419">

* Second option is to use the Play button on the top right of the window. 

  <img width="620" alt="Running through Play Button" src="https://github.com/ucsd-cse12-sp24/website-draft-cse12-sp24/assets/34093007/354dd6ff-29dc-4d91-8687-a5b94856ef25">

You should now see "Hello World!" printed to the VSCode terminal.
You have successfully ran a program on VSCode!


## Running Tests through JUnit

JUnit is by far the most popular and widely-used unit testing framework for Java. We will use the version 4 of this framework: JUnit 4. In JUnit, you build one or more test classes and use a test runner to execute them. 

The Test Runner for Java extension can be used for running JUnit tests with VSCode. This extension comes in the Extension Pack for Java mentioned in Part 1, and does not need to be installed separately if the Java Extension Pack was installed: https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-test

Documentation for using it can be found here:
https://code.visualstudio.com/docs/java/java-testing#_enable-testing-and-adding-test-framework-jars-to-your-project

As we aren’t using Maven or Gradle, any instructions pertaining to them can be ignored. Follow instructions for using it with an “Unmanaged Folder”, and enable JUnit through the Testing Explorer.

Important note: When enabling tests through the extension, make sure to select JUnit as your test framework instead of JUnit Jupiter or TestNG. JUnit is JUnit 4, which is the version we will be using in this course.

<img width="620" alt="Screenshot 2024-03-31 at 11 42 14 AM" src="https://github.com/ucsd-cse12-sp24/website-draft-cse12-sp24/assets/34093007/c1918a8f-e88a-472e-bfa0-f9cd6e2bbe83">

If you follow the instructions and tests don’t run, run the following command in VSCode:

* Ctrl + Shift + P: Opens the Command
* Search for “java clean” or “Java: Clean Java Language Server Workspace” and run that command
* Java Clean also works great if you run into other issues with Java in VSCode

<img width="620" alt="Clean Java Language Server" src="https://github.com/ucsd-cse12-sp24/website-draft-cse12-sp24/assets/34093007/96183274-9469-4f59-b632-3fe15e294a16">

* Hit the “Reload and Delete” button and check the Testing Explorer again

<img width="620" alt="Reload and Delete" src="https://github.com/ucsd-cse12-sp24/website-draft-cse12-sp24/assets/34093007/40205ce0-b87a-4c42-938e-ac6dc81aa8e4">

* If your JUnit has been setup correctly, you should be able to see a play button beside the test. You can click on that to run the test. Alternatively, you can go to the left hand side testing panel to see all tests in your directory, and run them.
* Also, you should see two new .jar files added to your lib folder - hamcrest-core-1.3.jar, and junit-4.13.2.jar. These are the files that help us in running tests through JUnit 4. 
  
<img width="620" alt="Screenshot 2024-03-31 at 11 53 51 AM" src="https://github.com/ucsd-cse12-sp24/website-draft-cse12-sp24/assets/34093007/091aff50-e0f2-4131-bc6e-2250d663a053">

_Though we very strongly recommend using VSCode, if you are still interested in working on Eclipse, you can follow this [documentation](https://docs.google.com/document/d/1ExUKTTV19OBbYqaDmnz4TfDlbrRORy0fgo3UO3nDGRY/edit#heading=h.60uzkqq015s9) to install Eclipse, and this [documentation](https://docs.google.com/document/d/1Rct96DQjMLrUIhkRURIt6broCXyOmsjJI374K3AvSoU/edit?usp=sharing) to setup JUnit in Eclipse_

## Submitting

There is no submission for this assignment.

## Java Refresher Resources

Text-Based
- Benjamin Evans and David Flanagan: Java in a Nutshell, 7th edition, O'Reilly, 2018 [online](https://www.oreilly.com/library/view/java-in-a/9781492037248/){:target="_blank"} (this is a great reference book, but if you have another, that's OK)
- [http://docs.oracle.com/javase/tutorial/Links](http://docs.oracle.com/javase/tutorial/Links){:target="_blank"}  (text tutorial)
- [http://www.javaworld.com/article/2075202/core-java/object-oriented-language-basics-part-1.html](http://www.javaworld.com/article/2075202/core-java/object-oriented-language-basics-part-1.html){:target="_blank"} (text tutorial)
