package dcll;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rottanaly on 4/15/16.
 */
public class LoginGeneratorTest {

    private LoginService loginService = new LoginService(new String[]
            {"JROL", "BPER", "CGUR", "JDUP", "JRAL", "JRAL1"});
    private LoginGenerator loginGenerator = new LoginGenerator(loginService);

    @Test
    public void testGenerateLoginForNomAndPrenom1() throws Exception {
        String login = loginGenerator.generateLoginForNomAndPrenom("Durand", "Paul");
        assertEquals(login, "PDUR");

    }

    @Test
    public void testGenerateLoginForNomAndPrenom2() throws Exception {
        String login = loginGenerator.generateLoginForNomAndPrenom("Rolling", "Jean");
        assertEquals(login, "JROL1");

    }

    @Test
    public void testGenerateLoginForNomAndPrenom3() throws Exception {
        String login = loginGenerator.generateLoginForNomAndPrenom("Dùrand", "Paul");
        assertEquals(login, "PDUR");
    }
}