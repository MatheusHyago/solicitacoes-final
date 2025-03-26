
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoOperacaoBudget.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="tipoOperacaoBudget"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CREDITO"/&gt;
 *     &lt;enumeration value="DEBITO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoOperacaoBudget")
@XmlEnum
public enum TipoOperacaoBudget {

    CREDITO,
    DEBITO;

    public String value() {
        return name();
    }

    public static TipoOperacaoBudget fromValue(String v) {
        return valueOf(v);
    }

}
