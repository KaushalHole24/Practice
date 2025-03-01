package Array;

public class linearSearch {
    public static int linear(String cars[], String key){
        for(int i=0; i<cars.length; i++){
            if(cars[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String cars[] = {"BMW", "Audi", "Mercedis", "Tata", "Suzuki", "KIA", "Toyota"};
        String key = "Ford";
        int index = linear(cars, key);
        if(index == -1){
            System.out.println("Key not found");
        }else{
            System.out.println("Key is at index : "+index);
        }
    }
}
