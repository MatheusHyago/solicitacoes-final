
package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de enumTipoCartao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="enumTipoCartao"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CTH"/&gt;
 *     &lt;enumeration value="CTA"/&gt;
 *     &lt;enumeration value="CORPORATIVO"/&gt;
 *     &lt;enumeration value="CARTAO_COMPRAS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumTipoCartao")
@XmlEnum
public enum EnumTipoCartao {

    CTH,
    CTA,
    CORPORATIVO,
    CARTAO_COMPRAS;

    public String value() {
        return name();
    }

    public static EnumTipoCartao fromValue(String v) {
        return valueOf(v);
    }

}
