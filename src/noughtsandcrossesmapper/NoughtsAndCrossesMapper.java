package noughtsandcrossesmapper;


import java.util.Arrays;


public class NoughtsAndCrossesMapper {

    public int[][] mapNoughtsAndCrosses(char[][] noughtsAndCrosses) {
        int[][] mappedNoughtsAndCrosses = new int[noughtsAndCrosses.length][noughtsAndCrosses.length];
        for (int row = 0; row < noughtsAndCrosses.length; row++) {
            for (int col = 0; col < noughtsAndCrosses.length; col++) {
                if (String.valueOf(noughtsAndCrosses[row][col]).equals("X")) {
                    mappedNoughtsAndCrosses[row][col] = 1;
                }
                else mappedNoughtsAndCrosses[row][col] = 0;
            }
        }
        return mappedNoughtsAndCrosses;
    }


}
//
//
//
//
//
//
//
//
//    public String[][] mapNoughtsAndCrosses(String[][] noughtsAndCrosses) {
//
//        return noughtsAndCrosses;
//    }
//
//    public static void displayMappedNoughtsAndCrosses(String[][] noughtsAndCrosses) {
//
//    }
//
//
//}
