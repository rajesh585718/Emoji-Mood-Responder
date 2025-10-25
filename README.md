# 🌈 Emoji Mood Responder (Java)

This is my **Internship Task** project — a simple **Emoji Mood Responder** built using **Java**.
It detects the user’s mood from short text input and responds with a matching **emoji** 😊.

---

## 🧠 Project Overview

The project analyzes input text (like “I’m so happy today!”) and outputs an emoji based on the detected emotion — such as happiness, sadness, anger, or surprise.

| Mood      | Example Text          | Emoji |
| --------- | --------------------- | ----- |
| Happy     | "I'm feeling great!"  | 😄    |
| Sad       | "I lost my phone..."  | 😔    |
| Angry     | "That’s so annoying!" | 😡    |
| Surprised | "Oh wow, really?"     | 😲    |
| Neutral   | "Okay, fine."         | 🙂    |

---

## ⚙️ Technologies Used

* Java (Core)
* Command Line Interface (CLI)
* Basic NLP (keyword-based detection)
* Optional: Maven for build management

---

## 🧩 Folder Structure

```
emoji-mood-responder/
├── src/
│   ├── main/java/com/emojimood/
│   │   ├── App.java
│   │   ├── MoodDetector.java
│   │   └── EmojiMapper.java
│   └── test/java/com/emojimood/
│       └── MoodDetectorTest.java
├── pom.xml
└── README.md
```

---

## 🚀 How to Run

### **1️⃣ Clone the repository**

```bash
git clone https://github.com/<your-username>/emoji-mood-responder-java.git
cd emoji-mood-responder-java
```

### **2️⃣ Compile the code**

If using Maven:

```bash
mvn clean package
```

Or manually:

```bash
javac -d out src/main/java/com/emojimood/*.java
```

### **3️⃣ Run the program**

```bash
java -cp target/emoji-mood-responder-1.0-SNAPSHOT.jar com.emojimood.App "I’m so happy today!"
```

**Output:**

```
😊
```

---

## 💻 Example Outputs

| Input                         | Output |
| ----------------------------- | ------ |
| "I am feeling awesome today!" | 😄     |
| "I’m really tired and sad"    | 😢     |
| "That made me angry!"         | 😡     |
| "Wow, that’s unexpected!"     | 😲     |
| "Okay."                       | 🙂     |

---

## 🧠 Code Snippet (Core Logic)

```java
public class EmojiMapper {
    public static String getEmoji(String mood) {
        switch (mood.toLowerCase()) {
            case "happy": return "😊";
            case "sad": return "😢";
            case "angry": return "😡";
            case "surprised": return "😲";
            default: return "🙂";
        }
    }
}
```

---

## 🧪 Running Tests

If using Maven:

```bash
mvn test
```

---

## 🌟 Future Improvements

* Add ML/NLP-based sentiment analysis
* Web interface using Java Spring Boot
* More moods and emojis
* GUI with Swing or JavaFX

---

## 👨‍💻 Author

**[I Rajesh Rao]**
Internship Project @ **motioncut** 🌍
🔗 GitHub: [https://github.com/<your-username>](https://github.com/<your-username>)

---

## 📜 License

This project is licensed under the **MIT License** — you’re free to use and modify it.

---

⭐ *If you like this project, don’t forget to star the repo!* ⭐
