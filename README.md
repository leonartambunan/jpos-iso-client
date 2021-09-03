# JSON-to-ISO8583
leonar.tambunan@gmail.com

## Deployment Scenario
```
                    /-------------------\
/---------\         |                   |       /----------------\      /-------------------\
|HTTP-json| ----->  | json-to-iso8583   |  ---> | JPOS as Client | ---> | HOST as Server    |
\---------/         |   springboot      |       \----------------/      \-------------------/
                    \-------------------/

```

## How to build
```mvn clean package```

## How to run
```java -Xms126m -Xmx512m -jar target/json-iso-1.0.0.jar```