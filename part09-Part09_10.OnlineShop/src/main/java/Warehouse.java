import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> stock;
    private Map<String, Integer> prices;

    public Warehouse(){
        stock = new HashMap<>();
        prices = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.stock.put(product, stock);
        prices.put(product, price);
    }

    public int price(String product){
        return prices.containsKey(product) ? prices.get(product) : -99;
    }

    public int stock(String product){
        return stock.containsKey(product) ? stock.get(product) : 0;
    }

    public boolean take(String product){
        if (stock.containsKey(product) && (stock.get(product)!=0)){
            int newStock = stock.get(product) - 1;
            stock.put(product, newStock);
            return true;
        } else {
            return false;
        }
    }

    public Set<String> products(){
        return stock.keySet();
    }
    
}
