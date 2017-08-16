De todas formas, no todos los tipos nos son útiles. Por ejemplo, si tipamos a un velociraptor de la siguiente forma...

```java
Dinosaurio riley = new Velociraptor();
```

...no podremos enviarle el mensaje `salirACazar`, dado que fallará estáticamente al no pertenecer ese mensaje a la interfaz: 


```
// no compila
jason.salirACazar();
```

En cambio, si lo tipamos como `Velociraptor` sí podemos hacerlo: 


```java
Velociraptor riley = new Velociraptor();
riley.salirACazar();
```

Pero claro, si tipamos a riley de esta forma, sólo podrá referenciar a velociraptores, por lo que si luego hacemos...

```java
riley = new Tiranosaurio();
```

...fallará estáticamente. 

Entonces, ¿cuál es la forma correcta de tipar? ¡Depende de que mensajes necesites enviar! 



