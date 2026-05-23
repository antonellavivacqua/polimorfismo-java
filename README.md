# Gestión de Vehículos - Práctica de Polimorfismo en Java

Este repositorio contiene un proyecto desarrollado en Java enfocado en la implementación de la Programación Orientada a Objetos (POO), con énfasis en la herencia, la sobrescritura de métodos y el comportamiento polimórfico mediante.

El objetivo del sistema es simular la administración de un garaje que contiene diferentes tipos de transportes.

## Estructura del Proyecto

* **`Vehiculo.java`**: Clase base (padre) que define las propiedades comunes (marca, modelo, año y estado de encendido), además de contener el punto de entrada de la aplicación (`main`).
* **`Auto.java`**: Clase derivada que extiende de `Vehiculo`, adaptando el comportamiento del encendido para este tipo específico de transporte.
* **`Moto.java`**: Clase derivada que implementa la lógica particular de arranque.
* **`Bici.java`**: Clase derivada que sobrescribe el método base para reflejar la acción correspondiente.

## Conceptos Aplicados

* **Herencia**: Reutilización de código mediante la extensión de una superclase hacia clases específicas, evitando la redundancia de atributos.
* **Polimorfismo**: Capacidad de procesar objetos de distintas clases derivadas de forma uniforme a través de una referencia de la superclase.
* **Sobrescritura de Métodos (`@Override`)**: Modificación del comportamiento del método `encender()` y `toString()` en cada clase hija para responder de manera personalizada.
* **Colecciones Dinámicas (`ArrayList`)**: Uso de la API de colecciones de Java para almacenar de forma indexada elementos dentro de una estructura unificada (`Garage`).

## Cómo Ejecutar el Proyecto

Para compilar y correr esta práctica de forma local, se necesita tener instalado el Java Development Kit (JDK):

1. Clona o descarga los archivos de este directorio en tu entorno local.
2. Compila las clases desde la terminal dentro de la carpeta del proyecto:
   ```bash
   javac *.java
