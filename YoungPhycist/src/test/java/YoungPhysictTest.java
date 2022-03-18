import org.junit.Test;

import static org.junit.Assert.*;

public class YoungPhysictTest {

    @Test
    public void sum() {
                YoungPhysict p= new YoungPhysict();
                int n=0;
                int [][]A= {{-3,0,2},{3,0,-2}};

                assertFalse(p.sum(n,A));
            }
        }