
package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de enumRelatorioDespesasItemStatus.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="enumRelatorioDespesasItemStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="APROVADO"/&gt;
 *     &lt;enumeration value="REPROVADO"/&gt;
 *     &lt;enumeration value="CORRIGIDO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumRelatorioDespesasItemStatus")
@XmlEnum
public enum EnumRelatorioDespesasItemStatus {

    APROVADO,
    REPROVADO,
    CORRIGIDO;

    public String value() {
        return name();
    }

    public static EnumRelatorioDespesasItemStatus fromValue(String v) {
        return valueOf(v);
    }

}
