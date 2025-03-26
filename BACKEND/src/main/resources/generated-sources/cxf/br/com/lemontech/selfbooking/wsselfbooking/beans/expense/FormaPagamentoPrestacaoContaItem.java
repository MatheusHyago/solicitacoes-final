
package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de formaPagamentoPrestacaoContaItem.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="formaPagamentoPrestacaoContaItem"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DINHEIRO"/&gt;
 *     &lt;enumeration value="CARTAO_CREDITO"/&gt;
 *     &lt;enumeration value="CARTAO_DEBITO"/&gt;
 *     &lt;enumeration value="CARTAO_CORPORATIVO"/&gt;
 *     &lt;enumeration value="FATURADO"/&gt;
 *     &lt;enumeration value="CARTAO_RENDIMENTO"/&gt;
 *     &lt;enumeration value="RECURSO_PROPRIO"/&gt;
 *     &lt;enumeration value="DEBITO_EM_CONTA"/&gt;
 *     &lt;enumeration value="CREDITO_EM_CONTA"/&gt;
 *     &lt;enumeration value="CARTAO_PRE_PAGO"/&gt;
 *     &lt;enumeration value="PIX"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "formaPagamentoPrestacaoContaItem")
@XmlEnum
public enum FormaPagamentoPrestacaoContaItem {

    DINHEIRO,
    CARTAO_CREDITO,
    CARTAO_DEBITO,
    CARTAO_CORPORATIVO,
    FATURADO,
    CARTAO_RENDIMENTO,
    RECURSO_PROPRIO,
    DEBITO_EM_CONTA,
    CREDITO_EM_CONTA,
    CARTAO_PRE_PAGO,
    PIX;

    public String value() {
        return name();
    }

    public static FormaPagamentoPrestacaoContaItem fromValue(String v) {
        return valueOf(v);
    }

}
