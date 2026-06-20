# Sistema de Cafetería "El Negrito"

## Descripción General

Este proyecto implementa un sistema de pedidos para una cafetería utilizando el patrón de diseño **Decorator** en Java.

El sistema permite que un cliente seleccione una bebida base, elija su tamaño y agregue complementos personalizados. Además, es posible registrar múltiples bebidas dentro de un mismo pedido y calcular el costo total acumulado.

---

# Funcionalidades Implementadas

## Selección de Bebidas

El usuario puede seleccionar una de las siguientes bebidas:

- Expreso
- Descafeinado
- Batido
- Tostado Negro

Cada bebida puede elegirse en tres tamaños:

- N (Normal)
- M (Mediano)
- G (Grande)

Cada tamaño posee un precio diferente.

---

## Selección de Complementos

Después de seleccionar una bebida, el usuario puede agregar complementos:

- Leche
- Mocca
- Soya
- Crema

Cada complemento puede seleccionarse en los tamaños:

- N (Normal)
- M (Mediano)
- G (Grande)

El precio del complemento varía según el tamaño elegido.

---

## Múltiples Bebidas por Pedido

El sistema permite:

1. Crear una bebida.
2. Agregar complementos.
3. Finalizar la bebida.
4. Agregar una nueva bebida al mismo pedido.
5. Mostrar un resumen completo del pedido.

---

# Implementación de la Clase Main

La clase `Main` controla toda la interacción con el usuario mediante menús.

## Flujo del Sistema

1. Mostrar menú de bebidas.
2. Solicitar el tamaño de la bebida.
3. Crear la bebida seleccionada.
4. Mostrar menú de complementos.
5. Permitir agregar múltiples complementos.
6. Calcular el costo de la bebida.
7. Guardar la descripción y el costo de la bebida.
8. Preguntar si desea agregar otra bebida.
9. Mostrar el resumen final del pedido.

---

# Patrón Decorator

El proyecto utiliza el patrón de diseño **Decorator** para agregar funcionalidades a una bebida sin modificar la estructura de las clases originales.

## Ejemplo

Una bebida base:

```
Expreso G
```

Puede convertirse en:

```
Expreso G + Leche M + Mocca G + Soya N
```

Cada complemento agrega descripción y costo de manera dinámica.

---

# Estructura del Proyecto

```text
src
│
├── Bebidas
│   ├── Cafe.java
│   ├── Expreso.java
│   ├── Descafeinado.java
│   ├── Batido.java
│   └── TostadoNegro.java
│
├── Complementos
│   ├── Complemento.java
│   ├── Leche.java
│   ├── Mocca.java
│   ├── Soya.java
│   └── Crema.java
│
└── Main.java
```

---

# Descripción de las Clases

## Cafe

Clase abstracta que representa una bebida base.

### Responsabilidades

- Mantener el tamaño de la bebida.
- Definir los métodos:
  - `getDescripcion()`
  - `getCosto()`

---

## Expreso, Descafeinado, Batido y TostadoNegro

Representan las bebidas concretas.

### Responsabilidades

- Definir la descripción.
- Definir el costo según el tamaño seleccionado.

---

## Complemento

Clase abstracta que hereda de `Cafe`.

### Responsabilidades

- Mantener una referencia a la bebida decorada.
- Servir como base para los complementos.

---

## Leche, Mocca, Soya y Crema

Decoradores concretos.

### Responsabilidades

- Agregar descripción al pedido.
- Incrementar el costo según el tamaño del complemento.

---

## Main

Clase principal del sistema.

### Responsabilidades

- Mostrar menús.
- Gestionar la interacción con el usuario.
- Crear bebidas y complementos.
- Registrar múltiples bebidas.
- Mostrar el resumen final del pedido.

---

# Ejemplo de Ejecución

```text
Seleccione una bebida:
1. Expreso

Seleccione tamaño:
3. Grande

Complementos:
1. Leche

Tamaño:
2. Mediano

Complementos:
2. Mocca

Tamaño:
3. Grande

Complementos:
5. Finalizar pedido

¿Desea agregar otra bebida?
2. No
```

Resultado:

```text
===== RESUMEN DEL PEDIDO =====

- Cafe Expreso G, Leche M, Mocca G

Costo Total: $ 2.60
```

---

# Autor

Arellys Villena

000292454
