## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Steps to connect JDBC

1. First `Ctrl + Shift + P` to open command shift then Create Java Project -> No build tools.
2. Then right click on src folder then click `New Java File` then create a java file to write your code.
3. Finally at the bottom left corner of vscode expand `JAVA PROJECTS` then add the `mysql-connector-j-8.3.0.jar` file to that.
4. Atlast open up the options of code runner and select `run java` to execute the file. Congratulations! You have successfully established the JDBC Connection. 😁