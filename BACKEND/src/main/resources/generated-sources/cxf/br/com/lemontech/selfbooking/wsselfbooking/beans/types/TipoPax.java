
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoPax.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="tipoPax"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADT"/&gt;
 *     &lt;enumeration value="CHD"/&gt;
 *     &lt;enumeration value="INF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoPax")
@XmlEnum
public enum TipoPax {

    ADT,
    CHD,
    INF;

    public String value() {
        return name();
    }

    public static TipoPax fromValue(String v) {
        return valueOf(v);
    }

}
