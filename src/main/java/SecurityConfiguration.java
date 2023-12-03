//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@EnableWebSecurity
//@Configuration
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//    @Bean
//    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests((authorizeHttpRequests) -> authorizeHttpRequests
//                        .requestMatchers(new AntPathRequestMatcher("/**")).permitAll())
//        ;
//        return http.build();
//    }
////    @Override
////    protected void configure(HttpSecurity http) throws Exception{
////        http
////                .authorizeRequests()
////                .antMatchers("/","/**").access("permitAll")
////                .antMatchers("/h2-console/**").permitAll() // 추가
////                .and()
////                .csrf() // 추가
////                .ignoringAntMatchers("/h2-console/**").disable() // 추가
////                .httpBasic();
////    }
////
////
////    // Security 무시하기
////    public void configure(WebSecurity web)throws Exception{
////        web.ignoring().antMatchers("/h2-console/**");
////    }
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////
////        http.authorizeRequests().antMatchers("/h2-console/*").permitAll();
////
////        http.csrf().disable();
////
////        http.headers().frameOptions().disable();
////    }
////
////    @Bean
////    @ConditionalOnProperty(name = "spring.h2.console.enabled",havingValue = "true")
////    public WebSecurityCustomizer configureH2ConsoleEnable() {
////        return web -> web.ignoring()
////                .requestMatchers(PathRequest.toH2Console());
////    }
//
//}
