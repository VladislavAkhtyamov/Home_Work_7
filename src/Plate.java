public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void Info() {
        System.out.println("Еды в тарелке: " + food);

    }
    public boolean decreaseFood (int n){
        if (n <= food) {
            food -= n;
            return true;
        }
        else {
            System.out.println("В тарелке не хватит еды");
            return false;
        }
    }
    public void IncreaseFood(int portion){
        int IncFood = portion + food;
        food = Math.min(IncFood, food);
    }
}
