package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        int counter = 0;
        for (int i = 0; i < playList.length; i++) {
            if (selection.equals((playList[i]))) {
                counter= i- startIndex;
                break;
            }
        }
        if(counter >= playList.length/2) {
            for (int i = playList.length - 1; i >= 0; i--) {
                if (selection.equals((playList[i]))) {
                    counter = (startIndex - i) + playList.length;
                    break;
                }
            }
        }
        return counter;
    }
}
