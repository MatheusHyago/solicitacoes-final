
package com.testelemontech.solicitacoes.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de sexo.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="sexo"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FEMININO"/&gt;
 *     &lt;enumeration value="MASCULINO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "sexo", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum Sexo {

    FEMININO,
    MASCULINO;

    public String value() {
        return name();
    }

    public static Sexo fromValue(String v) {
        return valueOf(v);
    }

}
