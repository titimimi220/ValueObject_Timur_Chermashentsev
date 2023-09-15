package valueObject;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HeroStatsTest {

    Herostats hero;

    @BeforeClass
    public void setup(){
        hero = new Herostats();
    }

    @Test
    public void noPatternTest(){
        print(hero.getLuck(), hero.getStrenght(), hero.getIntellegence(), hero.getAgility());
    }

    public void print(int luck, int strenght, int intellegence, int agility){
        System.out.println(luck);
        System.out.println(strenght);
        System.out.println(intellegence);
        System.out.println(agility);
    }

    @Test
    public void withPatternTest(){
         print1(hero);
    }

    public void print1(Herostats hero){
        System.out.println(hero);
    }


}
