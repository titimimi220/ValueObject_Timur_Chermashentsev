package Builder;

public class Person {

    private int luck;
    private int strenght;
    private int intellegence;
    private int agility;

    public Person() {

    }

    private Person(Charakt builder){
        this.luck = builder.luck;
        this.strenght = builder.strenght;
        this.intellegence = builder.intellegence;
        this.agility = builder.agility;
    }

    public static class Charakt{
        private int luck;
        private int strenght;
        private int intellegence;
        private int agility;

        public Charakt luck(int luck){
            this.luck = luck;
            return this;
        }
        public Charakt strenght(int strenght){
            this.strenght = strenght;
            return this;
        }
        public Charakt intellegence(int intellegence){
            this.intellegence = intellegence;
            return this;
        }
        public Charakt agility(int agility){
            this.agility = agility;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    public int getLuck(){
        return luck;
    }

    public void setLuck(int luck){
        this.luck = luck;
    }
    public int getStrenght(){
        return strenght;
    }
    public void setStrenght(int strenght){
        this.strenght = strenght;
    }
    public int getIntellegence(){
        return intellegence;
    }

    public void setIntellegence(int intellegence){
        this.intellegence = intellegence;
    }
    public int getAgility(){
        return agility;
    }

    public void setAgility(int agility){
        this.agility = agility;
    }
//    public static void main( String[] args ) {
//        System.out.println( "Hello World!" );
//    }
}
