class Indamon {
    
    private String name;
    private double hp;
    private int attack;
    private int defense;
    private boolean fainted;

    public String getName(){
        return name;
 }
public double getHp(){
        return hp;
 }
public int getAttack(){
        return attack;
 }
public int getDefense(){
        return defense;
 }
public boolean isFainted(){
        return fainted;
 }
public void setName(String newName){
        name=newName;
 }
public void setHp(int newHp){
        hp = newHp;
 }
public void setAttack(int newAttack){
        attack=newAttack;
 }
public void setDefense(int newDefense){
        defense=newDefense;
 }
public void setFainted(boolean newFainted){
       fainted=newFainted;
 }

    public Indamon(String name, int hp, int attack,
     int defense, boolean fainted) {

        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.fainted = fainted;

        
    }

    public void printInfo() {

        System.out.println("INFO");
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        System.out.println("Attack value: " + attack);
        System.out.println("Defense value: " + defense);
        System.out.println("Fainted: " + fainted);
    }

    public double indamonAttack(Indamon siberov){

        double damage = attack/siberov.defense;
        siberov.hp = siberov.hp - damage;

        System.out.println("Indamon " + name + " attacked indamon "
         + siberov.name + " for " + damage + " damage! ");

        System.out.println("Indamon " + siberov.name + " has " +
         siberov.hp + " hp left!");

        return siberov.hp;
        
    }

    public static void main(String[] args) {

        Indamon glassey = new Indamon("Glassey", 10,
         10, 5, false);

        Indamon siberov = new Indamon("Siberov", 10,
         5, 3, false);

         glassey.printInfo();
         siberov.printInfo();

         glassey.indamonAttack(siberov);

    }
}