![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Actividad Semana 1 – Desarrollo Orientado a Objetos II

## 👤 Autor del proyecto
- **Nombre completo:** Nicolas Salgado
- **Sección:** [2026_203_OL_PRY2203_24650289_PCT]
- **Carrera:** ANALISTA PROGRAMADOR COMPUTACIONAL
- **Sede:** Antonio Varas

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la actividad sumativa de la Semana 1 de la asignatura Desarrollo Orientado a Objetos II. Simula el sistema de asignación de repartidores de **SpeedFast**, empresa de reparto a domicilio, aplicando **herencia**, **sobrescritura de métodos (@Override)** y **sobrecarga de métodos (overload)**.

Se creó la clase base `Pedido`, con los atributos comunes a todo pedido (`idPedido`, `direccionEntrega`, `tipoPedido`) y el método genérico `asignarRepartidor()`. A partir de ella se derivan tres subclases —`PedidoComida`, `PedidoEncomienda` y `PedidoExpress`— cada una con su propio atributo distintivo y su propia lógica de validación, sobrescribiendo tanto la versión sin parámetros como la versión sobrecargada `asignarRepartidor(String nombreRepartidor)`.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── ui/      # Clase principal con el método main
└── model/   # Clases de dominio: Pedido, PedidoComida, PedidoEncomienda, PedidoExpress
```

## 🧩 Paquetes y clases implementadas

| Clase | Paquete | Descripción |
|---|---|---|
| `Pedido` | `model` | Clase base: atributos comunes, getters/setters, y `asignarRepartidor()` genérico (sobrescrito y sobrecargado) |
| `PedidoComida` | `model` | Extiende `Pedido`. Agrega `mochilaTermica`; valida que el repartidor cuente con ella |
| `PedidoEncomienda` | `model` | Extiende `Pedido`. Agrega `peso` y `embalajeValido`; valida ambos antes de asignar |
| `PedidoExpress` | `model` | Extiende `Pedido`. Agrega `disponibilidadInmediata` (y `distanciaKm`); busca al repartidor más cercano disponible |
| `Main` | `ui` | Ejecuta el programa: instancia un objeto de cada subclase (tipado como `Pedido`) y llama ambas versiones de `asignarRepartidor()` para evidenciar el polimorfismo |

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/nicosalgadogit/SpeedFast.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Ejecuta el archivo `Main.java` desde el paquete `ui`.

4. Por consola se mostrará, para cada tipo de pedido:
    - El mensaje genérico de búsqueda de repartidor (sobrescrito según el tipo).
    - El mensaje con el nombre del repartidor asignado y la validación específica de ese pedido (mochila térmica / peso y embalaje / cercanía y disponibilidad).

---

**Repositorio GitHub:** \[https://github.com/nicosalgadogit/SpeedFast.git]
**Fecha de entrega:** \[30-08-2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Desarrollo Orientado a Objetos II