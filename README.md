# Challenge ONE G3 | Java - Sprint 1

## Conversor de moneda

Este primer reto de la ruta Java, ONE - Oracle Next Education, está dirigido a la implementación de un conversor de divisas, utilizando la librería javax.swing, así como a ejecutar los conocimientos adquiridos en los cursos de Alura Latam: primeros pasos; introducción a la orientación a objetos; comprensión de herencia e interfaces; y, comprensión de excepciones.

Con base en lo anterior, se utilizó el modelo venezolano, donde las monedas relevantes son el dólar estadounidense, el euro y algunas criptomonedas con mayor o menor exposición. Asimismo, dicho mercado está influenciado por varios tipos de cambio oficiales e informales, entre los que se encuentran algunos como:

| Oficial | Informal |
| --- | --- |
| Dólar BCV  (sicad2) | DólarToday (dolartoday) |
| Dólar Bitcoin (sicad1) | Cúcuta (efectivo_cucuta) |
| Petro (PTR) (cencoex) | - |

> - BCV: Banco Central de Venezuela;
> - SICAD: Sistema Complementario de Administración de Divisas;
> - PTR: Petro, criptomoneda del estado venezolano;
> - CENCOEX: Centro Nacional de Comercio Exterior.

En cuanto a los tipos de cambio, se importan de la [API DolarToday](https://s3.amazonaws.com/dolartoday/data.json), actualizándose cada 10 minutos. Y, el patrón de diseño es MVC (Modelo-Vista-Controlador) , obteniendo las siguientes clases:

| Diseño | Clase |
| --- | --- |
| Modelo | Tasa.java |
| Vista | Interfaz.java |
| Controlador | Principal.java, ConsumoAPI.java |

### Funcionalidades

- Menú principal;
- Entrada de cantidad a convertir;
- Validación del campo de entrada;
- Consumo de API;
- Procesamiento de la información de la API; 
- Selección del tipo de conversión;
- Cálculo de la conversión elegida;
- Despliegue de los resultados;
- Mensajes de advertencia, error e información;
- Operación simple.

### Ejemplo de Utilización

1. Seleccione el tipo de conversión:

![fig. 1](/img/01.png)

2. Visualizará un mensaje explicativo del funcionamiento del programa:

![fig. 2](/img/02.png)

3. Introduzca la cantidad a convertir:

![fig. 3](/img/03.png)

4. Elija la divisa a cotizar:

![fig. 4](/img/04.png)

5. Visualización de los distintos tipos de cotización:

![fig. 5](/img/05.png)

6. Para salir del programa, basta con pulsar el botón de cancelar hasta que desaparezca la venta del menú principal:

![fig. 6.1](/img/06.png)

![fig. 6.2](/img/07.png)
