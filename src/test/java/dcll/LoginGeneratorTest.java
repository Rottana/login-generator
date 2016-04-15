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
        String login = loginGenerator.generateLoginForNomAndPrenom("Paul", "Durand");
        boolean testLogin = loginService.loginExists(login);
        assertTrue(testLogin);

    }

    @Test
    public void testGenerateLoginForNomAndPrenom2() throws Exception {
        String login = loginGenerator.generateLoginForNomAndPrenom("Jean", "Rolling");
        boolean testLogin = loginService.loginExists(login);
        assertTrue(testLogin);

    }

    @Test
    public void testGenerateLoginForNomAndPrenom3() throws Exception {
        String login = loginGenerator.generateLoginForNomAndPrenom("Paul", "Dùrand");
        boolean testLogin = loginService.loginExists(login);
        assertTrue(testLogin);

    }
}