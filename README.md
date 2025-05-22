# 🚗 SmartCar – Java OOP Project

**SmartCar** is a modular Java application that simulates a smart vehicle using object-oriented programming concepts like **interface-based multiple inheritance** and **composition**.

## 🛠️ Technologies Used
- Java (Core)
- Object-Oriented Programming (OOP)
- Interfaces & Composition

## 📌 Features

The `SmartCar` simulates the following real-world vehicle functionalities:

- 🔁 **Driving Modes**
  - Eco Mode
  - Sport Mode
- 🎵 **Entertainment**
  - Start Music
  - Stop Music
- 📍 **GPS Navigation**
  - Navigate to a given location
- 🔋 **Diagnostics**
  - Show Battery Status
  - Check Engine Health
- ⚙️ **Engine Control**
  - Start Engine
  - Stop Engine

## 🧩 Project Structure

### `SmartCar` Class

Implements:
- `DriveMode`
- `Entertainment`
- `Gps`
- `Diagnostics`

Composes:
- `Engine`
- `MusicSystem`
- `Navigator`

### Interfaces

| Interface      | Methods                             |
|----------------|--------------------------------------|
| `DriveMode`     | `ecoMode()`, `sportMode()`           |
| `Entertainment` | `startMusic()`, `stopMusic()`        |
| `Gps`           | `navigateTo(String location)`        |
| `Diagnostics`   | `showBatteryStatus()`, `checkEngine()` |

### Composition Classes

| Class         | Responsibility                      |
|---------------|--------------------------------------|
| `Engine`       | `startEngine()`, `stopEngine()`       |
| `MusicSystem`  | `play()`, `stop()`                    |
| `Navigator`    | `navigate(String location)`           |

## 🚀 Getting Started

1. Clone the repository
2. Compile all Java files in the `car/` package
3. Run `SmartCarUI.java` (optional if you want to add UI later)
4. Or test via a simple `main()` method calling methods on `SmartCar`

## 👨‍💻 Author

Omkar Kanemoni  
[LinkedIn](https://www.linkedin.com/in/kanemoniomkar) | [GitHub](https://github.com/Omkarkanemoni)

## 📜 License

This project is for educational purposes and demonstration of Java OOP design.
