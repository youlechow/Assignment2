
class Player {
    private String playerID;
    private String playerName;
    private Character character;

    public Player(String id, String name) {
        this.playerID = id;
        this.playerName = name;
    }

    public String getPlayerID() {
        return playerID;
    }

    public Character getCharacter(){
        return character;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setCharacter(Character character){
        this.character = character;
    }

}
