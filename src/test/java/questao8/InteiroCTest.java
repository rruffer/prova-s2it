package questao8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testando os métodos dos inteiros")
public class InteiroCTest {

    @Test
    public void mergedNumberMustBeEqualsMinusOne() {

        Integer resposta = -1;
        Integer a = 10256;
        Integer b = 512;
        InteiroC n = new InteiroC();
        assertEquals(resposta, n.c(a, b));

    }


    @Test
    public void mergedNumberMustBeEquals() {

        Integer resposta = 150122;
        Integer a = 102;
        Integer b = 512;
        InteiroC n = new InteiroC();
        assertEquals(resposta, n.c(a, b));

    }


}
