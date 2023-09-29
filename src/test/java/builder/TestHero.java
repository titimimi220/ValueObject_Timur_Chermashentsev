package builder;


import org.testng.annotations.Test;

public class TestHero {
    Person hero;

    public void setup(){
        hero = new Person();
    }

    @Test
    public void withNotPattern() {
        printHar(hero.getLuck(), hero.getStrenght(), hero.getIntellegence(), hero.getAgility());
    }

    @Test
    public void withPattern(){
        printhero(firstBuilder);
        printhero(secondBuilder);
        printhero(thirdBuilder);
    }

    public void printhero(Person numb){
        System.out.println("Удача игрока = " + numb.getLuck());
        System.out.println("Сила игрока = " + numb.getStrenght());
        System.out.println("Интеллект игрока = " + numb.getIntellegence());
        System.out.println("Ловкость игрока = " + numb.getAgility());
        System.out.println();
    }

    public void printHar(int luck, int strenght, int integ, int agil) {

        System.out.println("Удача игрока = " + luck);
        System.out.println("Сила игрока = " + strenght);
        System.out.println("Интеллект игрока = " + integ);
        System.out.println("Ловкость игрока = " + agil);
    }

    Person firstBuilder = new Person.PersonBuilder()
            .luck(4)
            .strenght(7)
            .intellegence(12)
            .agility(8)
            .build();
    Person secondBuilder = new Person.PersonBuilder()
            .luck(13)
            .strenght(8)
            .intellegence(10)
            .agility(5)
            .build();
    Person thirdBuilder = new Person.PersonBuilder()
            .luck(19)
            .strenght(29)
            .intellegence(23)
            .agility(16)
            .build();
}

