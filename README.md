# spring5webapp
This repository is for an example application
# Notes
## H2 Console
URL: http://localhost:8080/h2-console/
JDBC Property: jdbc:h2:mem:testdb

## JPA 2.0
Java Community Process as JSR 317
Approved in December of 2009
Added support for embedded objects and ordered lists
Added criteria query API
Added SQL Hints
Added Validation
## JPA 2.1
Java Community Process as JSR 338
Approved in December of 2013
Added custom type converters
Criteria Update/Delete for bulk updates & deletes
Schema Generation
Queries against stored procedures
## Spring Data Repositories
1. Provides an Implementation of the Repository Pattern.
2. A Repository has methods for retrieving domain objects should
delegate to a specialized Repository object such that alternative
storage implementations may be interchanged.It allows you to easily 
substitute the persistence layer.

## Spring Data JPA
1.Spring Data JPA is part of Spring Data projects. It 
Uses Hibernate for persistence to supported RDBS systems.
2.You extend a Java Repository Interface. Spring Data JPA provides 
the implementation at run time. No SQL Required. 