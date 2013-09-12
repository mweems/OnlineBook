public class PerfectNumber {

    public boolean isPerfect(int num){
        int[] checkValues = new int[4];
        checkValues[0] = 2;
        checkValues[1] = 3;
        checkValues[2] = 5;
        checkValues[3] = 7;

        for(int i: checkValues){
            Double prime = Math.pow(2,i-1)*(Math.pow(2,i) - 1);
            if((double) num == prime){
                return true;
            }
        }
        return false;
    }

    public String findPerfect(int begin, int end){
        String perfectNum = "";
        for(int i = begin; i <= end; i++ ){
            if(isPerfect(i)) perfectNum += i + ",";
        }
        return perfectNum;
    }
}
