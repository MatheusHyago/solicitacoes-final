
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de acaoMetodo.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="acaoMetodo"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INSERT"/&gt;
 *     &lt;enumeration value="UPDATE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "acaoMetodo")
@XmlEnum
public enum AcaoMetodo {

    INSERT,
    UPDATE;

    public String value() {
        return name();
    }

    public static AcaoMetodo fromValue(String v) {
        return valueOf(v);
    }

}
