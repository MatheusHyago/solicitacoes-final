
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de adiantamentoStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="adiantamentoStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PENDENTE"/&gt;
 *     &lt;enumeration value="LIBERADO"/&gt;
 *     &lt;enumeration value="CANCELADO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "adiantamentoStatus")
@XmlEnum
public enum AdiantamentoStatus {

    PENDENTE,
    LIBERADO,
    CANCELADO;

    public String value() {
        return name();
    }

    public static AdiantamentoStatus fromValue(String v) {
        return valueOf(v);
    }

}
