package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int counter = 0;
        for(int i =0; i< playList.length; i++) {
            if (selection.equals(playList[i])) {
                counter = i - startIndex;
//                break;
            }
              else if (startIndex < 0){
                startIndex = playList.length -1;
            } else if (startIndex >= playList.length) {
                startIndex = 0 ;
            }
        }


        return counter;
    }
}
