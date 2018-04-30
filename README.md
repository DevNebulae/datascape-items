# DataScape items
An example microservice of the current approach I would take at DataScape.



## Introduction
DataScape was a data science project conducted by 6 students of Fontys
Hogescholen. The goal of this project was to create a data sandbox which could
be used internally for machine learning projects. The biggest problem with the
last approach was that the data was stored in a SQL database, which meant that
scaling would be an issue, due to the database being monolithic.

The goal of this repository is to build POC of what my current approach would be
and what tech-stack I would use to store- and collect data and how I would scale
the application in the long term. 



## Setup

### Docker
To set up Docker, simply run the `docker-compose up` or `docker-compose up -d`
command if you do not want a log of what is currently happening. Be aware that
it takes a while for the Cassandra node to start up.

### Spring Boot

Run the project in IntelliJ IDEA or build a `.war` archive and deploy it to 
a Tomcat instance.
