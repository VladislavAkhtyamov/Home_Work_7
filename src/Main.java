public class Main {
    public static void main(String[] args) {
CatsandPlates();
    }

    static void CatsandPlates(){
        Cat[] cats = {
                new Cat("Мурзик", 10),
                new Cat("Матроскин",15),
                new Cat("Барсик", 5)

        };
        Plate plate = new Plate(25);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i]);
        }
    }
}
