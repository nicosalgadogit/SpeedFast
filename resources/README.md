![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Actividad Semana 2 – Desarrollo Orientado a Objetos II

## 👤 Autor del proyecto
- **Nombre completo:** Nicolas Salgado
- **Sección:** [2026_203_OL_PRY2203_24650289_PCT]
- **Carrera:** ANALISTA PROGRAMADOR COMPUTACIONAL
- **Sede:** Antonio Varas

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la actividad sumativa de la Semana 2 de la asignatura Desarrollo Orientado a Objetos II. Es la continuación del sistema de asignación de repartidores de **SpeedFast**, incorporando esta semana **abstracción**: la clase `Pedido` pasa a ser una **clase abstracta**, definiendo el contrato común que las subclases deben cumplir.

`Pedido` ahora contiene los atributos comunes (`idPedido`, `direccionEntrega`, `distanciaKm`), el método implementado `mostrarResumen()` (que imprime los datos básicos del pedido) y el método abstracto `calcularTiempoEntrega()`, cuya lógica varía en cada subclase. `PedidoComida`, `PedidoEncomienda` y `PedidoExpress` extienden `Pedido` e implementan `calcularTiempoEntrega()` con una fórmula propia según su tipo de servicio.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── ui/      # Clase principal con el método main
└── model/   # Clases de dominio: Pedido (abstracta), PedidoComida, PedidoEncomienda, PedidoExpress
```

## 🧩 Paquetes y clases implementadas

| Clase | Paquete | Descripción |
|---|---|---|
| `Pedido` | `model` | Clase **abstracta**: atributos comunes, getters/setters, `mostrarResumen()` implementado y `calcularTiempoEntrega()` abstracto |
| `PedidoComida` | `model` | Extiende `Pedido`. Implementa `calcularTiempoEntrega()`: 15 min + 2 min por kilómetro |
| `PedidoEncomienda` | `model` | Extiende `Pedido`. Implementa `calcularTiempoEntrega()`: 20 min + 1.5 min por kilómetro (ajustado a entero) |
| `PedidoExpress` | `model` | Extiende `Pedido`. Implementa `calcularTiempoEntrega()`: 10 min base, +5 min extra si supera los 5 km |
| `Main` | `ui` | Ejecuta el programa: instancia un objeto de cada subclase (tipado como `Pedido`), llama `mostrarResumen()` y muestra el tiempo estimado calculado por cada una |

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/nicosalgadogit/SpeedFast.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Ejecuta el archivo `Main.java` desde el paquete `ui`.

4. Por consola se mostrará, para cada tipo de pedido:
   - El resumen básico del pedido (`mostrarResumen()`).
   - El tiempo estimado de entrega, calculado con la fórmula propia de cada tipo (Comida / Encomienda / Compra Express).

---

**Repositorio GitHub:** \[https://github.com/nicosalgadogit/SpeedFast.git]
**Fecha de entrega:** \[completar fecha de entrega]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Desarrollo Orientado a Objetos II