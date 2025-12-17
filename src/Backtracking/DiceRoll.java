package Backtracking;

import java.util.ArrayList;

public class DiceRoll {
    public static void main(String[] args){
        System.out.println(diceRetutn("" , 4));
    }
    public static ArrayList<String> diceRetutn(String p , int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= target; i++){
            list.addAll(diceRetutn(p + i , target - i));
        }
        return list;
    }
}
