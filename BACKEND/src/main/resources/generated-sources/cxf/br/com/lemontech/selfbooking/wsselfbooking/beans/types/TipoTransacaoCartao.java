
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoTransacaoCartao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="tipoTransacaoCartao"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="CC"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="RC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoTransacaoCartao")
@XmlEnum
public enum TipoTransacaoCartao {

    D,
    CC,
    C,
    RC;

    public String value() {
        return name();
    }

    public static TipoTransacaoCartao fromValue(String v) {
        return valueOf(v);
    }

}
