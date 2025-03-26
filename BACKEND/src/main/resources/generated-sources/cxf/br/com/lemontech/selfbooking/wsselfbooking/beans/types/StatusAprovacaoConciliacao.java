
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de statusAprovacaoConciliacao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="statusAprovacaoConciliacao"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PENDENTE_CONCILIACAO_MANUAL"/&gt;
 *     &lt;enumeration value="PENDENTE_APROVACAO"/&gt;
 *     &lt;enumeration value="APROVADA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusAprovacaoConciliacao")
@XmlEnum
public enum StatusAprovacaoConciliacao {

    PENDENTE_CONCILIACAO_MANUAL,
    PENDENTE_APROVACAO,
    APROVADA;

    public String value() {
        return name();
    }

    public static StatusAprovacaoConciliacao fromValue(String v) {
        return valueOf(v);
    }

}
