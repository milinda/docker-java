package com.kpelykh.docker.client.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
  * @author <a href="mailto:nicolas.deloof@gmail.com">Nicolas De Loof</a>
  */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Port {

    @JsonProperty("IP")
    private String ip;

    @JsonProperty("PrivatePort")
    private long privatePort;

    @JsonProperty("PublicPort")
    private long publicPort;

    @JsonProperty("Type")
    private String type;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public long getPrivatePort() {
        return privatePort;
    }

    public void setPrivatePort(long privatePort) {
        this.privatePort = privatePort;
    }

    public long getPublicPort() {
        return publicPort;
    }

    public void setPublicPort(long publicPort) {
        this.publicPort = publicPort;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Port{" +
                "IP=" + ip +
                "privatePort=" + privatePort +
                ", publicPort=" + publicPort +
                ", type='" + type + '\'' +
                '}';
    }
}