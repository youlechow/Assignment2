public class Character {
    private String characterID;
    private String characterName;
    private int level;
    private int health;
    private Skill skill;

    public Character(String id, String name) {
        this.characterID = id;
        this.characterName = name;
        this.level = 1; // Default level
        this.health = 100; // Default health
    }

    // Getters and setters
    public String getCharacterID() {
        return characterID;
    }

    public String getCharacterName() {
        return characterName;
    }

    public int getLevel() {
        return level;
    }

    public int getHealth() {
        return health;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setCharacterID(String characterID) {
        this.characterID = characterID;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void levelUp() {
        this.level++;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Character ID: " + characterID +
                "\n Character Name: " + characterName +
                "\n Level: " + level +
                "\n Health: " + health +
                "\n" + skill;
    }
}