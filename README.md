# cricket_worldcup_score_board_jbdc
Cricket World Cup Score Board JDBC
Overview
Cricket World Cup Score Board JDBC is a Java application that allows users to manage and view cricket match scores for the World Cup. This application uses JDBC (Java Database Connectivity) to interact with a database, enabling seamless storage and retrieval of match information.

Prerequisites
To run this application, you need the following:

Java Development Kit (JDK) installed on your system
MySQL database server installed and running
MySQL Connector/J library for JDBC connectivity
Setup
Database Configuration:

Create a MySQL database named cricket_worldcup.
Run the SQL script provided in database_setup.sql to create the necessary tables and populate initial data.
JDBC Configuration:

Download and add the MySQL Connector/J JAR file to your project's classpath.
Build and Run:

Compile the Java files using the following command:
Copy code
javac *.java
Run the application:
css
Copy code
java Main
Usage
Adding a New Match:

Select option 1 to add a new match to the database.
Enter the match details as prompted.
Viewing Match Scores:

Select option 2 to view match scores.
Enter the match ID to display the scorecard for that match.
Exiting the Application:

Select option 3 to exit the application.
