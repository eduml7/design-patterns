# design-patterns

Ejemplos en Java de patrones de diseño GOF

## Creaccionales

Definen como se crean los objetos

### Singleton

Se genera una única instancia compartida por todo el que quiera usar el recurso. Útil para abrir conexiones con bases de datos por ejemplo, asi solo hay una y no se satura el motor de BD.

### Factory

La capacidad de creación de ciertos objetos se cede a una clase. Recibe un parámetro de tipo, y segun ese tipo instancia uno u otro objeto.

### Abstract factory

Una interfaz donde se define la creación de grupos de objetos relacionados. Podemos tener una factoria de creación de mamiferos donde se define de forma abstracta la creacion de extremidades, tronco y cabeza. Tendremos N implementaciones de esta factoria donde de forma concreta se dirá como se crean estas partes para gato, perro, humano...

### Prototype

Permite clonar objetos basados en un prototipo, para copiar sus caracteristicas.

### Builder

Dos entidades, __builder__ que sabe como construir las partes del todo y __director__ que va llamando a las diferentes partes del builder, para al final obtener el objeto construido.

## Estructurales   

Define como se componen las diferentes partes de un todo

### Adapter

El cliente quiere una entidad y el servidor provee otra. Se crea una clase intermedia que adapta la 2 a la 1 para que sea lo que se espera.

### Facade

Una clase que se encarga de aglutinar la gestión de ciertos recursos que van unidos entre si. Una interfaz por encima de una lista de interfaces para facilitar su uso. 

### Composite

Jerarquizar objetos en forma de arbol, los objetos del mismo nivel se ponen en el mismo nivel de jerarquia

### Decorator

Tienes una clase base, y pasando esta clase base por diferentes constructores de clases que la van aportando cierta nueva información, consigues una clase final con toda la informaciónd e las diferentes clases.

## Comportamiento

Como interactuan los objetos entre ellos

### Command

Se encapsula en metodos genericos comportamiento, asi que todos los objetos que extienden esa clase se comportan igual, por ejemplo execute()

### Observer

Se define un objeto objetivo, y varios observandole. Cuando este objeto cambia el resto son notificados.  