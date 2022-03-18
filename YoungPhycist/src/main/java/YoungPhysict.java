import java.util.*;
public class YoungPhysict {
    public boolean sum(int n, int [][]force){
        int sum=0;

        if ( n<1 || n>100) {
            return false;
        }

        for (int i=0; i<n; i++) {
            for (int j = 0; j < 3; j++) {
                if (force[i][j] <= -101 || force[i][j] >= 101){
                    return false;
                }
            }
        }

        for (int j=0; j<3; j++) {
            for (int k = 0; k < n; k++){
                sum = sum + force[k][j];
            }
            if (sum != 0) {
                return false;
            }
        }
        return true;
    }
}
