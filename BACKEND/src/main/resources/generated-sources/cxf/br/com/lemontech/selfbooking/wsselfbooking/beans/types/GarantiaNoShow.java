
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de garantiaNoShow.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="garantiaNoShow"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GARANTIA_AGENCIA"/&gt;
 *     &lt;enumeration value="GARANTIA_CARTAO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "garantiaNoShow")
@XmlEnum
public enum GarantiaNoShow {

    GARANTIA_AGENCIA,
    GARANTIA_CARTAO;

    public String value() {
        return name();
    }

    public static GarantiaNoShow fromValue(String v) {
        return valueOf(v);
    }

}
