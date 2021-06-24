package taxi.service;

import java.util.Optional;
import taxi.lib.Injector;
import taxi.lib.Service;
import taxi.lib.exception.AuthenticationException;
import taxi.model.Driver;
import taxi.util.HashUtil;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Injector injector = Injector.getInstance("taxi");
    private final DriverService driverService = (DriverService) injector
            .getInstance(DriverService.class);

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driverFromDB = driverService.findByLogin(login);
        if (driverFromDB.isPresent() && matchPasswords(password, driverFromDB.get())) {
            return driverFromDB.get();
        }
        throw new AuthenticationException("Login or password is incorrect");
    }

    private boolean matchPasswords(String rawPassword, Driver driverFromDB) {
        String hashedPassword = HashUtil.hashPassword(rawPassword, driverFromDB.getSalt());
        return hashedPassword.equals(driverFromDB.getPassword());
    }
}
