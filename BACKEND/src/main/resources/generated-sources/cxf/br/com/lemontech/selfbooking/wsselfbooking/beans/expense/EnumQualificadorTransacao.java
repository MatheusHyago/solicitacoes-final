
package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de enumQualificadorTransacao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="enumQualificadorTransacao"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEBITO"/&gt;
 *     &lt;enumeration value="CREDITO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "enumQualificadorTransacao")
@XmlEnum
public enum EnumQualificadorTransacao {

    DEBITO,
    CREDITO;

    public String value() {
        return name();
    }

    public static EnumQualificadorTransacao fromValue(String v) {
        return valueOf(v);
    }

}
