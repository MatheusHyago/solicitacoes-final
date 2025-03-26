
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de classeRodoviario.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="classeRodoviario"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PRIMEIRA_CLASSE"/&gt;
 *     &lt;enumeration value="CONVENCIONAL"/&gt;
 *     &lt;enumeration value="EXECUTIVO"/&gt;
 *     &lt;enumeration value="LEITO"/&gt;
 *     &lt;enumeration value="LEITO_CAMA"/&gt;
 *     &lt;enumeration value="SEMI_LEITO"/&gt;
 *     &lt;enumeration value="SEMILEITO"/&gt;
 *     &lt;enumeration value="ESTRUTURAL"/&gt;
 *     &lt;enumeration value="LEITO_INDIVIDUAL"/&gt;
 *     &lt;enumeration value="LEITO_TOTAL_CONJUGADO"/&gt;
 *     &lt;enumeration value="PREMIUM"/&gt;
 *     &lt;enumeration value="SEMI_LEITO_CONFORTO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "classeRodoviario")
@XmlEnum
public enum ClasseRodoviario {

    PRIMEIRA_CLASSE,
    CONVENCIONAL,
    EXECUTIVO,
    LEITO,
    LEITO_CAMA,
    SEMI_LEITO,
    SEMILEITO,
    ESTRUTURAL,
    LEITO_INDIVIDUAL,
    LEITO_TOTAL_CONJUGADO,
    PREMIUM,
    SEMI_LEITO_CONFORTO;

    public String value() {
        return name();
    }

    public static ClasseRodoviario fromValue(String v) {
        return valueOf(v);
    }

}
