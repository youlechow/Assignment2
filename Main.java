public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("001", "Player 1");
        Player player2 = new Player("002", "Player 2");

        Warrior gideon = new Warrior("GS001", "Gideon Stoneheart", 5, "Sword", "Chainmail");
        Mage elara = new Mage("EF001", "Elara Frostweaver", 1, "Ice");
        Rogue darian = new Rogue("DW001", "Darian Whisperwind", 10, 15, "Shuriken");

        Skill whirlwindSlash = new Skill("Whirlwind Slash", "A spinning attack that can hit several enemies at once");
        Skill dualWielding = new Skill("Dual Wielding",
                "The technique of using two weapons, one in each hand for training or combat");
        Skill frostNova = new Skill("Forst Nova",
                " Hits every enemy in a area around the Caster with a Ice Element frost attack");
        Skill lockpicking = new Skill("Lockpicking", "Used to open mechanical locks on doors and containers");

        gideon.setSkill(whirlwindSlash);
        gideon.setSkill(dualWielding);
        elara.setSkill(frostNova);
        darian.setSkill(lockpicking);

        player1.setCharacter(gideon);
        player1.setCharacter(elara);
        player2.setCharacter(darian);

        System.out.println();
        gideon.chargeAttack(darian);
        elara.castElementalSpell("Teleportation");
        darian.stab(gideon);
        gideon.shieldBlock();
        darian.evade();

        System.out.println();
        System.out.println(gideon);
        System.out.println();
        System.out.println(elara);
        System.out.println();
        System.out.println(darian);
    }
}
