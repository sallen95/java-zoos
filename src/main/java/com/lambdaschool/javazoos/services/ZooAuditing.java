package com.lambdaschool.javazoos.services;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ZooAuditing implements AuditorAware<String>
{
    @Override
    public Optional<String> getCurrentAuditor()
    {
        String zname = "SYSTEM";
        return Optional.of(zname);
    }
}
