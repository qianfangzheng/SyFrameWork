package org.sy.config.oss;

import org.sy.common.util.oss.OssBootUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OssBootConfiguration {

    @Value("${sy.oss.endpoint}")
    private String endpoint;
    @Value("${sy.oss.accessKey}")
    private String accessKeyId;
    @Value("${sy.oss.secretKey}")
    private String accessKeySecret;
    @Value("${sy.oss.bucketName}")
    private String bucketName;
    @Value("${sy.oss.staticDomain}")
    private String staticDomain;


    @Bean
    public void initOssBootConfiguration() {
        OssBootUtil.setEndPoint(endpoint);
        OssBootUtil.setAccessKeyId(accessKeyId);
        OssBootUtil.setAccessKeySecret(accessKeySecret);
        OssBootUtil.setBucketName(bucketName);
        OssBootUtil.setStaticDomain(staticDomain);
    }
}