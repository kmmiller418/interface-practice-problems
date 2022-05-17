import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList <Packable> box;
    private Double maxCapacity;

    public Box (double maxCapacity) {
        box = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    public void add(Packable item){
        if (item.weight() + this.weight() <= maxCapacity){
            box.add(item);
        } else {
            System.out.println("Sorry, this box is full!");
        }
    }

    public double weight() {
        double totalWeight = 0.0;

        for (Packable item : box) {
            totalWeight += item.weight();
        }

        return totalWeight;
    }
    
    @Override
    public String toString(){
        return "Box: " + box.size() + " items, total weight " + this.weight() + " kg";
    }
}
