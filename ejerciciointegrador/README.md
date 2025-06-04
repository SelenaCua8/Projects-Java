# 🔥 Pokémon Battle Simulator – OOP Exercise

This is a simple Java exercise where I apply **object-oriented programming** concepts such as **abstract classes** and **interfaces** to simulate attacks from different Pokémon characters.

## 🎯 Purpose

The goal of this project is to practice and demonstrate understanding of:
- Abstract classes
- Interfaces
- Inheritance and polymorphism
- Java method overriding
- Basic console output

## 📚 Description

In this exercise, we model a simplified Pokémon battle system where each Pokémon has its own set of attacks based on its type.

### 🧬 Abstract Class: `Pokemon`

Defines the base attributes and common behavior shared by all Pokémon:
- `num_pokedex`, `nombrePokemon`, `pesoPokemon`, `sexo`, `temporadaQueAparece`, `tipo`
- Common attacks implemented in the class:
  - `atacarPlacaje()`
  - `atacarArañazo()`
  - `atacarMordisco()`

### ⚡ Interfaces by Type

Each Pokémon type has its own interface defining special attacks:

- `IElectrico`: `atacarImpactrueno()`, `atacarPunioTrueno()`, `atacarRayo()`, `atacarRayoCarga()`
- `IPlanta`: `atacarParalizar()`, `atacarDrenaje()`, `atacarHojaAfilada()`, `atacarLatigoCepa()`
- `IFuego`: `atacarPunioFuego()`, `atacarAscuas()`, `atacarLanzallamas()`
- `IAgua`: `atacarHidrobomba()`, `atacarPistolaAgua()`, `atacarBurbuja()`, `atacarHidropulso()`

### 🧪 Pokémon Implementations

Each of the following starter Pokémon from Generation 1 implements the necessary interfaces and overrides attack methods:

- 🔥 **Charmander** → Implements `IFuego`
- 🌱 **Bulbasaur** → Implements `IPlanta`
- 💧 **Squirtle** → Implements `IAgua`
- ⚡ **Pikachu** → Implements `IElectrico`

All overridden methods display console messages like:
> "Soy Pikachu y estoy atacando con placaje"  
> "Soy Charmander y estoy atacando con Ascuas"

---

## 🛠️ How to Use

1. Clone the repository.
2. Open the `.java` files in your IDE (e.g., IntelliJ, Eclipse, etc.).
3. Run the `main` class to create instances and execute the attacks.

---

## 📌 Key Concepts Practiced

- Object-Oriented Programming (OOP)
- Interfaces and Abstract Classes
- Inheritance and Method Overriding
- Console Output in Java

---

## 📎 Notes

This is a beginner-friendly Java exercise intended for learning purposes and reinforcement of key OOP principles.

