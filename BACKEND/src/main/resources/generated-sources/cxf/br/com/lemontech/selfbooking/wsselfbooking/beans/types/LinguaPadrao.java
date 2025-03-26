
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de linguaPadrao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <pre>
 * &lt;simpleType name="linguaPadrao"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PORTUGUES"/&gt;
 *     &lt;enumeration value="INGLES"/&gt;
 *     &lt;enumeration value="ESPANHOL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "linguaPadrao")
@XmlEnum
public enum LinguaPadrao {

    PORTUGUES,
    INGLES,
    ESPANHOL;

    public String value() {
        return name();
    }

    public static LinguaPadrao fromValue(String v) {
        return valueOf(v);
    }

}
