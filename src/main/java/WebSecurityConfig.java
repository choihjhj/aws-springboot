//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http
//                .authorizeRequests()
//                .antMatchers(
//                        "/h2-console/**"
//                ).permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .csrf()
//                .ignoringAntMatchers("/h2-console/**")
//                .and().headers().frameOptions().sameOrigin()  // 여기!
//                .and()
//                .formLogin()
//                .loginPage("어쩌구")
//                .defaultSuccessUrl("저쩌구")
//                .permitAll()
//                .and()
//                .logout()
//                .logoutSuccessUrl("얼씨구")
//                .permitAll();
//    }
//}