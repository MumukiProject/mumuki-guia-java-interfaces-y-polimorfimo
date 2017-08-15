¿Y ahora qué sucedió? Las velas y linternas tampoco eran polímorficas, pero esta vez pasó algo diferente: **el programa no se pudo ejecutar**. De hecho, producía un error de compilación: 

```
Vela is not abstract and does not override abstract method iluminar() in Iluminador class Vela implements Iluminador
```

Esto significa que daba igual si enviabamos el mensaje `iluminar()` a una vela: Java es capaz de detectar los métodos faltantes tan sólo inspeccionando los `implements`. Por eso decímos que Java valida que nuestros objetos tengan el tipo correcto estáticamente (antes la ejecución del programa), o, en palabras más cortas, que **tiene tipado estático**.

¿Y en Java?