Entendamos qué acaba de suceder acá: tal como estaba el código en el editor, las linternas y velas no eran polimórficas: no compartían una interfaz porque unas entendían `iluminar!` y las otras `alumbrar!`. 

Esto significaba que cuando `VisitaARuby` enviaba el mensaje `iluminar!`, **el programa se ejecutaba, pero fallaba**, porque `iluminar!` no formaba parte de la interfaz de la `Vela`. 

En otras palabras: si en Ruby un objeto no cumple la interfaz que se espera de éste, nuestro código recién fallará cuando enviemos el mensaje no implementado. Por eso decímos que Ruby valida que las cosas tengan el tipo correcto dinámicamente (durante la ejecución del programa), o, en palabras más cortas, que **tiene tipado dinámico**.

¿Y en Java?