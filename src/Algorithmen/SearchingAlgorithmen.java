package Algorithmen;



public class SearchingAlgorithmen{
    // @overload
    public static boolean linearSearch (String [] array, String value){
        for(int i = 0 ; i<array.length; i++){
            if (array[i].equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }
    public static boolean linearSearch (String [][] array, String value){
        for(int i = 0 ; i<array.length; i++){
            for(int j = 0 ; j < array[i].length; j++){
                if (array[i][j].equalsIgnoreCase(value)) {
                    return true;
                }
            }
        }
        return false;
    }

}
