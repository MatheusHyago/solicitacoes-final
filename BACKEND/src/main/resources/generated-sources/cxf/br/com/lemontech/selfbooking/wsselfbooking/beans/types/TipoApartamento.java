
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoApartamento.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="tipoApartamento"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INDIVIDUAL"/&gt;
 *     &lt;enumeration value="DUPLO"/&gt;
 *     &lt;enumeration value="TRIPLO"/&gt;
 *     &lt;enumeration value="QUADRUPLO"/&gt;
 *     &lt;enumeration value="TWIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoApartamento")
@XmlEnum
public enum TipoApartamento {

    INDIVIDUAL,
    DUPLO,
    TRIPLO,
    QUADRUPLO,
    TWIN;

    public String value() {
        return name();
    }

    public static TipoApartamento fromValue(String v) {
        return valueOf(v);
    }

}
