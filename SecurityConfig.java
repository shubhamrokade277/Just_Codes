
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
            .withUser("admin").password("{noop}adminpass").roles("ADMIN")
            .and()
            .withUser("instructor").password("{noop}instructorpass").roles("INSTRUCTOR");

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
            .antMatchers("/admin/**").hasRole("ADMIN")
            .antMatchers("/user/**").hasAnyRole("USER", "ADMIN")
            .anyRequest().authenticated()
            .and()
            .formLogin()
            .permitAll()
            .and()
            .logout()
            .permitAll();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
/* 
This code is a Spring Security configuration that manages user authentication and authorization. Here's an explanation of each section:

1. @Configuration and @EnableWebSecurity
@Configuration: Indicates that this class contains Spring configuration. It is a signal that Spring should process this class to configure security settings.
@EnableWebSecurity: Enables Spring Security for the application, activating the security configuration defined in this class.
2. Extending WebSecurityConfigurerAdapter
This class extends WebSecurityConfigurerAdapter, which allows customization of Spring Security's default security configuration.
3. configure(AuthenticationManagerBuilder auth)
This method sets up in-memory authentication. It defines users and their roles directly in the code.

auth.inMemoryAuthentication(): Configures Spring Security to use in-memory authentication (no database or external authentication).
withUser("admin"): Defines a user with the username "admin".
password("{noop}adminpass"): Specifies the password for the user "admin" as "adminpass". The {noop} prefix means that no encoding is applied to the password (plain text).
roles("ADMIN"): Assigns the role "ADMIN" to this user.
Similarly, the user "instructor" is added with the password "instructorpass" and the role "INSTRUCTOR".
4. configure(HttpSecurity http)
This method configures HTTP security, defining which URLs are accessible by which roles.

http.authorizeRequests(): Starts the configuration of authorization rules.
antMatchers("/admin/**").hasRole("ADMIN"): Restricts access to any URL starting with /admin/ to users with the role "ADMIN".
antMatchers("/user/**").hasAnyRole("USER", "ADMIN"): Grants access to URLs starting with /user/ to users with either the "USER" or "ADMIN" role.
anyRequest().authenticated(): Requires authentication for any other request.
formLogin().permitAll(): Enables form-based login and allows all users to access the login page.
logout().permitAll(): Enables the logout functionality, accessible to all users.
5. @Bean Password Encoding
@Bean public PasswordEncoder passwordEncoder(): Defines a bean for password encoding. In this case, it returns an instance of BCryptPasswordEncoder, which is a widely used password hashing algorithm.
However, note that the passwords are defined with {noop}, meaning no encoding is applied in this example, so the BCryptPasswordEncoder is not actually used for the in-memory users.

Key Points:
Role-based access control is configured using antMatchers to restrict access to specific URLs.
Form-based authentication is enabled, and users can log in using a simple login form.
Logout functionality is also enabled, allowing users to log out easily.
Password encoding with BCryptPasswordEncoder is declared but not used in this specific example due to {noop} for the in-memory users.
*/