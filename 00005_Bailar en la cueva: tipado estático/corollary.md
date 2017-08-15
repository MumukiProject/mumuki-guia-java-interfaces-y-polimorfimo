¿Y ahora qué sucedió? Las velas y linternas tampoco eran polímorficas, pero esta vez pasó algo diferente: **el programa no se pudo ejecutar**. De hecho, producía un error de compilación: 

```
Vela is not abstract and does not override abstract method iluminar() in Iluminador class Vela implements Iluminador
```

Esto significa que daba igual si enviabamos el mensaje `iluminar()` a una vela: Java es capaz de detectar los métodos faltantes tan sólo inspeccionando los `implements`. En otras palabras: si en Ruby un objeto no cumple la interfaz que se espera de éste, nuestro código recién **fallará cuando enviemos el mensaje** no implementado. Por eso decímos que Ruby valida que las cosas tengan el tipo correcto dinámicamente (durante la ejecución del programa), o, en palabras más cortas, que **tiene tipado dinámico**.

¿Y en Java?