¡Analicemos una vez más las declaraciones de tipos en un programa polimórfico! 

Antes de introducir las interfaces, si en Java declarabamos una variable que referenciara una instancia de `Triceratops`, lo hacíamos de la siguiente forma: 

```java
Triceratops billy = new Triceratops();
```

Pero, ahora que conocemos las interfaces, sabemos que si `Triceratops` implementa `Dinasaurio`, también podríamos hacer:

```java
Dinosaurio billy = new Triceratops();
```

Esto significa que una variable puede ser tipada de múltiples formas, o en otras palabras, que un objeto tiene más de un tipo. 
> Veamos si se entiende: dado el siguiente modelo, ¿de qué formas podemos tipar a las siguiente variables?



