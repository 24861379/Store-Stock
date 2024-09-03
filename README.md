# Store-Stock
Este programa es un gestor en el que se puede administrar el inventario con productos que tienen fecha de caducidad y productos que cuentan con garantías. Este programa incluye dos pilares de la programación orientada a objetos (POO): la herencia y el encapsulamiento.

#Funcionalidades implementadas
Con el uso de un ArrayList al que se le pasa la clase padre (Producto), se crearon los siguientes métodos:
- **Agregar productos**: En este método se pasa como parámetro la clase padre y una variable llamada Stock. Lo que se busca es que, con el método add, se agreguen todos los valores de cada producto.
- **Modificar el produto**: En este método se pasa como parámetro el ID del producto para buscar el producto al que se le quieren modificar ciertos valores. En este caso, se le pregunta al usuario qué quiere cambiar: el precio o el inventario.
- **Eliminar producto**: Este método tiene un parámetro que es el nombre, el cual se compara con el nombre del producto. Si son iguales, se asigna a un ArrayList secundario para luego eliminar el producto y sus demás valores.
- **Buscar producto**: Este método tiene un parámetro que es el nombre, el cual se compara con el nombre del producto. Si son iguales, se muestra toda la información del producto, como el ID, el nombre, el precio y la cantidad.
- **Informacion**: Con este método usamos un for-each con el que podemos obtener el método de información de cada producto.
- 
#Cómo funciona
Al ejecutar el programa en la consola, aparecerá un menú de 7 opciones en el que el usuario puede agregar productos perecederos y no perecederos, modificar productos, eliminar productos, buscar productos, generar productos y salir del programa.

