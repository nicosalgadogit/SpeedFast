![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Actividad Semana 4 – Desarrollo Orientado a Objetos II

## 👤 Autor del proyecto
- **Nombre completo:** Nicolas Salgado
- **Sección:** [2026_203_OL_PRY2203_24650289_PCT]
- **Carrera:** ANALISTA PROGRAMADOR COMPUTACIONAL
- **Sede:** Antonio Varas

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la actividad formativa de la Semana 4 de la asignatura Desarrollo Orientado a Objetos II: incorporar **programación concurrente** al sistema de entregas de **SpeedFast**. Se reutiliza toda la estructura de las semanas anteriores (`Pedido` abstracta, sus subclases y las interfaces `Despachable`, `Cancelable`, `Rastreable`), y se agrega la clase `Repartidor`, que simula a cada repartidor entregando sus pedidos **en paralelo** mediante hilos.

`Repartidor` implementa `Runnable`: en su método `run()` recorre su lista de pedidos asignados, imprime el avance de cada entrega y simula el tiempo de viaje con `Thread.sleep()` usando pausas aleatorias. En `Main`, se instancian tres repartidores (cada uno con dos o más pedidos) y se ejecutan simultáneamente mediante un `ExecutorService`, que administra el pool de hilos y espera a que todas las entregas finalicen antes de terminar el programa.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── ui/      # Clase principal con el método main
└── model/   # Pedido (abstracta), PedidoComida, PedidoEncomienda, PedidoExpress,
             # Despachable, Cancelable, Rastreable (interfaces), Repartidor (Runnable)
```

## 🧩 Paquetes y clases implementadas

| Clase / Interfaz | Paquete | Descripción |
|---|---|---|
| `Pedido` | `model` | Clase abstracta: atributos comunes, `mostrarResumen()` implementado, `calcularTiempoEntrega()` abstracto, `asignarRepartidor()` (genérico y sobrecargado) |
| `PedidoComida` / `PedidoEncomienda` / `PedidoExpress` | `model` | Subclases de `Pedido`, cada una con su lógica propia de validación y cálculo de tiempo |
| `Despachable` / `Cancelable` / `Rastreable` | `model` | Interfaces que declaran `despachar()`, `cancelar()` y `verHistorial()` |
| `Repartidor` | `model` | Implementa `Runnable`. Contiene `nombre` y una lista de `Pedido` asignados; su `run()` recorre los pedidos, simula la entrega de cada uno con `Thread.sleep()` (tiempo aleatorio) e informa el progreso por consola |
| `Main` | `ui` | Instancia 3 repartidores con 2+ pedidos cada uno y los ejecuta en paralelo usando `ExecutorService`, esperando con `awaitTermination()` a que todas las entregas concluyan |

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/nicosalgadogit/SpeedFast.git
```

2. Abre el proyecto en IntelliJ IDEA. El código de esta entrega se encuentra dentro de la carpeta `semana 4`.

3. Ejecuta el archivo `Main.java` desde el paquete `ui`.

4. Por consola se mostrará, de forma intercalada, el avance de las entregas de los 3 repartidores ejecutándose en paralelo: inicio de cada entrega, resumen del pedido, y confirmación al completarla con el tiempo simulado. El orden exacto de los mensajes puede variar entre ejecuciones, evidenciando la concurrencia real de los hilos.

---

**Repositorio GitHub:** \[https://github.com/nicosalgadogit/SpeedFast.git]
** Fecha de entrega:** \[13-09-2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Desarrollo Orientado a Objetos II