package security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity // 스프링 Security 지원을 가능하게 함
public class WebSecurityConfig {

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        // h2-console 사용에 대한 허용 (CSRF, FrameOptions 무시)
        return (web) -> web.ignoring()
                .antMatchers("/h2-console/**");
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.csrf().disable(); //CSRF Token 비활성화 // 구글링 추가
        // 회원 관리 처리 API (POST /user/**) 에 대해 CSRF 무시
//        http.csrf()
//                .ignoringAntMatchers("/user/**");

        http
                .authorizeHttpRequests((authz) -> authz
                        .antMatchers("/h2-console/**").permitAll()  // 구글링 추가
                        // image 폴더를 login 없이 허용
                        .antMatchers("/images/**").permitAll()
                        // css 폴더를 login 없이 허용
                        .antMatchers("/css/**").permitAll()
                        // 회원 관리 처리 API 전부를 login 없이 허용
                        .antMatchers("/user/**").permitAll()
                        // 어떤 요청이든 '인증'
                        .anyRequest().authenticated()
                )
                // 로그인 기능 허용
                .formLogin()
                .loginPage("/user/login")
                .defaultSuccessUrl("/")
                .failureUrl("/user/login?error")
                .permitAll()
                .and()
                //로그아웃 기능 허용
                .logout()
                .permitAll();

        return http.build();
    }
}