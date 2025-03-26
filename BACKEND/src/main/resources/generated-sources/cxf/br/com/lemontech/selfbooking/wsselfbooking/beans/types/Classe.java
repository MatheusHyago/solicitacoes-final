
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de classe.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="classe"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ECONOMICA"/&gt;
 *     &lt;enumeration value="EXECUTIVA"/&gt;
 *     &lt;enumeration value="PRIMEIRA_CLASSE"/&gt;
 *     &lt;enumeration value="ECONOMICA_PLUS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "classe")
@XmlEnum
public enum Classe {

    ECONOMICA,
    EXECUTIVA,
    PRIMEIRA_CLASSE,
    ECONOMICA_PLUS;

    public String value() {
        return name();
    }

    public static Classe fromValue(String v) {
        return valueOf(v);
    }

}
