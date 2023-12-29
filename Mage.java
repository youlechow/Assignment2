public class Mage extends Character{
    private String elementalAffinity;

    public Mage(String characterID,String characterName,int level,String elementalAffinity){
        super(characterID, characterName);
        setLevel(level);
        this.elementalAffinity = elementalAffinity;
    }

    public String getElementalAffinity(){
        return elementalAffinity;
    }

    public void setElementalAffinity(String element){
        this.elementalAffinity = element;
    }

    public void castElementalSpell(String spellType){
        if(getLevel()<5){
            System.out.println("Need to reach level 5 before casting any spells");
        }else {
            switch (spellType) {
                case "Teleportation":
                    System.out.println("Teleporting "+getCharacterName()+" out of danger!");
                    break;
            
                case "Illusion":
                    System.out.println(getCharacterName()+" is creating illusions to confuse the enemy.");
                    break;
                
                case "Detection":
                    System.out.println(getCharacterName()+" is detecting the presence of magic nearby...");
                    break;
            }
        }
    }

    @Override
    public String toString(){
        return super.toString() + 
        "\n Elemental affinity: " + elementalAffinity;
    }
}
