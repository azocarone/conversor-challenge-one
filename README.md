# Challenge ONE G3 | Java - Sprint 1

## Conversor de moneda

Este primer reto de la ruta *Java*, **ONE - Oracle Next Education**, está dirigido a la implementación de un conversor de divisas, utilizando la librería *javax.swing*, así como a ejecutar los conocimientos adquiridos en los cursos de **Alura Latam**: *primeros pasos; introducción a la orientación a objetos; comprensión de herencia e interfaces; y, comprensión de excepciones*.

Con base en lo anterior, se utilizó el modelo venezolano, donde las monedas relevantes son el dólar estadounidense, el euro y algunas criptomonedas con mayor o menor exposición. Asimismo, dicho mercado está influenciado por varios tipos de cambio oficiales e informales, entre los que se encuentran algunos como:

| Oficial | Informal |
| :-----: | :------: |
| Dólar BCV  (*sicad2*) | DólarToday (*dolartoday*) |
| Dólar Bitcoin (*sicad1*) | Cúcuta (*efectivo_cucuta*) |
| Petro (PTR) (*cencoex*) | - |

> - **BCV**: Banco Central de Venezuela;
> - **SICAD**: Sistema Complementario de Administración de Divisas;
> - **PTR**: Petro, criptomoneda del estado venezolano;
> - **CENCOEX**: Centro Nacional de Comercio Exterior.

En cuanto a los tipos de cambio, se importan de la [API DolarToday](https://s3.amazonaws.com/dolartoday/data.json), actualizándose cada 10 minutos. Y, el patrón de diseño es *MVC* (Modelo-Vista-Controlador) , obteniendo las siguientes clases:

| Diseño | Clase |
| :----: | ----- |
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

<p align="center">
    <kbd>
        <img src="/img/01.png">
    </kbd>
</p>

2. Visualizará un mensaje explicativo del funcionamiento del programa:

<p align="center">
    <kbd>
        <img src="/img/02.png">
    </kbd>
</p>

3. Introduzca la cantidad a convertir:

<p align="center">
    <kbd>
        <img src="/img/03.png">
    </kbd>
</p>

4. Elija la divisa a cotizar:

<p align="center">
    <kbd>
        <img src="/img/04.png">
    </kbd>
</p>

5. Visualización de los distintos tipos de cotización:

<p align="center">
    <kbd>
        <img src="/img/05.png">
    </kbd>
</p>

6. Para salir del programa, basta con pulsar el botón de cancelar hasta que desaparezca la venta del menú principal:

<p align="center">
    <kbd>
        <img src="/img/06.png">
    </kbd>
    <kbd>
        <img src="/img/07.png">
    </kbd>
</p>

<img width="32" heigth="32" src="/img/azocarone.svg">
© 2022 José AZÓCAR (azocarONE)
<img heigth="32" src="/img/logo_oracleAlura-es.svg">


