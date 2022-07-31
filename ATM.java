public class ATM{

    public int countBanknotes(int sum){
        int[]currency = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;
        int i = 0;
        while(i < currency.length){
            while(sum >= currency[i]){
                sum -= currency[i];
                count++;
            }
            if(sum == 0)
                break;
            else
                i++;
        }
        return count;            
    }
}