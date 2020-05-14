import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        char[][] tablero = new char[3][3];

        for(int i = 0; i < 3; i++)
        {
            Arrays.fill(tablero[i],' ');
        }


        System.out.println("Hello world!");
    }

    public static int winner()
    {

        for(int row = 0; row < 3; row++)
        {
            if(tablero[row][0] == ' ')
            {
                continue;
            }
            else
            {
               if(tablero[row][0] == tablero[row][1] && tablero[row][0] == tablero[row][2])
               {
                   return (tablero[row][0] == 'x')?1:2;
               }
            }
        }

        for(int col = 0; col < 3; col++)
        {
            if(tablero[0][col] == ' ')
            {
                continue;
            }
            else if(tablero[0][col] == tablero[1][col] && tablero[0][col] == tablero[2][col])
                {
                    return (tablero[0][col] == 'x')?1:2;
                }
        }

        if(tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2])
        {
            return (tablero[0][0] == 'x')?1:2;
        }

        if(tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0])
        {
            return (tablero[0][0] == 'x')?1:2;
        }


        return 0;
    }
}
