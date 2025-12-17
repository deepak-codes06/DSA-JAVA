import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class CountryMap {
    public static void main(String[] args){
        Map<String,String> countryMap = new HashMap<>();

        countryMap.put("Bharat" , "New Delhi");
        countryMap.put("china" , "Beijing");
        countryMap.put("pakistan" , "Islamabad");
        countryMap.put("Bangladesh" , "Dhaka");
        countryMap.put("SriLanka" , "Columbo");

        Scanner input = new Scanner(System.in);
        System.out.println("enter the country name: ");
        String country = input.next();

        if(countryMap.containsKey(country)){
            System.out.printf("the capital of %s is %s: ",country, countryMap.get(country));
        }else{
            System.out.println("sorry! we don't know the capital");
        }

    }
}
