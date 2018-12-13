package com.jarek.sevice;

import com.jarek.model.User;
import com.jarek.repo.UserRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.logging.Logger;

@Service
@Transactional(readOnly = true)
public class UserService implements UserDetailsService {

    private static final Logger LOGGER = Logger.getLogger(UserService.class.getName());

    //    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        LOGGER.info("Szukasz usera " + s);
        User user = userRepository.findByUsername(s);

        if (user == null) {
            throw new UsernameNotFoundException(s);
        }

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), Arrays.asList(new SimpleGrantedAuthority("ROLE_USER")));
    }
}
