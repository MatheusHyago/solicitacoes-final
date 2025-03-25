
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoCredito.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="tipoCredito"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEPOSITO"/&gt;
 *     &lt;enumeration value="CARTAO_CREDITO"/&gt;
 *     &lt;enumeration value="ESPECIE"/&gt;
 *     &lt;enumeration value="MISTO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoCredito")
@XmlEnum
public enum TipoCredito {

    DEPOSITO,
    CARTAO_CREDITO,
    ESPECIE,
    MISTO;

    public String value() {
        return name();
    }

    public static TipoCredito fromValue(String v) {
        return valueOf(v);
    }

}
