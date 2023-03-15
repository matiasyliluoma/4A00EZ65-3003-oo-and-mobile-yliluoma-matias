public class Main {
    public static void main(String[] args) {

        int height = 4;
        int width = 4;

        getRandomTable(height, width);

        char[][] table = {{'a','b','c'}, {'e','f','g'}};
        output(table);

    }

    public static char[][] getRandomTable(int height, int width) {
        char[][] result = new char[height][width];
        for(int i = 0; i < height; i++){

            for(int j = 0; j < width; j++) {
                result[i][j] = getRandomSign();
            }
            System.out.println(result[i]);

        }

        return result;

    }

    public static char getRandomSign() {
        if(Math.random() <= 0.5) {
            return '-';
        } else {
            return 'x';
        }
    }


    public static void output(char[][] table) {
        //this works only if all the cells are same amount of indexes
        int column = table.length;
        //expecting that all the cells are equals on size so we can check only the first cell
        int rows = table[0].length;
        char[][] result = new char[column][rows];

        for(int i = 0; i < column; i++){

            for(int j = 0; j < rows; j++) {
                result[i][j] = table[i][j];
            }
            System.out.println(result[i]);
        }
    }  
}
