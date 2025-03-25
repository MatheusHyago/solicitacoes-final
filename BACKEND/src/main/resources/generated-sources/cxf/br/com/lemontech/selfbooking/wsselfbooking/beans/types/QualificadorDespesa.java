
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de qualificadorDespesa.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="qualificadorDespesa"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CARTAO_CREDITO"/&gt;
 *     &lt;enumeration value="UBER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "qualificadorDespesa")
@XmlEnum
public enum QualificadorDespesa {

    CARTAO_CREDITO,
    UBER;

    public String value() {
        return name();
    }

    public static QualificadorDespesa fromValue(String v) {
        return valueOf(v);
    }

}
