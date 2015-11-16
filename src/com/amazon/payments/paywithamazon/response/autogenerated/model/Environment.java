package com.amazon.payments.paywithamazon.response.autogenerated.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
* This represents an enum class identifying the environment LIVE or SANDBOX mode.
* Sandbox mode enables you to conduct an end-to-end test of 
* your integration prior to going live.
*/
@XmlType(name = "ReleaseEnvironment")
@XmlEnum
public enum Environment {

    @XmlEnumValue("Live")
    LIVE("LIVE"),
    @XmlEnumValue("Sandbox")
    SANDBOX("SANDBOX");
    private final String value;

    Environment(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return value();
    }

    public static Environment fromValue(String v) {
        for (Environment c: Environment.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}