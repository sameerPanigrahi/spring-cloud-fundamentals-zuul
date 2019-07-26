# spring-cloud-fundamentals-zuul
Demo on spring cloud intelligent routin using spring cloud netflix zuul project


This project consists of 4 nested projects
1. **discovery-service** which uses Spring Cloud Eureka. All the services will query this service to locate other services
2. **gateway-service** which uses Spring Cloud Netflix Zuul and is the single point of contact for all services to route to other services.
3. **hello-service** and **goodbye-service** which are 2 sample services.

To test the demo, fire the services in the above sequence.
The gateway-service is then called with */hello-service* and */goodbye-service* in the browser.
The *gateway-service* then queries the *discovery-service* to locate the *hello-service* and *goodbye-service* and routes the request
to these services respectively. It thus basically acts as proxy for these services.
