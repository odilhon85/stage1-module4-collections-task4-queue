package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> dishList = new ArrayList<>();
        if(numberOfDishes==0)return dishList;

        for (int i = 1; i <= numberOfDishes; i++) {
            dishList.add(i);
        }
        List<Integer> eatenDishList = new ArrayList<>(dishList);
        List<Integer> resultDish = new ArrayList<>();

        for (int i = everyDishNumberToEat-1; eatenDishList.size()!=0;) {
            resultDish.add(eatenDishList.remove(i));
            if(i+everyDishNumberToEat-1 > eatenDishList.size()-1){
                i=(i+everyDishNumberToEat)-eatenDishList.size()-1;
                if(eatenDishList.size()==1)i=0;
            }else{
                i+=everyDishNumberToEat-1;
            }
        }
    return resultDish;
    }
}
