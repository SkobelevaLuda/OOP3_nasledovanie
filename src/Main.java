public class Main {
    public static void  main (String [] args){
        Animal gazelle = new Herbivore(" Стройняшка",2, 70, " Трава");
        Animal giraffe = new Herbivore(" Лола",4, 58, " листья");
        Animal horse = new Herbivore(" Граф",3, 100, " Трава");
        Animal hyena = new Predator(" Олаф ",5, 60, " Тухлятина");
        Animal tiger = new Predator(" Кот",2, 77, " Мясо");
        Animal beаr = new Predator(" Миша",4, 40, " Малина и мед");
        Animal frog = new Amphibian(" Квакуша",1);
        Animal snake = new Amphibian(" Каа", 2);
        Animal peacock = new Flightles(" Кеша",4,"Зоопарк");
        Animal penguin = new Flightles(" Мими",5, " Антарктика");
        Animal dodo = new Flightles(" Каркуша",1, " Зоопарк");
        Animal seagull = new Flying(" Летчик",3, " Зоопарк");
        Animal albatross = new Flying(" Диди",4, " Зоопарк");
        Animal falcon = new Flying(" Комар",6, " Зоопарк");

        gazelle.eat();
        tiger.eat();
        dodo.eat();
        snake.eat();



    }


}
