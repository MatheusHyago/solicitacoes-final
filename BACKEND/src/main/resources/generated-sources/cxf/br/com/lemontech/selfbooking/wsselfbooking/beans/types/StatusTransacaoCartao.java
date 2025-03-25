
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de statusTransacaoCartao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="statusTransacaoCartao"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONCILIADO_AUTOMATICAMENTE"/&gt;
 *     &lt;enumeration value="CONCILIADO_MANUALMENTE"/&gt;
 *     &lt;enumeration value="INCONSISTENTE"/&gt;
 *     &lt;enumeration value="NAO_CONCILIADO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "statusTransacaoCartao")
@XmlEnum
public enum StatusTransacaoCartao {

    CONCILIADO_AUTOMATICAMENTE,
    CONCILIADO_MANUALMENTE,
    INCONSISTENTE,
    NAO_CONCILIADO;

    public String value() {
        return name();
    }

    public static StatusTransacaoCartao fromValue(String v) {
        return valueOf(v);
    }

}
