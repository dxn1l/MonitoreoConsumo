# MonitoreoConsumo hecho por Daniel Andrés Moreno Rey , Rodrigo Rojas Redondo , Arturo Lopez Castaño y Roberto quilez

Link del repositorio: https://github.com/dxn1l/MonitoreoConsumo.git

MonitoreoConsumo es una aplicación de Android que monitorea y registra el consumo de energía en diferentes habitaciones de una casa. La aplicación utiliza Firebase para almacenar los datos de consumo de energía promedio para el baño, la cocina y el dormitorio.

## Características

- Generar y mostrar datos de consumo de energía para diferentes habitaciones.
- Guardar datos de consumo de energía promedio en Firebase.
- Ver recomendaciones basadas en el consumo de energía.
- Uso de hilos para simular la generación de datos de consumo de energía.

## Pantallas

- **Pantalla de Bienvenida**: Da la bienvenida al usuario y proporciona navegación a la pantalla de consumo.
- **Pantalla de Consumo**: Permite la navegación a las pantallas de habitaciones individuales (Baño, Cocina, Dormitorio).
- **Pantalla de Baño**: Genera y muestra datos de consumo de energía para el baño.
- **Pantalla de Cocina**: Genera y muestra datos de consumo de energía para la cocina.
- **Pantalla de Dormitorio**: Genera y muestra datos de consumo de energía para el dormitorio.

## Instalación

1. Clona el repositorio:
2. Abre el proyecto en Android Studio.
3. Asegúrate de tener los archivos de configuración necesarios de Firebase (`google-services.json`) en el directorio `app`.
4. Compila y ejecuta el proyecto en un dispositivo Android o emulador.

## Dependencias

El proyecto utiliza las siguientes dependencias:

- Bibliotecas de AndroidX
- Firebase Firestore y Realtime Database
- MPAndroidChart para mostrar gráficos
- Kotlin

## Uso

1. Lanza la aplicación en tu dispositivo Android.
2. Navega a través de las pantallas para generar y ver datos de consumo de energía.
3. Haz clic en el botón "Gasto energético" en cualquier pantalla de habitación para generar y guardar los datos de consumo de energía promedio en Firebase.
4. Ve las recomendaciones basadas en los datos generados.

## Estructura del Código

- `MainActivity.kt`: Inicializa Firebase y establece el contenido en `ConsumoApp`.
- `ConsumoApp.kt`: Gestiona la navegación entre diferentes pantallas.
- `FirebaseUtils.kt`: Contiene funciones utilitarias para guardar datos en Firebase.
- `DataGenerator.kt`: Simula la generación de datos de consumo de energía utilizando hilos.
- `CustomLineChart.kt`: Vista personalizada para mostrar gráficos de líneas usando MPAndroidChart.
- `Screens/`: Contiene las funciones Composable para diferentes pantallas.

