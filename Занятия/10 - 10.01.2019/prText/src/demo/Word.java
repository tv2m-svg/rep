package demo;
public class Word {
    private String word;
    private byte partOfSpeech; // 1- noun, 2- verb, ...

    public Word(String word, byte partOfSpeech) {
        this.word = word;
        this.partOfSpeech = partOfSpeech;
    }

    @Override
    public String toString() {
        return word;
    }

    public String getWord() {
        return word;
    }
    
    
    
}
