# 🎮 JuegoDos

**JuegoDos** is a simple Java desktop application featuring three randomized mini-games that use `JOptionPane` for user interaction and fun visuals. Players place bets and test their luck in each game.

---

## 🕹️ Available Games

### 🥤 1. Shell Game
Try to guess where the ball is hidden under three cups. You have **3 chances**:
- If you guess right: your bet **doubles**
- After each guess, the actual location of the ball is shown with an image

### 🃏 2. Mini Envido
You’re dealt 3 random cards:
- If **two cards** match in **number or suit**, you win
- If the **sum of the three cards is exactly 30**, your bet is returned
- Otherwise, you lose your bet

### 🦆 3. Duck Shooting
You get **3 shots**:
- Ducks give 0, 5, or 10 points
- Score **20 or more** in total to double your bet
- Otherwise, you lose

---

## 💻 Technologies Used

- Java (JDK 8 or higher)
- `JOptionPane` for GUI dialog windows
- `ImageIcon` for `.png` and `.gif` image rendering
- `Math.random()` for game randomness

---

## 📁 Folder Structure

JuegoDos/
├── src/
│ └── juegoDos/
│ └── JuegoDos.java
└── img/
├── vaso_izquierda.png
├── vaso_medio.png
├── vaso_derecha.png
├── goodluck.gif
├── risamalvada.gif
└── tiroalpato.jpg

Make sure the `img/` folder is on your classpath or `resources` directory so images load correctly at runtime.

---

## 🚀 How to Run

1. Clone the repository or download the project.
2. Open it in your Java IDE (like IntelliJ IDEA or Eclipse).
3. Ensure the `img/` directory is placed in the classpath.
4. Run `JuegoDos.java`.
5. Follow the instructions in the GUI and enjoy!

---

## 📌 Game Highlights

- Interactive graphics using `ImageIcon`
- Random logic and image feedback for each round
- Each game uses a betting system: Win = double your bet 💰
- Fun GIFs and humor in messages

---

## 📸 Screenshots

> _You can replace these paths with actual image URLs once uploaded to GitHub._

![Shell Game](img/vaso_medio.png)  
![Mini Envido](img/risamalvada.gif)  
![Duck Shooting](img/tiroalpato.jpg)

---

