
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de enumTipoFormaPagamento.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="enumTipoFormaPagamento"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BILHETE"/&gt;
 *     &lt;enumeration value="EMD_MULTA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumTipoFormaPagamento")
@XmlEnum
public enum EnumTipoFormaPagamento {

    BILHETE,
    EMD_MULTA;

    public String value() {
        return name();
    }

    public static EnumTipoFormaPagamento fromValue(String v) {
        return valueOf(v);
    }

}
