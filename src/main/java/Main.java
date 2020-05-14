import java.util.Arrays;

public class Main {

   
    static char[][] tablero = new char[3][3];

    void init() {

        for (int i = 0; i < 3; i++) {
            Arrays.fill(tablero[i], ' ');
        }
    }


    static void turn(char tkn, int x, int y){
        
            if(tablero[x][y] != ' '){
                System.out.println("Invalid move");

            }else{
                tablero[x][y] = tkn;
            }

    }

    public static int winner()
    {

        for(int row = 0; row < 3; row++)
        {
            if(tablero[row][0] != ' ' && tablero[row][0] == tablero[row][1] && tablero[row][0] == tablero[row][2])
            {
                return (tablero[row][0] == 'x')?1:2;
            }
        }

        for(int col = 0; col < 3; col++)
        {
            if(tablero[0][col] != ' ' && tablero[0][col] == tablero[1][col] && tablero[0][col] == tablero[2][col])
            {
                return (tablero[0][col] == 'x')?1:2;
            }
        }

        if(tablero[0][0] != ' ' && tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2])
        {
            return (tablero[0][0] == 'x')?1:2;
        }

        if(tablero[0][2] != ' ' && tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0])
        {
            return (tablero[0][0] == 'x')?1:2;
        }

        return 0;
    }

    public static void main(String[] args) {

        while(winner() == 0)
        {
            //turn();
        }

        System.out.println("Hello world!");
    }


}
