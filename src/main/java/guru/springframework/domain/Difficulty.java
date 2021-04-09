package guru.springframework.domain;

/**
 * Created by jt on 6/13/17.
 */
public enum Difficulty {

    EASY("Easy"), MODERATE("Moderate"), KIND_OF_HARD("Kind of hard"), HARD("Hard");

    private final String description;

    Difficulty(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
