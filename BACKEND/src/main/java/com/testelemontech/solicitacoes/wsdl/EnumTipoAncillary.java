
package com.testelemontech.solicitacoes.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de enumTipoAncillary.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="enumTipoAncillary"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BAGAGEM"/&gt;
 *     &lt;enumeration value="ASSENTO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumTipoAncillary", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum EnumTipoAncillary {

    BAGAGEM,
    ASSENTO;

    public String value() {
        return name();
    }

    public static EnumTipoAncillary fromValue(String v) {
        return valueOf(v);
    }

}
