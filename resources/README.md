![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Actividad Semana 3 – Desarrollo Orientado a Objetos II

## 👤 Autor del proyecto
- **Nombre completo:** Nicolas Salgado
- **Sección:** [2026_203_OL_PRY2203_24650289_PCT]
- **Carrera:** ANALISTA PROGRAMADOR COMPUTACIONAL
- **Sede:** Antonio Varas

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la actividad sumativa de la Semana 3 de la asignatura Desarrollo Orientado a Objetos II: la **versión integral** del sistema de entregas de **SpeedFast**, que reúne en un solo diseño lo trabajado en las semanas anteriores — polimorfismo, abstracción — e incorpora **interfaces** para desacoplar responsabilidades funcionales.

`Pedido` sigue siendo la clase abstracta base (atributos comunes, `mostrarResumen()` implementado, `calcularTiempoEntrega()` abstracto), y sus subclases `PedidoComida`, `PedidoEncomienda` y `PedidoExpress` sobrescriben tanto `calcularTiempoEntrega()` como las dos versiones de `asignarRepartidor()` (genérica y sobrecargada). A esto se suman las interfaces `Despachable`, `Cancelable` y `Rastreable`, implementadas en conjunto por la clase `ControladorDeEnvios`, que gestiona el ciclo de vida de los pedidos y mantiene un historial de despachos mediante un `ArrayList<Pedido>`.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── ui/      # Clase principal con el método main
├── model/   # Pedido (abstracta), PedidoComida, PedidoEncomienda, PedidoExpress,
│            # Despachable, Cancelable, Rastreable (interfaces)
└── data/    # ControladorDeEnvios
```

## 🧩 Paquetes y clases implementadas

| Clase / Interfaz | Paquete | Descripción |
|---|---|---|
| `Pedido` | `model` | Clase abstracta: atributos comunes, `mostrarResumen()` implementado, `calcularTiempoEntrega()` abstracto, y `asignarRepartidor()` (genérico y sobrecargado) |
| `PedidoComida` | `model` | Extiende `Pedido`. Valida mochila térmica; `calcularTiempoEntrega()`: 15 + 2 min/km |
| `PedidoEncomienda` | `model` | Extiende `Pedido`. Valida peso y embalaje; `calcularTiempoEntrega()`: 20 + 1.5 min/km (redondeado) |
| `PedidoExpress` | `model` | Extiende `Pedido`. Valida disponibilidad inmediata; `calcularTiempoEntrega()`: 10 min base, +5 si supera 5 km |
| `Despachable` | `model` | Interfaz: declara `despachar(Pedido p)` |
| `Cancelable` | `model` | Interfaz: declara `cancelar(Pedido p)` |
| `Rastreable` | `model` | Interfaz: declara `verHistorial()` |
| `ControladorDeEnvios` | `data` | Implementa las 3 interfaces. Mantiene un `ArrayList<Pedido>` con el historial de pedidos despachados |
| `Main` | `ui` | Simula el flujo completo: asignación automática y manual de repartidor, cálculo de tiempo estimado, despacho, cancelación y visualización del historial, diferenciando por tipo de pedido |

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/nicosalgadogit/SpeedFast.git
```

2. Abre el proyecto en IntelliJ IDEA. El código de esta entrega se encuentra dentro de la carpeta `semana 3`.

3. Ejecuta el archivo `Main.java` desde el paquete `ui`.

4. Por consola se mostrará, para cada tipo de pedido:
   - El resumen básico del pedido (`mostrarResumen()`).
   - La asignación de repartidor automática y manual, con su validación específica.
   - El tiempo estimado de entrega.
   - Al final, el despacho, la cancelación de un pedido, y el historial completo de pedidos despachados.

---

**Repositorio GitHub:** \[https://github.com/nicosalgadogit/SpeedFast.git
 **Fecha de entrega:** \[31-08-2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Desarrollo Orientado a Objetos II