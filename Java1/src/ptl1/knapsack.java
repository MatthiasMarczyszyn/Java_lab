package ptl1;

import java.util.ArrayList;
import java.util.List;

public class knapsack {

    int capacity;
    int amount;
    int backpackWeight = 0;
    int backpackValue = 0;
    List<Integer> valueList = new ArrayList<Integer>();
    List<Integer> weightList = new ArrayList<Integer>();

    public knapsack(int amm, int capa) {
        capacity = capa;
        amount = amm;
        solveProblem();
    }

    public void solveProblem() {
        RandomNumberGenerator rng = new RandomNumberGenerator(21);

        for (int i = 0; i < amount; i++) {
            valueList.add(rng.nextInt(1, 29));
            weightList.add(rng.nextInt(1, 29));
        }
        for (int i = 0; i < amount; i++) {
            if (backpackWeight + weightList.get(i) <= capacity && (valueList.get(i) > 0)) {
                backpackWeight += weightList.get(i);
                backpackValue += valueList.get(i);
            }
            if(backpackWeight == capacity) break;
        }
    }

    @Override
    public String toString(){
        String stringReturn = "";
        for(int i=0; i< amount; i++ ){
            stringReturn += i + 1 + "." + "\tWeight: " + weightList.get(i) + "\tValue: " + valueList.get(i) + "\n" ;
        }
        stringReturn += "Knapsack value: " + backpackValue + "\n";
        stringReturn += "Knapsack weight: " + backpackWeight + "\n";
        return stringReturn;
    }

}