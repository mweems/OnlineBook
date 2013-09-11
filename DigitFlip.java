public class DigitFlip {

    public int flip(int num){
        String number = String.valueOf(num);
        int [] flipped = new int[number.length()];
        String list = "";
        for (int i = 0; i < number.length(); i++){
            flipped[i] = (num % 10);
            list += flipped[i];
            num /= 10;
        }
        return Integer.parseInt(list);
    }
}
