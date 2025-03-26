
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de perfilAereo.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="perfilAereo"&gt;
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
@XmlType(name = "perfilAereo")
@XmlEnum
public enum PerfilAereo {

    ECONOMICA,
    EXECUTIVA,
    PRIMEIRA_CLASSE,
    ECONOMICA_PLUS;

    public String value() {
        return name();
    }

    public static PerfilAereo fromValue(String v) {
        return valueOf(v);
    }

}
