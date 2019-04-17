/*
 * 版权所有.(c)2008-2017. 卡尔科技工作室
 */

package com.carl.auth.sso.rest.client.config;

import com.carl.auth.sso.rest.client.bean.SysUser;
import com.carl.auth.sso.rest.client.service.UserRepertory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



/**
 * @author JameYe
 * @date 2019/04/17
 * @since JDK1.8
 */
@Configuration
public class ApplicationConfig {
    @Bean
    public UserRepertory userRepertory() {
        SysUser admin = new SysUser().setUsername("admin").setPassword("202cb962ac59075b964b07152d234b70").addAttribute("key", "keyVal");
        SysUser test = new SysUser().setUsername("rest-test").setPassword("21232f297a57a5a743894a0e4a801fc3").addAttribute("test", "testVal");
        SysUser locked = new SysUser().setUsername("rest-locked").setPassword("21232f297a57a5a743894a0e4a801fc3").setLocked(true);
        SysUser disable = new SysUser().setUsername("rest-disable").setPassword("21232f297a57a5a743894a0e4a801fc3").setDisable(true);
        SysUser expired = new SysUser().setUsername("rest-expired").setPassword("21232f297a57a5a743894a0e4a801fc3").setExpired(true);
        return new UserRepertory(admin, test, locked, disable, expired);
    }
}
