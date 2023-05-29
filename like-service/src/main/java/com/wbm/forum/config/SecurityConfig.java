package com.wbm.forum.config;


/**
 * @Author：Ming
 * @Date: 2022/11/9 20:14
 */
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private JwtFilter jwtFilter;
//    @Autowired
//    private AuthenticationEntryPoint authenticationEntryPoint;
//    @Autowired
//    private AccessDeniedHandler accessDeniedHandler;
//
//    @Bean
//    @Override
//    protected AuthenticationManager authenticationManager() throws Exception {
//        return super.authenticationManager();
//    }
//
//    @Bean
//    PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/","/login").anonymous()
//                .antMatchers("/image/**","/logout","/checkVerify/{verifyCode}/{uuid}","/verifyCode","/img/upload",
//                        "/email/**", "/user/forget/**","/user/register").permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .csrf()
//                .disable()
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                .rememberMe()
//                .and().cors().configurationSource(corsConfigurationSource());
//        http
//                .logout().disable();
//        //添加过滤器
//        http.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);
//
//        //配置异常处理器
//        http.exceptionHandling()
//                .authenticationEntryPoint(authenticationEntryPoint)
//                .accessDeniedHandler(accessDeniedHandler);
//    }
//    //跨域
//    CorsConfigurationSource corsConfigurationSource(){
//        CorsConfiguration corsConfiguration = new CorsConfiguration();
//        corsConfiguration.setAllowedHeaders(Arrays.asList("*"));
//        corsConfiguration.setAllowedMethods(Arrays.asList("*"));
//        corsConfiguration.setAllowedOrigins(Arrays.asList("*"));
//        corsConfiguration.setMaxAge(3600L);
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**",corsConfiguration);
//        return source;
//    }
//
//}
