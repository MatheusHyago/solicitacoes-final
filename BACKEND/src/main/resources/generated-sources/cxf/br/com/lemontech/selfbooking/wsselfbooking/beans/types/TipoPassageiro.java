
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoPassageiro.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="tipoPassageiro"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TODOS"/&gt;
 *     &lt;enumeration value="PASSAGEIRO"/&gt;
 *     &lt;enumeration value="TERCEIRO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tipoPassageiro")
@XmlEnum
public enum TipoPassageiro {

    TODOS,
    PASSAGEIRO,
    TERCEIRO;

    public String value() {
        return name();
    }

    public static TipoPassageiro fromValue(String v) {
        return valueOf(v);
    }

}
