public class Rogue extends Character{
    private int stealthLevel;
    private String daggerType;

    public Rogue(String characterID,String characterName,int level,int stealthLevel, String daggerType){
        super(characterID, characterName);
        setLevel(level);
        this.stealthLevel = stealthLevel;
        this.daggerType = daggerType;
    }

    public int getStealthLevel(){
        return stealthLevel;
    }

    public String getDaggerType(){
        return daggerType;
    }

    public void setStealthLevel(int level){
        this.stealthLevel = level;
    }

    public void setDaggerType(String type){
        this.daggerType = type;
    }

    public void stab(Character target){
        int damage =0;
        if(getLevel()>=1 && getLevel()<=3){
            damage = 10;
        }else if(getLevel()>=4 && getLevel()<=5){
            damage = 15;
        }else  if(getLevel()>5){
            damage = 20;
        }
        target.setHealth(target.getHealth() - damage);
        System.out.println(getCharacterName() + " stabs "  + target.getCharacterName() + " with " + daggerType + " for " + damage + " damage.");
    }

    public void evade(){
        if(stealthLevel <5){
            System.out.println(getCharacterName()+"'s stealth level must reach level 5 before evading attack.");
        }else if(stealthLevel >=5){
            System.out.println(getCharacterName()+" successfully evaded the incoming attack.");
        }
    }

    @Override
    public String toString(){
        return super.toString() +
        "\n Stealth level: " + stealthLevel +
        "\n Dagger Type: " + daggerType;
    }
}
