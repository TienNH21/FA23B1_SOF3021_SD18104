package com.example.demo.config;

import com.example.demo.requests.NhanVienRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DemoBeanConfig
{
    @Bean("TuanPV")
    public NhanVienRequest getBean1() {
//        NhanVienRequest r = new NhanVienRequest("PH20430", 0, "Phạm", "Văn", "Tuân", 1, "01/01/2003", "HN", "0123123123");
        NhanVienRequest r = new NhanVienRequest();
        return r;
    }

    @Bean("HoangPH")
    public NhanVienRequest getBean2() {
        NhanVienRequest r = new NhanVienRequest();
        return r;
    }
}
