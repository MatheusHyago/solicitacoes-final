
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoColetaMulta.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="tipoColetaMulta"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DOCUMENTO"/&gt;
 *     &lt;enumeration value="TAXA"/&gt;
 *     &lt;enumeration value="TOTAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoColetaMulta")
@XmlEnum
public enum TipoColetaMulta {

    DOCUMENTO,
    TAXA,
    TOTAL;

    public String value() {
        return name();
    }

    public static TipoColetaMulta fromValue(String v) {
        return valueOf(v);
    }

}
