import java.util.HashMap;
import java.util.Map;

public class MoodResponder {

    private final Map<String, String> moodMap;

    public MoodResponder() {
        moodMap = new HashMap<>();
        moodMap.put("happy", "😊 That's wonderful! Keep spreading positivity!");
        moodMap.put("sad", "😢 It's okay to feel sad. Take care of yourself!");
        moodMap.put("angry", "😠 Take a deep breath. Everything will be fine!");
        moodMap.put("tired", "😴 You should rest a bit. You deserve it!");
        moodMap.put("bored", "🥱 Maybe try something new and fun!");
        moodMap.put("excited", "🤩 Yay! That’s the spirit!");
        moodMap.put("nervous", "😬 Don’t worry, you’ve got this!");
        moodMap.put("confused", "😕 It’s okay. Take your time to figure it out!");
    }

    public String getResponse(String mood) {
        return moodMap.getOrDefault(mood, "🤔 I’m not sure about that feeling, but I’m here for you!");
    }
}
