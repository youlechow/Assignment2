public class Skill {
    
    private String skillName;
    private String skillDescription;

    public Skill(String skillName,String skillDescription){
        this.skillName = skillName;
        this.skillDescription = skillDescription;
    }
    public String getSkillName(){
        return skillName;
    }

    public String getSkillDescription(){
        return skillDescription;
    }

    public void setSkillName(String name){
        this.skillName = name;
    }

    public void setSkillDescription(String description){
        this.skillDescription = description;
    }

    @Override
    public String toString(){
        return super.toString() +
        "\n Skill name: " + skillName +
        "\n Skill description: " + skillDescription;
    }
}
