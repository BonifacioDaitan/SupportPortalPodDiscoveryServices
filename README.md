# SupportPortal - PodDiscoveryServices

In this repository you will find a basic implementation of the new pod discovery service API for Support Portal.

The code present in here was mostly built using [Canon](https://github.com/symphonyoss/canon), using the [Canon-Example](https://github.com/symphonyoss/canon-example) as a quickstart to make it run.

To run this project use the following steps:

- Clone the repository in your machine;
- Run `mvn clean package` to validate current base;
- Run `java -cp "discoveryservice-server/target/docker/gcr.io/sp-pod-service/podservice-server/0.0.1-SNAPSHOT/build/maven/*" org.symphonyoss.s2.supportportal.poddiscoveryservice.server.PodDiscoveryServiceServer`

> Node to change the 0.0.1-SNAPSHOT version according to the current pom.xml version of this repository


After running the above steps, call this endpoint to see if you get the mocked data result: http://127.0.0.1:8080/podservice/v2/pods