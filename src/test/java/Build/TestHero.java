package Builder;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class TestHero {
    Person hero;
    @BeforeClass    public void setup(){
        hero = new Person();
    }
    @Test
    public void withNotPattern() {
        setHar(12, 14, 15, 10);
        print(hero.getLuck(), hero.getStrenght(), hero.getIntellegence(), hero.getAgility());
    }
    public void setHar(int luck, int str, int agil, int intel) {
        hero.setLuck(luck);
        hero.setStrenght(str);
        hero.setLuck(agil);
        hero.setLuck(intel);
    }
    public void print(int luck, int strenght, int intellegence, int agility){
        System.out.println(luck);
        System.out.println(strenght);
        System.out.println(intellegence);
        System.out.println(agility);
    }

    @Test    public void withPattern(){

        Person firstBuilder = new Person.Charakt()
                .strenght(7)
                .luck(4)
                .agility(8)
                .intellegence(12)
                .build();
        print(hero.getLuck(), hero.getStrenght(), hero.getIntellegence(), hero.getAgility());
    }
}