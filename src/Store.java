public class Store {
    public void run(){
        Fruit fruit;
        fruit = new Fruit();
        fruit.setQtd(30);
        System.out.println(fruit.getQtd());
        System.out.println(fruit.getPrice());
    }
    public static void main(String[] args){
        Store store = new Store();
        store.run();
    }


}
