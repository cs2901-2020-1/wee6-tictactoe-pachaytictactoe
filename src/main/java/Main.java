import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

   
    static char[][] tablero = new char[3][3];

    static void print() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(tablero[i][j]);
                System.out.print(" - ");
            }
            System.out.print(tablero[i][2]);
            System.out.print("\n");
        }
    }

    static void init() {

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

    public static void main(String[] args) throws IOException {

        char player = 'x';
        init();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(winner() == 0)
        {
            System.out.println("Insert Coordinates (separated by space):");
            String name = reader.readLine();
            String[] parsed = name.split(" ");
            if (Integer.parseInt(parsed[0]) >= 3) {
                System.out.println("Invalid Coordinate");
                continue;
            }
            if (Integer.parseInt(parsed[1]) >= 3) {
                System.out.println("Invalid Coordinate");
                continue;
            }
            turn(player, Integer.parseInt(parsed[0]), Integer.parseInt(parsed[1]));
            print();
            if (player == 'o') {player = 'x';}
            else {player = 'o';}
        }
        if (winner() == 1) {
            System.out.print("Winner is x");
        }
        else if (winner() == 2) {
            System.out.print("Winner is o");
        }
    }


}
