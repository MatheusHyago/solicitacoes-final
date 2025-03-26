
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de regime.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="regime"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CAFE_DA_MANHA"/&gt;
 *     &lt;enumeration value="MEIA_PENSAO"/&gt;
 *     &lt;enumeration value="PENSAO_COMPLETA"/&gt;
 *     &lt;enumeration value="ALL_INCLUSIVE"/&gt;
 *     &lt;enumeration value="SO_HOSPEDAGEM"/&gt;
 *     &lt;enumeration value="JANTAR"/&gt;
 *     &lt;enumeration value="NAO_INCLUI"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "regime")
@XmlEnum
public enum Regime {

    CAFE_DA_MANHA,
    MEIA_PENSAO,
    PENSAO_COMPLETA,
    ALL_INCLUSIVE,
    SO_HOSPEDAGEM,
    JANTAR,
    NAO_INCLUI;

    public String value() {
        return name();
    }

    public static Regime fromValue(String v) {
        return valueOf(v);
    }

}
