
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de preferenciaAssentoRodoviario.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="preferenciaAssentoRodoviario"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FRENTE"/&gt;
 *     &lt;enumeration value="MEIO"/&gt;
 *     &lt;enumeration value="FUNDO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "preferenciaAssentoRodoviario")
@XmlEnum
public enum PreferenciaAssentoRodoviario {

    FRENTE,
    MEIO,
    FUNDO;

    public String value() {
        return name();
    }

    public static PreferenciaAssentoRodoviario fromValue(String v) {
        return valueOf(v);
    }

}
