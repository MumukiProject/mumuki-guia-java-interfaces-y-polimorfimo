¡Qué problema! Por más que le demos vueltas y vueltas, no encontraremos un tipo para `arma`:

* si la tipamos como `Espada arma` sólo podremos crear guerreros con espadas;
* y si la tipamos como `Escudo arma`, sólo podrán usar escudos. 


Pero en Ruby la cosa era más simple, ¿o no? :confused:. Mientras que el `@arma` fuera un objeto que entendiera los mensajes `poder_ofensivo` y `poder_defensivo`, alcanzaba. Dicho de otra forma, cualquier objeto que exhibiera la _interfaz_ de un arma nos era útil.  

¿No podríamos valernos de esta idea en Java?

