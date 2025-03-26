
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de localAssentoRodoviario.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="localAssentoRodoviario"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="JANELA"/&gt;
 *     &lt;enumeration value="CORREDOR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "localAssentoRodoviario")
@XmlEnum
public enum LocalAssentoRodoviario {

    JANELA,
    CORREDOR;

    public String value() {
        return name();
    }

    public static LocalAssentoRodoviario fromValue(String v) {
        return valueOf(v);
    }

}
