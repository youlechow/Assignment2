public class Warrior extends Character{
    private String weaponType;
    private String armorType;

    public Warrior(String characterID,String characterName,int level,String weaponType, String armorType){
        super(characterID, characterName);
        setLevel(level);
        this.weaponType = weaponType;
        this.armorType = armorType;
    }

    public String getWeaponType(){
        return weaponType;
    }

    public String getArmorType(){
        return armorType;
    }

    public void setWeaponType(String weapon){
        this.weaponType = weapon;
    }

    public void setAmorType(String armor){
        this.armorType = armor;
    }

    public void chargeAttack(Character target){
        int damage = 0;
        switch (weaponType) {
            case "Sword":
                if(target.getLevel() > 5){
                    damage = 50;
                }else if(target.getLevel() <= 5){
                    damage = 50 / 2;
                }
                break;
                
            case "Dagger":
                if(target.getLevel() > 5){
                    damage = 20;
                }else if(target.getLevel() <= 5){
                    damage = 20 / 2;
                }
                break;

            case "Crossbow":
                if(target.getLevel() > 5){
                    damage = 50;
                }else if(target.getLevel() <= 5){
                    damage = 50 / 2;
                }
                break;
            
            case "Staff":
                if(target.getLevel() > 5){
                    damage = 10;
                }else if(target.getLevel() <= 5){
                    damage = 10 / 2;
                }
                break;
            default:
                damage = 0;
                break;
        }
        target.setHealth(getHealth() - damage);
        System.out.println(getCharacterName()+" attacks " +target.getCharacterName() + " with " + weaponType + " for " + damage + " damage.");
    }

    public void shieldBlock(){
        switch (armorType) {
            case "Shield":
                System.out.println(getCharacterName()+" is raising its shield.");
                break;
            
            case "Gauntlet":
                System.out.println(getCharacterName()+" is raising its gauntlets.");
                break;
                
            case "Helmet":
                System.out.println(getCharacterName()+"'s head is protected.");
                break;

            default:
                System.out.println(getCharacterName()+", I hope you're protected...somehow.");
                break;
        }
    }

    @Override
    public String toString(){
        return super.toString() +
        "\n Weapon Type: " + weaponType +
        "\n Armor Type: " + armorType;
    }
}
