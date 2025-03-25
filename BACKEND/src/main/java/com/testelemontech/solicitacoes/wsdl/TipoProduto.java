
package com.testelemontech.solicitacoes.wsdl;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoProduto.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="tipoProduto"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AEREO"/&gt;
 *     &lt;enumeration value="HOTEL"/&gt;
 *     &lt;enumeration value="CARRO"/&gt;
 *     &lt;enumeration value="OUTRO"/&gt;
 *     &lt;enumeration value="SEGURO"/&gt;
 *     &lt;enumeration value="TRASLADO"/&gt;
 *     &lt;enumeration value="RODOVIARIO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoProduto", namespace = "http://lemontech.com.br/selfbooking/wsselfbooking/beans/types")
@XmlEnum
public enum TipoProduto {

    AEREO,
    HOTEL,
    CARRO,
    OUTRO,
    SEGURO,
    TRASLADO,
    RODOVIARIO;

    public String value() {
        return name();
    }

    public static TipoProduto fromValue(String v) {
        return valueOf(v);
    }

}
