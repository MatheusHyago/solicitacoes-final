
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de bandeiraCartao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="bandeiraCartao"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VISA"/&gt;
 *     &lt;enumeration value="MASTERCARD"/&gt;
 *     &lt;enumeration value="AMEX"/&gt;
 *     &lt;enumeration value="HIPER_CARD"/&gt;
 *     &lt;enumeration value="DINERS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "bandeiraCartao")
@XmlEnum
public enum BandeiraCartao {

    VISA,
    MASTERCARD,
    AMEX,
    HIPER_CARD,
    DINERS;

    public String value() {
        return name();
    }

    public static BandeiraCartao fromValue(String v) {
        return valueOf(v);
    }

}
