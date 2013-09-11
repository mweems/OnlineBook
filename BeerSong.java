public class BeerSong {

    String lyric1 = " bottles of beer";
    String lyric2 = " on the wall";

    public String sing(int startingBottles){
       for(int bottles = startingBottles; bottles > 0; bottles --){
           System.out.println(bottles + lyric1 + lyric2);
           System.out.println(bottles + lyric1);
           System.out.println("You take one down, Pass it around ");
           System.out.println(bottles - 1 + lyric1 + lyric2);
        }
        return "song played";
    }
}
