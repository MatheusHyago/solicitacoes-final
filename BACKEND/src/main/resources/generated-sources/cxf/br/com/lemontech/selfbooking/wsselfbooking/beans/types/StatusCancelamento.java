
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de statusCancelamento.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="statusCancelamento"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="REEMBOLSO"/&gt;
 *     &lt;enumeration value="CREDITO_CIA"/&gt;
 *     &lt;enumeration value="EM_ABERTO"/&gt;
 *     &lt;enumeration value="NO_SHOW"/&gt;
 *     &lt;enumeration value="TAXA_CANCELAMENTO"/&gt;
 *     &lt;enumeration value="NAO_REEMBOLSAVEL"/&gt;
 *     &lt;enumeration value="SEM_CREDITO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusCancelamento")
@XmlEnum
public enum StatusCancelamento {

    REEMBOLSO,
    CREDITO_CIA,
    EM_ABERTO,
    NO_SHOW,
    TAXA_CANCELAMENTO,
    NAO_REEMBOLSAVEL,
    SEM_CREDITO;

    public String value() {
        return name();
    }

    public static StatusCancelamento fromValue(String v) {
        return valueOf(v);
    }

}
