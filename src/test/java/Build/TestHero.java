package org.example;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestHero {
    Person hero;

    @BeforeClass
    public void setup(){
        hero = new Person();
    }

    @Test
    public void withNotPattern() {
        printHar(hero.getLuck(), hero.getStrenght(), hero.getIntellegence(), hero.getAgility());

    }
    public void printHar(int luck, int strenght, int integ, int agil) {

        System.out.println(luck);
        System.out.println(strenght);
        System.out.println(integ);
        System.out.println(agil);
    }

    @Test
    public void withPattern(){

        Person firstBuilder = new Person.Charakt()
                .strenght(7)
                .luck(4)
                .agility(8)
                .intellegence(12)
                .build();
        printHar(hero.getLuck(), hero.getStrenght(), hero.getIntellegence(), hero.getAgility());


    }

}

