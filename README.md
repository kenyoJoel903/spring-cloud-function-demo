# Spring Cloud Function example

## Exposed Functions as Endpoints
- *Supplier* - `/sayHelloSupplier` - returns an output

```
curl -H 'Content-Type: text/plain' http://localhost:8080/supply
Hello cloud function⏎                                                                                                      

```

- *Consumer* - `/sayHelloConsumer` - expects an input

```
curl -H 'Content-Type: text/plain' http://localhost:8080/sayHelloConsumer -d 'Juan'
```

- *Function* - `/function` - expects an input and output
```
curl -H 'Content-Type: text/plain' http://localhost:8080/toUpperCase -d 'hola, es una prueba'
HOLA, ES UNA PRUEBA⏎    
```

- *Function* - `/hello` - expects an input and output
```                                                                                        
curl -H 'Content-Type: text/plain' http://localhost:8080/hello -d 'Juan'
Hello Juan⏎  
```