# rest-jdbc
Demo project for Spring Data JDBC

### Standalone app with embedded Tomcat server

You can build the project using Maven:

```bash
mvn clean package
```

To run the app using the embedded Tomcat server you can run this command:

```bash
mvn spring-boot:run
```

You can access the API docs using `curl`:

```bash
curl http://localhost:8080/v3/api-docs  
```

You can access the `customers` API endpoint using `curl`:

```bash
curl -w'\n' localhost:8080/customers
```

You can add a couple of customers using `curl` as well:

```bash
curl -w'\n' localhost:8080/customers -H 'Content-Type: application/json' -d '{"firstName":"E.F.","lastName":"Codd"}'
curl -w'\n' localhost:8080/customers -H 'Content-Type: application/json' -d '{"firstName":"C.J.","lastName":"Date"}'
```
