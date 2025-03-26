
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de resultadoAcao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="resultadoAcao"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SUCESSO"/&gt;
 *     &lt;enumeration value="ERRO"/&gt;
 *     &lt;enumeration value="ALERTA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "resultadoAcao")
@XmlEnum
public enum ResultadoAcao {

    SUCESSO,
    ERRO,
    ALERTA;

    public String value() {
        return name();
    }

    public static ResultadoAcao fromValue(String v) {
        return valueOf(v);
    }

}
