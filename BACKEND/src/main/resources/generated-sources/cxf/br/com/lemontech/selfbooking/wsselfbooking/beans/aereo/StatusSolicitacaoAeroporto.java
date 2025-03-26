
package br.com.lemontech.selfbooking.wsselfbooking.beans.aereo;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de statusSolicitacaoAeroporto.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="statusSolicitacaoAeroporto"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PENDENTE"/&gt;
 *     &lt;enumeration value="NO_SHOW"/&gt;
 *     &lt;enumeration value="CANCELADO"/&gt;
 *     &lt;enumeration value="FINALIZADO"/&gt;
 *     &lt;enumeration value="TERCEIRO"/&gt;
 *     &lt;enumeration value="SOLICITACAO_SALVA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusSolicitacaoAeroporto")
@XmlEnum
public enum StatusSolicitacaoAeroporto {

    PENDENTE,
    NO_SHOW,
    CANCELADO,
    FINALIZADO,
    TERCEIRO,
    SOLICITACAO_SALVA;

    public String value() {
        return name();
    }

    public static StatusSolicitacaoAeroporto fromValue(String v) {
        return valueOf(v);
    }

}
