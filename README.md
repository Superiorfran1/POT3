README

<h1>📦 FernanPop – Plataforma de compra-venta en Java </h1>
<br>

📖 Descripción del proyecto
FernanPop es una aplicación de consola desarrollada en Java que simula una plataforma de compra-venta entre usuarios de un centro educativo.
El programa permite a los usuarios poner productos a la venta, comprar productos de otros usuarios, gestionar pedidos y mantener un histórico de compras y ventas con posibilidad de valoración.

<br>

▶️ Ejecución del programa
- Abrir la carpeta "POT3", y luego "FernanPop"
- Ejecutar el archivo Start.bat
- Introducir el email y la clave de uno de los usuarios disponibles:
    1. Email: carlos.barroso@fernando3martos.com, Clave: 1234
    2. Email: fcanmae0512@g.educaaand.es", Clave: 4321

- Navegar por el menú mediante las opciones numéricas

<br>

⚙️ Requisitos del sistema
- Java JDK 8 o superior

<br>

🔑 Funcionalidades principales
- Inicio de sesión mediante email y clave
- Visualización y modificación del perfil del usuario
- Alta de productos en venta (máximo 2 por usuario)
- Visualización de productos disponibles
- Compra de productos de otros usuarios
- Gestión y cierre de pedidos
- Histórico de compras y ventas
- Valoración de productos adquiridos

<br>

🗂️ Estructura del proyecto
El proyecto está organizado en distintos paquetes para facilitar su mantenimiento y comprensión:

src/ <br>
 ├── view/ <br>
 │ㅤㅤ└── Main.java <br>
 │ㅤㅤㅤㅤ→ Clase principal que controla el flujo de la aplicación <br>
 │ <br>
 ├── models/ <br>
 │ㅤㅤ├── Usuario.java <br>
 │ㅤㅤ│ㅤㅤ→ Gestiona los datos del usuario, productos, pedidos y ventas <br>
 │ㅤㅤ│ <br>
 │ㅤㅤ├── Productos.java <br>
 │ㅤㅤ│ㅤㅤ→ Representa los productos puestos a la venta <br>
 │ㅤㅤ│ <br>
 │ㅤㅤ└── Venta.java <br>
 │ㅤㅤㅤㅤㅤ→ Representa una compra o venta realizada <br>
 │ <br>
 └── utils/ <br>
 ㅤㅤㅤ├── Menu.java <br>
 ㅤㅤㅤ│ㅤㅤ→ Contiene los textos de los menús de la aplicación <br>
 ㅤㅤㅤ│ <br>
 ㅤㅤㅤ└── Utils.java <br>
 ㅤㅤㅤㅤㅤ→ Métodos auxiliares (limpiar pantalla, pausas, etc.) <br>

<br>

🧩 Descripción de las clases principales
- 👤 Usuario, representa a un usuario de la plataforma.
    Responsabilidades:
    · Almacenar datos personales (nombre, email y clave)
    · Gestionar productos en venta (máx. 2)
    · Gestionar pedidos pendientes
    · Almacenar una compra y una venta en el histórico
    · Permitir modificar los datos personales

- 🛒 Productos, representa un producto puesto a la venta por un usuario.
    Atributos principales:
    · Identificador del producto
    · Nombre
    · Descripción
    · Precio

- 💰 Venta, representa una transacción de compra-venta entre dos usuarios.
    Información almacenada:
    · Precio final
    · Email del comprador
    · Email del vendedor
    · Puntuación del producto
    · Comentario del comprador

<br>

UML:
![wmremove-transformed](https://github.com/user-attachments/assets/cdb91284-52ee-4cb9-b974-25094777625f)

<br>

🎯 Objetivos del proyecto
- Aplicar los principios de la Programación Orientada a Objetos
- Diseñar y utilizar clases, atributos, métodos y constructores
- Gestionar la interacción entre objetos (Usuario, Producto y Venta)
- Implementar un menú interactivo en consola
- Controlar límites del sistema (máximo de productos, compras y ventas)

<br>

👨‍💻 Autores
- Nombres: Francisco Cantero Maestro y Mihai Iosif Koritar
- Asignatura: Programación
- Unidad: Tema 3 – Programación Orientada a Objetos
- Curso: 1º DAM
- Evaluación: 1ª Evaluación
