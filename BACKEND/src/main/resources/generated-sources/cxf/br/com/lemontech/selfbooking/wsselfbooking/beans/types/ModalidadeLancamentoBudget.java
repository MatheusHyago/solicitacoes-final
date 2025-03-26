
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de modalidadeLancamentoBudget.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="modalidadeLancamentoBudget"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RESIDUAL"/&gt;
 *     &lt;enumeration value="MENSAL"/&gt;
 *     &lt;enumeration value="ANUAL"/&gt;
 *     &lt;enumeration value="EXTRA"/&gt;
 *     &lt;enumeration value="ACERTO"/&gt;
 *     &lt;enumeration value="ATUALIZACAO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "modalidadeLancamentoBudget")
@XmlEnum
public enum ModalidadeLancamentoBudget {

    RESIDUAL,
    MENSAL,
    ANUAL,
    EXTRA,
    ACERTO,
    ATUALIZACAO;

    public String value() {
        return name();
    }

    public static ModalidadeLancamentoBudget fromValue(String v) {
        return valueOf(v);
    }

}
