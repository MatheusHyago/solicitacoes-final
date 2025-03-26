
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de source.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="source"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AZUL"/&gt;
 *     &lt;enumeration value="PASSAREDO"/&gt;
 *     &lt;enumeration value="SETE"/&gt;
 *     &lt;enumeration value="PUMAAIR"/&gt;
 *     &lt;enumeration value="NHT"/&gt;
 *     &lt;enumeration value="PIQUIATUBA"/&gt;
 *     &lt;enumeration value="AVIANCA"/&gt;
 *     &lt;enumeration value="AVIANCA_V2"/&gt;
 *     &lt;enumeration value="TRAVELPORT"/&gt;
 *     &lt;enumeration value="SABRE"/&gt;
 *     &lt;enumeration value="FLYWAYS"/&gt;
 *     &lt;enumeration value="LATAM"/&gt;
 *     &lt;enumeration value="GOL_GWS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "source")
@XmlEnum
public enum Source {

    AZUL("AZUL"),
    PASSAREDO("PASSAREDO"),
    SETE("SETE"),
    PUMAAIR("PUMAAIR"),
    NHT("NHT"),
    PIQUIATUBA("PIQUIATUBA"),
    AVIANCA("AVIANCA"),
    @XmlEnumValue("AVIANCA_V2")
    AVIANCA_V_2("AVIANCA_V2"),
    TRAVELPORT("TRAVELPORT"),
    SABRE("SABRE"),
    FLYWAYS("FLYWAYS"),
    LATAM("LATAM"),
    GOL_GWS("GOL_GWS");
    private final String value;

    Source(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Source fromValue(String v) {
        for (Source c: Source.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
