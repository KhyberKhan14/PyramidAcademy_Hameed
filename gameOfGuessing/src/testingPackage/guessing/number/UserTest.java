package guessing.number;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;


class UserTest {


 //      void guessingTheNumber() {
//           User u = new User();

 //      }
 @Test
 public void guessingTheNumber() {
     User u = new User();
     String input = "hameed" ;
     InputStream in = new ByteArrayInputStream(input.getBytes());
     System.setIn(in);

     assertEquals("hameed", u.guessing());
 }


    }
