
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoViagem.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="tipoViagem"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TODOS"/&gt;
 *     &lt;enumeration value="NACIONAL"/&gt;
 *     &lt;enumeration value="CONTINENTAL"/&gt;
 *     &lt;enumeration value="INTERNACIONAL"/&gt;
 *     &lt;enumeration value="INTERCONTINENTAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoViagem")
@XmlEnum
public enum TipoViagem {

    TODOS,
    NACIONAL,
    CONTINENTAL,
    INTERNACIONAL,
    INTERCONTINENTAL;

    public String value() {
        return name();
    }

    public static TipoViagem fromValue(String v) {
        return valueOf(v);
    }

}
