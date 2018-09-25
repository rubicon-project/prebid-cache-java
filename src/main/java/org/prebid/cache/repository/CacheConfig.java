package org.prebid.cache.repository;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Configuration
@ConfigurationProperties(prefix="cache")
public class CacheConfig {
    private String prefix;
    private long expirySec;
    private int timeoutMs;
    private long minExpiry;
    private long maxExpiry;
    private List<String> secondaryIps;
    private String secondaryCacheScheme;
    private int secondaryCachePort;
}

