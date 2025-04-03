# Ejercicio 1.2 Participación en proyectos 
Al revisar el siguiente diseño inicial (Figura 1), se decidió realizar un cambio para evitar lo que se consideraba un mal olor. El diseño modificado se muestra en la Figura 2. Indique qué tipo de cambio se realizó y si lo considera apropiado. Justifique su respuesta.
##### Bad Smell: Feature Envy
La clase proyecto conoce a los participantes pero los participantes no conocen sus proyectos. El cliente debería consultar a la clase `Proyecto`
##### Refactoring: Move Method

##### Bad Smell: Violación del encapsulamiento
La variable `id` de `Persona` es pública
##### Refactoring: Encapsulate Field