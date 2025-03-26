
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de agente.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="agente"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LEMONTECH"/&gt;
 *     &lt;enumeration value="AGENCIA"/&gt;
 *     &lt;enumeration value="CLIENTE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "agente")
@XmlEnum
public enum Agente {

    LEMONTECH,
    AGENCIA,
    CLIENTE;

    public String value() {
        return name();
    }

    public static Agente fromValue(String v) {
        return valueOf(v);
    }

}
