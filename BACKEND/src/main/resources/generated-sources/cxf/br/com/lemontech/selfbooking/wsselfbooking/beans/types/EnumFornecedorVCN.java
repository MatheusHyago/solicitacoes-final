
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de enumFornecedorVCN.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="enumFornecedorVCN"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WEX"/&gt;
 *     &lt;enumeration value="CONFERMA"/&gt;
 *     &lt;enumeration value="B2BPAY"/&gt;
 *     &lt;enumeration value="BRADESCOVCN"/&gt;
 *     &lt;enumeration value="BEE2PAY"/&gt;
 *     &lt;enumeration value="JAZZVCN"/&gt;
 *     &lt;enumeration value="BEE2PAY_V2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumFornecedorVCN")
@XmlEnum
public enum EnumFornecedorVCN {

    WEX("WEX"),
    CONFERMA("CONFERMA"),
    @XmlEnumValue("B2BPAY")
    B_2_BPAY("B2BPAY"),
    BRADESCOVCN("BRADESCOVCN"),
    @XmlEnumValue("BEE2PAY")
    BEE_2_PAY("BEE2PAY"),
    JAZZVCN("JAZZVCN"),
    @XmlEnumValue("BEE2PAY_V2")
    BEE_2_PAY_V_2("BEE2PAY_V2");
    private final String value;

    EnumFornecedorVCN(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumFornecedorVCN fromValue(String v) {
        for (EnumFornecedorVCN c: EnumFornecedorVCN.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
