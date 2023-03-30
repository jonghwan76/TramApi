package com.hmit.tram.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TomcatWebServerCustomizer
        implements WebServerFactoryCustomizer<TomcatServletWebServerFactory> {

    /**
     * 톰캣에 옵션 추가.
     *
     * @param factory
     */
    @Override
    public void customize(TomcatServletWebServerFactory factory) {
        factory.addConnectorCustomizers(connector -> connector.setAttribute("relaxedQueryChars", "<>[\\]^`{|}"));
        factory.addConnectorCustomizers(connector -> connector.setAttribute("relaxedPathChars", "<>[\\]^`{|}"));
    }
}