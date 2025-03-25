
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de presacaoContasStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="presacaoContasStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PENDENTE"/&gt;
 *     &lt;enumeration value="APROVADO"/&gt;
 *     &lt;enumeration value="REPROVADO"/&gt;
 *     &lt;enumeration value="AUTORIZACAO"/&gt;
 *     &lt;enumeration value="PENDENCIA_APROVADOR"/&gt;
 *     &lt;enumeration value="CANCELADO"/&gt;
 *     &lt;enumeration value="RETORNOU_SOLICITANTE"/&gt;
 *     &lt;enumeration value="REDIRECIONADA"/&gt;
 *     &lt;enumeration value="ITEM_ESTORNADO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "presacaoContasStatus")
@XmlEnum
public enum PresacaoContasStatus {

    PENDENTE,
    APROVADO,
    REPROVADO,
    AUTORIZACAO,
    PENDENCIA_APROVADOR,
    CANCELADO,
    RETORNOU_SOLICITANTE,
    REDIRECIONADA,
    ITEM_ESTORNADO;

    public String value() {
        return name();
    }

    public static PresacaoContasStatus fromValue(String v) {
        return valueOf(v);
    }

}
