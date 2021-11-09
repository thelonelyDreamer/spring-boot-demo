package com.felixwc.springboot.security.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * in order to learn java!
 * created at 2021/11/9 15:22
 *
 * @author wangchao
 */
@Service("userDetailsService")
public class MyUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        List<GrantedAuthority> role = AuthorityUtils.commaSeparatedStringToAuthorityList("root");
        User user = new User("root", new BCryptPasswordEncoder().encode("123"), role);
        return user;
    }
}
