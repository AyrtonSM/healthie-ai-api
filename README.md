# Healthie

Healthie api is a service to help you diagnose a disease 
based on a set of symptoms, it communicates with an external service 
that uses AI to determine what kind of disease you might be facing.

In order to run you have to make sure you have Docker installed <br>

Build the image:

`$ docker build -t healthie-server-api:latest`

Run it by using: 

`$ docker run -p 8080:8080 healthie-server-api:latest`

Healthie API should be running now :) 
