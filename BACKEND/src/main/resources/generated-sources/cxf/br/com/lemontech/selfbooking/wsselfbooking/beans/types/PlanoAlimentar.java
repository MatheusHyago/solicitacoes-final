
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de planoAlimentar.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="planoAlimentar"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CAFE_DA_MANHA"/&gt;
 *     &lt;enumeration value="MEIA_PENSAO"/&gt;
 *     &lt;enumeration value="PENSAO_COMPLETA"/&gt;
 *     &lt;enumeration value="JANTAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "planoAlimentar")
@XmlEnum
public enum PlanoAlimentar {

    CAFE_DA_MANHA,
    MEIA_PENSAO,
    PENSAO_COMPLETA,
    JANTAR;

    public String value() {
        return name();
    }

    public static PlanoAlimentar fromValue(String v) {
        return valueOf(v);
    }

}
