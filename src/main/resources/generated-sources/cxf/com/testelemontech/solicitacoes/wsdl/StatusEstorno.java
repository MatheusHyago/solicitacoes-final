
package com.testelemontech.solicitacoes.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de statusEstorno.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="statusEstorno"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PENDENTE"/&gt;
 *     &lt;enumeration value="ESTORNADO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusEstorno", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense")
@XmlEnum
public enum StatusEstorno {

    PENDENTE,
    ESTORNADO;

    public String value() {
        return name();
    }

    public static StatusEstorno fromValue(String v) {
        return valueOf(v);
    }

}
