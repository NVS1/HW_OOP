package HW_Lecture_3_4.Task_1_MusicApp;

import java.util.Arrays;

public class AudioContent {
    private final byte [] content;

    public AudioContent(byte[] content) {
        this.content = content;
    }

    public byte[] getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "AudioContent{" +
                "content=" + Arrays.toString(content) +
                '}';
    }
}
