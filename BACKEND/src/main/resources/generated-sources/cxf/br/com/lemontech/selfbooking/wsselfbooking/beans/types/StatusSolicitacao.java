
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de statusSolicitacao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="statusSolicitacao"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONCLUIDA"/&gt;
 *     &lt;enumeration value="CANCELADA"/&gt;
 *     &lt;enumeration value="PENDENTE_APROVACAO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusSolicitacao")
@XmlEnum
public enum StatusSolicitacao {

    CONCLUIDA,
    CANCELADA,
    PENDENTE_APROVACAO;

    public String value() {
        return name();
    }

    public static StatusSolicitacao fromValue(String v) {
        return valueOf(v);
    }

}
