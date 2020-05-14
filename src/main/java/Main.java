import java.util.Arrays;

public class Main {

   
    char[][] tablero = new char[3][3];

    void init() {

        for (int i = 0; i < 3; i++) {
            Arrays.fill(tablero[i], ' ');
        }

    }


    void turn(char tkn, int x, int y){
        
            if(tablero[x][y] == ' '){
                System.out.println("Invalid move");

            }else{
                tablero[x][y] = tkn;
            }

    }


    public static void main(String[] args) {

        
        


        System.out.println("Hello world!");
    }
}
