
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de opcaoAtendimento.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="opcaoAtendimento"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PADRAO"/&gt;
 *     &lt;enumeration value="VIP"/&gt;
 *     &lt;enumeration value="EXTRA_ATENDIMENTO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "opcaoAtendimento")
@XmlEnum
public enum OpcaoAtendimento {

    PADRAO,
    VIP,
    EXTRA_ATENDIMENTO;

    public String value() {
        return name();
    }

    public static OpcaoAtendimento fromValue(String v) {
        return valueOf(v);
    }

}
