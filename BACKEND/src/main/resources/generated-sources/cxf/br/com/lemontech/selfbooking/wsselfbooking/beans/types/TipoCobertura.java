
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoCobertura.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="tipoCobertura"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="COBERTURA"/&gt;
 *     &lt;enumeration value="ASSISTENCIA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoCobertura")
@XmlEnum
public enum TipoCobertura {

    COBERTURA,
    ASSISTENCIA;

    public String value() {
        return name();
    }

    public static TipoCobertura fromValue(String v) {
        return valueOf(v);
    }

}
