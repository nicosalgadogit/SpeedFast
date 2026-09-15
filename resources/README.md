![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Actividad Semana 5 – Desarrollo Orientado a Objetos II

## 👤 Autor del proyecto
- **Nombre completo:** Nicolas Salgado
- **Sección:** [2026_203_OL_PRY2203_24650289_PCT]
- **Carrera:** ANALISTA PROGRAMADOR COMPUTACIONAL
- **Sede:** Antonio Varas

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la actividad formativa de la Semana 5 de la asignatura Desarrollo Orientado a Objetos II: **sincronización avanzada** entre hilos que comparten un mismo recurso. Se simula una zona de carga a la que varios repartidores acceden simultáneamente para retirar pedidos, garantizando que **nunca dos repartidores tomen el mismo pedido**.

`ZonaDeCarga` es el recurso compartido: sus métodos `agregarPedido()` y `retirarPedido()` están marcados `synchronized`, y usan `wait()` / `notifyAll()` para coordinar a los repartidores — si no hay pedidos disponibles, un repartidor queda esperando (`wait()`) hasta que llegue uno nuevo o se le avise que ya no quedan más. `Repartidor` implementa `Runnable` y retira pedidos en un ciclo hasta que la zona de carga se agota, actualizando el estado de cada `Pedido` (`PENDIENTE` → `EN_REPARTO` → `ENTREGADO`) mediante el enum `EstadoPedido`.

Este paquete es independiente de las clases `Pedido`/`Repartidor` usadas en semanas anteriores (con jerarquía de subclases y `distanciaKm`), ya que el enunciado pide una versión más simple enfocada en la sincronización del recurso compartido.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 semana 5/src/
├── ui/      # Clase principal con el método main
└── carga/   # EstadoPedido (enum), Pedido, ZonaDeCarga, Repartidor
```

## 🧩 Paquetes y clases implementadas

| Clase / Enum | Paquete | Descripción |
|---|---|---|
| `EstadoPedido` | `carga` | Enum con los estados posibles de un pedido: `PENDIENTE`, `EN_REPARTO`, `ENTREGADO` |
| `Pedido` | `carga` | Id, dirección de entrega y estado. Nace siempre en `PENDIENTE`; sobrescribe `toString()` |
| `ZonaDeCarga` | `carga` | Recurso compartido: lista de pedidos pendientes protegida con `synchronized`, coordinada con `wait()`/`notifyAll()` para que los repartidores esperen cuando no hay pedidos disponibles |
| `Repartidor` | `carga` | Implementa `Runnable`. Retira pedidos de la `ZonaDeCarga` en un ciclo, simula la entrega con `Thread.sleep()` y actualiza el estado de cada pedido |
| `Main` | `ui` | Crea la `ZonaDeCarga`, agrega 6 pedidos, y ejecuta 3 repartidores en paralelo mediante `ExecutorService`, esperando con `awaitTermination()` a que todos terminen |

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/nicosalgadogit/SpeedFast.git
```

2. Abre el proyecto en IntelliJ IDEA. El código de esta entrega se encuentra dentro de la carpeta `semana 5`.

3. Ejecuta el archivo `Main.java` desde el paquete `ui`.

4. Por consola se mostrará, de forma intercalada, cómo los 3 repartidores retiran pedidos de la zona de carga sin repetirse ninguno, el cambio de estado de cada pedido, y un mensaje final una vez que todos fueron entregados.

---

**Repositorio GitHub:** \[https://github.com/nicosalgadogit/SpeedFast.git]
**Fecha de entrega:** \[14-09-2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Desarrollo Orientado a Objetos II