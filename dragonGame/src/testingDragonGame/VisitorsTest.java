import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisitorsTest {

    @Test
  void happiness() {
        Visitors v = new Visitors();
        assertEquals(2,v.congratulations());
    }

    @Test
     void sadness() {
        Visitors v = new Visitors();
        assertEquals(1, v.eaten());
    }

    @Test
    void entrance() {
    }
}