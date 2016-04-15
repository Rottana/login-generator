package dcll;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by rottanaly on 4/15/16.
 */
public class LoginServiceTest {
    private LoginService loginService = new LoginService(new String[]
            {"JROL", "BPER", "CGUR", "JDUP", "JRAL"});

    @Test
    public void testLoginExists() throws Exception {
        String login = "JROL";
        boolean testLogin = loginService.loginExists(login);
        assertTrue(testLogin);

    }

    @Test
    public void testAddLogin() throws Exception {
        int size = loginService.findAllLogins().size();
        loginService.addLogin("FVER");
        assertEquals(loginService.findAllLogins().size(), size+1);

    }

    @Test
    public void testFindAllLoginsStartingWith() throws Exception {
        List<String> res = loginService.findAllLoginsStartingWith("J");
        assertEquals(res.size(), loginService.findAllLoginsStartingWith("J").size());

    }

    @Test
    public void testFindAllLogins() throws Exception {
        List<String> allLogins = loginService.findAllLogins();
        assertNotNull(allLogins);
        assertEquals(allLogins.size(), loginService.findAllLogins().size());

    }
}