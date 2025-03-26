
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de formaPagamentoHotelConfig.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="formaPagamentoHotelConfig"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FATURADO"/&gt;
 *     &lt;enumeration value="CARTAO"/&gt;
 *     &lt;enumeration value="DIRETO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "formaPagamentoHotelConfig")
@XmlEnum
public enum FormaPagamentoHotelConfig {

    FATURADO,
    CARTAO,
    DIRETO;

    public String value() {
        return name();
    }

    public static FormaPagamentoHotelConfig fromValue(String v) {
        return valueOf(v);
    }

}
